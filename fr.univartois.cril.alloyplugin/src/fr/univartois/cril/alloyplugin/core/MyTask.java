package fr.univartois.cril.alloyplugin.core;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.WorkerEngine.WorkerCallback;
import edu.mit.csail.sdg.alloy4.WorkerEngine.WorkerTask;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;

public class MyTask implements WorkerTask {

   private static final long serialVersionUID = 0;

   private String inFile, outFile;

   private int command;
   
   private A4Options opt;
   	   
   public MyTask(String inputFilename, String outputFilename, int commandNumber, A4Options opt) {
      inFile = inputFilename;
      outFile = outputFilename;
      command = commandNumber;
      this.opt = opt;
   }
   
   public void run(final WorkerCallback out) throws Exception {
      try {
    	  A4Reporter rep = new A4Reporter() {
              @Override public void translate(String solver, int b, int m, int sk, int sym) { out.callback("Translating...:"+solver+":"+b+":"+m+":"+sk+":"+sym); }
              @Override public void solve(int vars, int total, int clauses) { out.callback("Solving...:"+vars+":" + total + ":" + clauses);}
              @Override public void resultSAT(Object command, long solvingtime, Object solution) { Command cmd = (Command)command; out.callback("Satisfiable:"+(cmd.expects)+":"+cmd.check+":"+solvingtime);}
              @Override public void resultUNSAT(Object command, long solvingtime, Object solution) { Command cmd = (Command)command; out.callback("Unsatisfiable:"+(cmd.expects)+":"+cmd.check+":"+solvingtime);}
           };
    	 out.callback("World"); 
    	 CompModule world = CompUtil.parseEverything_fromFile(rep, null, inFile);
         out.callback("Commands"); 
         Command c = world.getAllCommands().get(command);
         out.callback(inFile);
         out.callback(outFile);
         out.callback(command);
         A4Solution sol = TranslateAlloyToKodkod.execute_command(rep, world.getAllReachableSigs(), c, opt);
         if (sol.satisfiable()) {
            sol.writeXML(outFile);
         }
         out.done();
      } catch(Exception ex) {
    	  ex.printStackTrace();
         out.callback(ex);
         out.fail();
      }
   }
   
//   public static void main(String... args) throws Exception {
//      MyTask task = new MyTask("/home/felix/sample.als", "/home/felix/sampleOutput.xml", 0); // We should have first parsed the model to confirm there really is a command number 0.
//      WorkerCallback cb = new WorkerCallback() {
//         public void callback(Object msg) { System.out.println(msg); System.out.flush(); }
//         public void done()               { System.out.println("All done."); }
//         public void fail()               { System.out.println("Fatal error."); }
//      };
//      WorkerEngine.run(task, 1024, 1024, "", cb);
//      Thread.sleep(100); // One hundred seconds wait
//      if (WorkerEngine.isBusy()) {
//         WorkerEngine.stop();
//         System.out.println("SubJVM timed out!"); System.out.flush();
//      }
//   }
}
