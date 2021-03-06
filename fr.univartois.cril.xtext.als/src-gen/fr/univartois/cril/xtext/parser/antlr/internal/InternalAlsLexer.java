package fr.univartois.cril.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlsLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int RULE_ML_COMMENT=9;
    public static final int T45=45;
    public static final int T44=44;
    public static final int RULE_STRING=8;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=4;
    public static final int T61=61;
    public static final int T60=60;
    public static final int RULE_SL_COMMENT=7;
    public static final int Tokens=91;
    public static final int T90=90;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T81=81;
    public static final int T16=16;
    public static final int T80=80;
    public static final int T17=17;
    public static final int T83=83;
    public static final int T18=18;
    public static final int T82=82;
    public static final int RULE_NEGATIVE_INTEGER=6;
    public static final int T19=19;
    public InternalAlsLexer() {;} 
    public InternalAlsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:10:5: ( 'module' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:10:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:11:5: ( 'exactly' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:11:7: 'exactly'
            {
            match("exactly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:12:5: ( 'private' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:12:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:13:5: ( '/' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:13:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:14:5: ( 'as' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:14:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:15:5: ( 'fun' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:15:7: 'fun'
            {
            match("fun"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:16:5: ( 'pred' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:16:7: 'pred'
            {
            match("pred"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:17:5: ( ':' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:17:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:18:5: ( 'run' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:18:7: 'run'
            {
            match("run"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:19:5: ( 'check' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:19:7: 'check'
            {
            match("check"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:20:5: ( 'for' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:20:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:21:5: ( 'but' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:21:7: 'but'
            {
            match("but"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:22:5: ( 'expect' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:22:7: 'expect'
            {
            match("expect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:23:5: ( 'this' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:23:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:24:5: ( 'int' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:24:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:25:5: ( 'seq' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:25:7: 'seq'
            {
            match("seq"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:26:5: ( '=' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:26:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:27:5: ( 'sig' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:27:7: 'sig'
            {
            match("sig"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:28:5: ( '{' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:28:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:29:5: ( ',' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:29:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:30:5: ( '}' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:30:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:31:5: ( 'abstract' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:31:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:32:5: ( 'lone' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:32:7: 'lone'
            {
            match("lone"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:33:5: ( 'one' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:33:7: 'one'
            {
            match("one"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:34:5: ( 'some' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:34:7: 'some'
            {
            match("some"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:35:5: ( 'extends' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:35:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:36:5: ( 'in' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:36:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:37:5: ( '+' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:37:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:38:5: ( '!' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:38:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:39:5: ( 'not' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:39:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:40:5: ( '=>' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:40:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:41:5: ( 'implies' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:41:7: 'implies'
            {
            match("implies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:42:5: ( 'else' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:42:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:43:5: ( '[' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:43:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:44:5: ( ']' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:44:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:45:5: ( '(' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:45:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:46:5: ( ')' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:46:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:47:5: ( 'let' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:47:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:48:5: ( 'none' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:48:7: 'none'
            {
            match("none"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:49:5: ( 'iden' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:49:7: 'iden'
            {
            match("iden"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:50:5: ( 'univ' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:50:7: 'univ'
            {
            match("univ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:51:5: ( 'Int' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:51:7: 'Int'
            {
            match("Int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:52:5: ( 'seq/Int' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:52:7: 'seq/Int'
            {
            match("seq/Int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:53:5: ( '@' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:53:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:54:5: ( 'disj' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:54:7: 'disj'
            {
            match("disj"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:55:5: ( 'all' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:55:7: 'all'
            {
            match("all"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:56:5: ( 'sum' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:56:7: 'sum'
            {
            match("sum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:57:5: ( '||' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:57:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:58:5: ( 'or' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:58:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:59:5: ( '&&' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:59:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:60:5: ( 'and' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:60:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:61:5: ( '&' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:61:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:62:5: ( '<=>' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:62:7: '<=>'
            {
            match("<=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:63:5: ( 'iff' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:63:7: 'iff'
            {
            match("iff"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:64:5: ( '-' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:64:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:65:5: ( '++' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:65:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:66:5: ( '<:' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:66:7: '<:'
            {
            match("<:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:67:5: ( ':>' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:67:7: ':>'
            {
            match(":>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:68:5: ( '<<' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:68:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:69:5: ( '>>' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:69:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:70:5: ( '>>>' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:70:7: '>>>'
            {
            match(">>>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:71:5: ( 'set' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:71:7: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:72:5: ( '#' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:72:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:73:5: ( '~' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:73:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:74:5: ( '*' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:74:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:75:5: ( '^' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:75:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:76:5: ( 'no' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:76:7: 'no'
            {
            match("no"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:77:5: ( '<' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:77:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:78:5: ( '>' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:78:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:79:5: ( '=<' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:79:7: '=<'
            {
            match("=<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:80:5: ( '<=' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:80:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:81:5: ( '>=' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:81:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:82:5: ( '->' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:82:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:83:5: ( '|' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:83:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:84:5: ( 'open' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:84:7: 'open'
            {
            match("open"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:85:5: ( 'fact' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:85:7: 'fact'
            {
            match("fact"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:86:5: ( 'assert' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:86:7: 'assert'
            {
            match("assert"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:87:5: ( 'enum' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:87:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:88:5: ( '.' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:88:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start RULE_NEGATIVE_INTEGER
    public final void mRULE_NEGATIVE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_NEGATIVE_INTEGER;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7754:23: ( '-' RULE_INT )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7754:25: '-' RULE_INT
            {
            match('-'); 
            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NEGATIVE_INTEGER

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:17: ( ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                alt5=1;
            }
            else if ( (LA5_0=='-') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7756:19: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? | '--' ( options {greedy=false; } : . )* '\\n' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:20: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
                    {
                    match("//"); 

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:25: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:25: ~ ( ( '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:41: ( ( '\\r' )? '\\n' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:42: ( '\\r' )? '\\n'
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:42: ( '\\r' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='\r') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:42: '\\r'
                                    {
                                    match('\r'); 

                                    }
                                    break;

                            }

                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:55: '--' ( options {greedy=false; } : . )* '\\n'
                    {
                    match("--"); 

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:60: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\n') ) {
                            alt4=2;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\uFFFE')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7756:88: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7758:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\'' | '\"' )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7758:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\'' | '\"' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7758:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7758:69: ( '\\'' | '\"' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"'||LA7_0=='\'') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:
            	    {
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7760:10: ( ( '0' .. '9' )+ )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7760:12: ( '0' .. '9' )+
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7760:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7760:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7762:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFE')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7762:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7764:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7764:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7764:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7764:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7766:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7766:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7766:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7768:16: ( . )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7768:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | RULE_NEGATIVE_INTEGER | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=87;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='m') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='o') ) {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='d') ) {
                    int LA14_122 = input.LA(4);

                    if ( (LA14_122=='u') ) {
                        int LA14_167 = input.LA(5);

                        if ( (LA14_167=='l') ) {
                            int LA14_205 = input.LA(6);

                            if ( (LA14_205=='e') ) {
                                int LA14_226 = input.LA(7);

                                if ( (LA14_226=='\"'||LA14_226=='\''||(LA14_226>='0' && LA14_226<='9')||(LA14_226>='A' && LA14_226<='Z')||LA14_226=='_'||(LA14_226>='a' && LA14_226<='z')) ) {
                                    alt14=82;
                                }
                                else {
                                    alt14=1;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='s') ) {
                    int LA14_123 = input.LA(4);

                    if ( (LA14_123=='e') ) {
                        int LA14_168 = input.LA(5);

                        if ( (LA14_168=='\"'||LA14_168=='\''||(LA14_168>='0' && LA14_168<='9')||(LA14_168>='A' && LA14_168<='Z')||LA14_168=='_'||(LA14_168>='a' && LA14_168<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA14_124 = input.LA(4);

                    if ( (LA14_124=='c') ) {
                        int LA14_169 = input.LA(5);

                        if ( (LA14_169=='t') ) {
                            int LA14_207 = input.LA(6);

                            if ( (LA14_207=='l') ) {
                                int LA14_227 = input.LA(7);

                                if ( (LA14_227=='y') ) {
                                    int LA14_236 = input.LA(8);

                                    if ( (LA14_236=='\"'||LA14_236=='\''||(LA14_236>='0' && LA14_236<='9')||(LA14_236>='A' && LA14_236<='Z')||LA14_236=='_'||(LA14_236>='a' && LA14_236<='z')) ) {
                                        alt14=82;
                                    }
                                    else {
                                        alt14=2;}
                                }
                                else {
                                    alt14=82;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                case 'p':
                    {
                    int LA14_125 = input.LA(4);

                    if ( (LA14_125=='e') ) {
                        int LA14_170 = input.LA(5);

                        if ( (LA14_170=='c') ) {
                            int LA14_208 = input.LA(6);

                            if ( (LA14_208=='t') ) {
                                int LA14_228 = input.LA(7);

                                if ( (LA14_228=='\"'||LA14_228=='\''||(LA14_228>='0' && LA14_228<='9')||(LA14_228>='A' && LA14_228<='Z')||LA14_228=='_'||(LA14_228>='a' && LA14_228<='z')) ) {
                                    alt14=82;
                                }
                                else {
                                    alt14=13;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                case 't':
                    {
                    int LA14_126 = input.LA(4);

                    if ( (LA14_126=='e') ) {
                        int LA14_171 = input.LA(5);

                        if ( (LA14_171=='n') ) {
                            int LA14_209 = input.LA(6);

                            if ( (LA14_209=='d') ) {
                                int LA14_229 = input.LA(7);

                                if ( (LA14_229=='s') ) {
                                    int LA14_238 = input.LA(8);

                                    if ( (LA14_238=='\"'||LA14_238=='\''||(LA14_238>='0' && LA14_238<='9')||(LA14_238>='A' && LA14_238<='Z')||LA14_238=='_'||(LA14_238>='a' && LA14_238<='z')) ) {
                                        alt14=82;
                                    }
                                    else {
                                        alt14=26;}
                                }
                                else {
                                    alt14=82;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                default:
                    alt14=82;}

                }
                break;
            case 'n':
                {
                int LA14_51 = input.LA(3);

                if ( (LA14_51=='u') ) {
                    int LA14_127 = input.LA(4);

                    if ( (LA14_127=='m') ) {
                        int LA14_172 = input.LA(5);

                        if ( (LA14_172=='\"'||LA14_172=='\''||(LA14_172>='0' && LA14_172<='9')||(LA14_172>='A' && LA14_172<='Z')||LA14_172=='_'||(LA14_172>='a' && LA14_172<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=78;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0=='p') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='r') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA14_128 = input.LA(4);

                    if ( (LA14_128=='d') ) {
                        int LA14_173 = input.LA(5);

                        if ( (LA14_173=='\"'||LA14_173=='\''||(LA14_173>='0' && LA14_173<='9')||(LA14_173>='A' && LA14_173<='Z')||LA14_173=='_'||(LA14_173>='a' && LA14_173<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=7;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                case 'i':
                    {
                    int LA14_129 = input.LA(4);

                    if ( (LA14_129=='v') ) {
                        int LA14_174 = input.LA(5);

                        if ( (LA14_174=='a') ) {
                            int LA14_212 = input.LA(6);

                            if ( (LA14_212=='t') ) {
                                int LA14_230 = input.LA(7);

                                if ( (LA14_230=='e') ) {
                                    int LA14_239 = input.LA(8);

                                    if ( (LA14_239=='\"'||LA14_239=='\''||(LA14_239>='0' && LA14_239<='9')||(LA14_239>='A' && LA14_239<='Z')||LA14_239=='_'||(LA14_239>='a' && LA14_239<='z')) ) {
                                        alt14=82;
                                    }
                                    else {
                                        alt14=3;}
                                }
                                else {
                                    alt14=82;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                default:
                    alt14=82;}

            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=85;
                }
                break;
            case '/':
                {
                alt14=81;
                }
                break;
            default:
                alt14=4;}

        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='s') ) {
                    int LA14_130 = input.LA(4);

                    if ( (LA14_130=='t') ) {
                        int LA14_175 = input.LA(5);

                        if ( (LA14_175=='r') ) {
                            int LA14_213 = input.LA(6);

                            if ( (LA14_213=='a') ) {
                                int LA14_231 = input.LA(7);

                                if ( (LA14_231=='c') ) {
                                    int LA14_240 = input.LA(8);

                                    if ( (LA14_240=='t') ) {
                                        int LA14_246 = input.LA(9);

                                        if ( (LA14_246=='\"'||LA14_246=='\''||(LA14_246>='0' && LA14_246<='9')||(LA14_246>='A' && LA14_246<='Z')||LA14_246=='_'||(LA14_246>='a' && LA14_246<='z')) ) {
                                            alt14=82;
                                        }
                                        else {
                                            alt14=22;}
                                    }
                                    else {
                                        alt14=82;}
                                }
                                else {
                                    alt14=82;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'l':
                {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='l') ) {
                    int LA14_131 = input.LA(4);

                    if ( (LA14_131=='\"'||LA14_131=='\''||(LA14_131>='0' && LA14_131<='9')||(LA14_131>='A' && LA14_131<='Z')||LA14_131=='_'||(LA14_131>='a' && LA14_131<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'n':
                {
                int LA14_58 = input.LA(3);

                if ( (LA14_58=='d') ) {
                    int LA14_132 = input.LA(4);

                    if ( (LA14_132=='\"'||LA14_132=='\''||(LA14_132>='0' && LA14_132<='9')||(LA14_132>='A' && LA14_132<='Z')||LA14_132=='_'||(LA14_132>='a' && LA14_132<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=51;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 's':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA14_133 = input.LA(4);

                    if ( (LA14_133=='e') ) {
                        int LA14_178 = input.LA(5);

                        if ( (LA14_178=='r') ) {
                            int LA14_214 = input.LA(6);

                            if ( (LA14_214=='t') ) {
                                int LA14_232 = input.LA(7);

                                if ( (LA14_232=='\"'||LA14_232=='\''||(LA14_232>='0' && LA14_232<='9')||(LA14_232>='A' && LA14_232<='Z')||LA14_232=='_'||(LA14_232>='a' && LA14_232<='z')) ) {
                                    alt14=82;
                                }
                                else {
                                    alt14=77;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                case '\"':
                case '\'':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt14=82;
                    }
                    break;
                default:
                    alt14=5;}

                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA14_60 = input.LA(3);

                if ( (LA14_60=='r') ) {
                    int LA14_135 = input.LA(4);

                    if ( (LA14_135=='\"'||LA14_135=='\''||(LA14_135>='0' && LA14_135<='9')||(LA14_135>='A' && LA14_135<='Z')||LA14_135=='_'||(LA14_135>='a' && LA14_135<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=11;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'u':
                {
                int LA14_61 = input.LA(3);

                if ( (LA14_61=='n') ) {
                    int LA14_136 = input.LA(4);

                    if ( (LA14_136=='\"'||LA14_136=='\''||(LA14_136>='0' && LA14_136<='9')||(LA14_136>='A' && LA14_136<='Z')||LA14_136=='_'||(LA14_136>='a' && LA14_136<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=6;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'a':
                {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='c') ) {
                    int LA14_137 = input.LA(4);

                    if ( (LA14_137=='t') ) {
                        int LA14_181 = input.LA(5);

                        if ( (LA14_181=='\"'||LA14_181=='\''||(LA14_181>='0' && LA14_181<='9')||(LA14_181>='A' && LA14_181<='Z')||LA14_181=='_'||(LA14_181>='a' && LA14_181<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=76;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0==':') ) {
            int LA14_7 = input.LA(2);

            if ( (LA14_7=='>') ) {
                alt14=58;
            }
            else {
                alt14=8;}
        }
        else if ( (LA14_0=='r') ) {
            int LA14_8 = input.LA(2);

            if ( (LA14_8=='u') ) {
                int LA14_65 = input.LA(3);

                if ( (LA14_65=='n') ) {
                    int LA14_138 = input.LA(4);

                    if ( (LA14_138=='\"'||LA14_138=='\''||(LA14_138>='0' && LA14_138<='9')||(LA14_138>='A' && LA14_138<='Z')||LA14_138=='_'||(LA14_138>='a' && LA14_138<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=9;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='c') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9=='h') ) {
                int LA14_66 = input.LA(3);

                if ( (LA14_66=='e') ) {
                    int LA14_139 = input.LA(4);

                    if ( (LA14_139=='c') ) {
                        int LA14_183 = input.LA(5);

                        if ( (LA14_183=='k') ) {
                            int LA14_216 = input.LA(6);

                            if ( (LA14_216=='\"'||LA14_216=='\''||(LA14_216>='0' && LA14_216<='9')||(LA14_216>='A' && LA14_216<='Z')||LA14_216=='_'||(LA14_216>='a' && LA14_216<='z')) ) {
                                alt14=82;
                            }
                            else {
                                alt14=10;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='b') ) {
            int LA14_10 = input.LA(2);

            if ( (LA14_10=='u') ) {
                int LA14_67 = input.LA(3);

                if ( (LA14_67=='t') ) {
                    int LA14_140 = input.LA(4);

                    if ( (LA14_140=='\"'||LA14_140=='\''||(LA14_140>='0' && LA14_140<='9')||(LA14_140>='A' && LA14_140<='Z')||LA14_140=='_'||(LA14_140>='a' && LA14_140<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=12;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='t') ) {
            int LA14_11 = input.LA(2);

            if ( (LA14_11=='h') ) {
                int LA14_68 = input.LA(3);

                if ( (LA14_68=='i') ) {
                    int LA14_141 = input.LA(4);

                    if ( (LA14_141=='s') ) {
                        int LA14_185 = input.LA(5);

                        if ( (LA14_185=='\"'||LA14_185=='\''||(LA14_185>='0' && LA14_185<='9')||(LA14_185>='A' && LA14_185<='Z')||LA14_185=='_'||(LA14_185>='a' && LA14_185<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=14;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA14_142 = input.LA(4);

                    if ( (LA14_142=='\"'||LA14_142=='\''||(LA14_142>='0' && LA14_142<='9')||(LA14_142>='A' && LA14_142<='Z')||LA14_142=='_'||(LA14_142>='a' && LA14_142<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=15;}
                    }
                    break;
                case '\"':
                case '\'':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt14=82;
                    }
                    break;
                default:
                    alt14=27;}

                }
                break;
            case 'm':
                {
                int LA14_70 = input.LA(3);

                if ( (LA14_70=='p') ) {
                    int LA14_144 = input.LA(4);

                    if ( (LA14_144=='l') ) {
                        int LA14_187 = input.LA(5);

                        if ( (LA14_187=='i') ) {
                            int LA14_218 = input.LA(6);

                            if ( (LA14_218=='e') ) {
                                int LA14_234 = input.LA(7);

                                if ( (LA14_234=='s') ) {
                                    int LA14_242 = input.LA(8);

                                    if ( (LA14_242=='\"'||LA14_242=='\''||(LA14_242>='0' && LA14_242<='9')||(LA14_242>='A' && LA14_242<='Z')||LA14_242=='_'||(LA14_242>='a' && LA14_242<='z')) ) {
                                        alt14=82;
                                    }
                                    else {
                                        alt14=32;}
                                }
                                else {
                                    alt14=82;}
                            }
                            else {
                                alt14=82;}
                        }
                        else {
                            alt14=82;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'd':
                {
                int LA14_71 = input.LA(3);

                if ( (LA14_71=='e') ) {
                    int LA14_145 = input.LA(4);

                    if ( (LA14_145=='n') ) {
                        int LA14_188 = input.LA(5);

                        if ( (LA14_188=='\"'||LA14_188=='\''||(LA14_188>='0' && LA14_188<='9')||(LA14_188>='A' && LA14_188<='Z')||LA14_188=='_'||(LA14_188>='a' && LA14_188<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=40;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'f':
                {
                int LA14_72 = input.LA(3);

                if ( (LA14_72=='f') ) {
                    int LA14_146 = input.LA(4);

                    if ( (LA14_146=='\"'||LA14_146=='\''||(LA14_146>='0' && LA14_146<='9')||(LA14_146>='A' && LA14_146<='Z')||LA14_146=='_'||(LA14_146>='a' && LA14_146<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=54;}
                }
                else {
                    alt14=82;}
                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA14_73 = input.LA(3);

                if ( (LA14_73=='m') ) {
                    int LA14_147 = input.LA(4);

                    if ( (LA14_147=='e') ) {
                        int LA14_190 = input.LA(5);

                        if ( (LA14_190=='\"'||LA14_190=='\''||(LA14_190>='0' && LA14_190<='9')||(LA14_190>='A' && LA14_190<='Z')||LA14_190=='_'||(LA14_190>='a' && LA14_190<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'u':
                {
                int LA14_74 = input.LA(3);

                if ( (LA14_74=='m') ) {
                    int LA14_148 = input.LA(4);

                    if ( (LA14_148=='\"'||LA14_148=='\''||(LA14_148>='0' && LA14_148<='9')||(LA14_148>='A' && LA14_148<='Z')||LA14_148=='_'||(LA14_148>='a' && LA14_148<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=47;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA14_149 = input.LA(4);

                    if ( (LA14_149=='\"'||LA14_149=='\''||(LA14_149>='0' && LA14_149<='9')||(LA14_149>='A' && LA14_149<='Z')||LA14_149=='_'||(LA14_149>='a' && LA14_149<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=62;}
                    }
                    break;
                case 'q':
                    {
                    switch ( input.LA(4) ) {
                    case '/':
                        {
                        alt14=43;
                        }
                        break;
                    case '\"':
                    case '\'':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt14=82;
                        }
                        break;
                    default:
                        alt14=16;}

                    }
                    break;
                default:
                    alt14=82;}

                }
                break;
            case 'i':
                {
                int LA14_76 = input.LA(3);

                if ( (LA14_76=='g') ) {
                    int LA14_151 = input.LA(4);

                    if ( (LA14_151=='\"'||LA14_151=='\''||(LA14_151>='0' && LA14_151<='9')||(LA14_151>='A' && LA14_151<='Z')||LA14_151=='_'||(LA14_151>='a' && LA14_151<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=18;}
                }
                else {
                    alt14=82;}
                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0=='=') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt14=31;
                }
                break;
            case '<':
                {
                alt14=70;
                }
                break;
            default:
                alt14=17;}

        }
        else if ( (LA14_0=='{') ) {
            alt14=19;
        }
        else if ( (LA14_0==',') ) {
            alt14=20;
        }
        else if ( (LA14_0=='}') ) {
            alt14=21;
        }
        else if ( (LA14_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA14_83 = input.LA(3);

                if ( (LA14_83=='n') ) {
                    int LA14_152 = input.LA(4);

                    if ( (LA14_152=='e') ) {
                        int LA14_196 = input.LA(5);

                        if ( (LA14_196=='\"'||LA14_196=='\''||(LA14_196>='0' && LA14_196<='9')||(LA14_196>='A' && LA14_196<='Z')||LA14_196=='_'||(LA14_196>='a' && LA14_196<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'e':
                {
                int LA14_84 = input.LA(3);

                if ( (LA14_84=='t') ) {
                    int LA14_153 = input.LA(4);

                    if ( (LA14_153=='\"'||LA14_153=='\''||(LA14_153>='0' && LA14_153<='9')||(LA14_153>='A' && LA14_153<='Z')||LA14_153=='_'||(LA14_153>='a' && LA14_153<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=82;}
                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA14_85 = input.LA(3);

                if ( (LA14_85=='e') ) {
                    int LA14_154 = input.LA(4);

                    if ( (LA14_154=='\"'||LA14_154=='\''||(LA14_154>='0' && LA14_154<='9')||(LA14_154>='A' && LA14_154<='Z')||LA14_154=='_'||(LA14_154>='a' && LA14_154<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=82;}
                }
                break;
            case 'r':
                {
                int LA14_86 = input.LA(3);

                if ( (LA14_86=='\"'||LA14_86=='\''||(LA14_86>='0' && LA14_86<='9')||(LA14_86>='A' && LA14_86<='Z')||LA14_86=='_'||(LA14_86>='a' && LA14_86<='z')) ) {
                    alt14=82;
                }
                else {
                    alt14=49;}
                }
                break;
            case 'p':
                {
                int LA14_87 = input.LA(3);

                if ( (LA14_87=='e') ) {
                    int LA14_156 = input.LA(4);

                    if ( (LA14_156=='n') ) {
                        int LA14_199 = input.LA(5);

                        if ( (LA14_199=='\"'||LA14_199=='\''||(LA14_199>='0' && LA14_199<='9')||(LA14_199>='A' && LA14_199<='Z')||LA14_199=='_'||(LA14_199>='a' && LA14_199<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=75;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
                }
                break;
            default:
                alt14=82;}

        }
        else if ( (LA14_0=='+') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='+') ) {
                alt14=56;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='!') ) {
            alt14=29;
        }
        else if ( (LA14_0=='n') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='o') ) {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA14_157 = input.LA(4);

                    if ( (LA14_157=='e') ) {
                        int LA14_200 = input.LA(5);

                        if ( (LA14_200=='\"'||LA14_200=='\''||(LA14_200>='0' && LA14_200<='9')||(LA14_200>='A' && LA14_200<='Z')||LA14_200=='_'||(LA14_200>='a' && LA14_200<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=39;}
                    }
                    else {
                        alt14=82;}
                    }
                    break;
                case 't':
                    {
                    int LA14_158 = input.LA(4);

                    if ( (LA14_158=='\"'||LA14_158=='\''||(LA14_158>='0' && LA14_158<='9')||(LA14_158>='A' && LA14_158<='Z')||LA14_158=='_'||(LA14_158>='a' && LA14_158<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=30;}
                    }
                    break;
                case '\"':
                case '\'':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt14=82;
                    }
                    break;
                default:
                    alt14=67;}

            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='[') ) {
            alt14=34;
        }
        else if ( (LA14_0==']') ) {
            alt14=35;
        }
        else if ( (LA14_0=='(') ) {
            alt14=36;
        }
        else if ( (LA14_0==')') ) {
            alt14=37;
        }
        else if ( (LA14_0=='u') ) {
            int LA14_27 = input.LA(2);

            if ( (LA14_27=='n') ) {
                int LA14_96 = input.LA(3);

                if ( (LA14_96=='i') ) {
                    int LA14_160 = input.LA(4);

                    if ( (LA14_160=='v') ) {
                        int LA14_202 = input.LA(5);

                        if ( (LA14_202=='\"'||LA14_202=='\''||(LA14_202>='0' && LA14_202<='9')||(LA14_202>='A' && LA14_202<='Z')||LA14_202=='_'||(LA14_202>='a' && LA14_202<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=41;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='I') ) {
            int LA14_28 = input.LA(2);

            if ( (LA14_28=='n') ) {
                int LA14_97 = input.LA(3);

                if ( (LA14_97=='t') ) {
                    int LA14_161 = input.LA(4);

                    if ( (LA14_161=='\"'||LA14_161=='\''||(LA14_161>='0' && LA14_161<='9')||(LA14_161>='A' && LA14_161<='Z')||LA14_161=='_'||(LA14_161>='a' && LA14_161<='z')) ) {
                        alt14=82;
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='@') ) {
            alt14=44;
        }
        else if ( (LA14_0=='d') ) {
            int LA14_30 = input.LA(2);

            if ( (LA14_30=='i') ) {
                int LA14_99 = input.LA(3);

                if ( (LA14_99=='s') ) {
                    int LA14_162 = input.LA(4);

                    if ( (LA14_162=='j') ) {
                        int LA14_204 = input.LA(5);

                        if ( (LA14_204=='\"'||LA14_204=='\''||(LA14_204>='0' && LA14_204<='9')||(LA14_204>='A' && LA14_204<='Z')||LA14_204=='_'||(LA14_204>='a' && LA14_204<='z')) ) {
                            alt14=82;
                        }
                        else {
                            alt14=45;}
                    }
                    else {
                        alt14=82;}
                }
                else {
                    alt14=82;}
            }
            else {
                alt14=82;}
        }
        else if ( (LA14_0=='|') ) {
            int LA14_31 = input.LA(2);

            if ( (LA14_31=='|') ) {
                alt14=48;
            }
            else {
                alt14=74;}
        }
        else if ( (LA14_0=='&') ) {
            int LA14_32 = input.LA(2);

            if ( (LA14_32=='&') ) {
                alt14=50;
            }
            else {
                alt14=52;}
        }
        else if ( (LA14_0=='<') ) {
            switch ( input.LA(2) ) {
            case '=':
                {
                int LA14_104 = input.LA(3);

                if ( (LA14_104=='>') ) {
                    alt14=53;
                }
                else {
                    alt14=71;}
                }
                break;
            case '<':
                {
                alt14=59;
                }
                break;
            case ':':
                {
                alt14=57;
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='-') ) {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt14=81;
                }
                break;
            case '>':
                {
                alt14=73;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt14=80;
                }
                break;
            default:
                alt14=55;}

        }
        else if ( (LA14_0=='>') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                int LA14_111 = input.LA(3);

                if ( (LA14_111=='>') ) {
                    alt14=61;
                }
                else {
                    alt14=60;}
                }
                break;
            case '=':
                {
                alt14=72;
                }
                break;
            default:
                alt14=69;}

        }
        else if ( (LA14_0=='#') ) {
            alt14=63;
        }
        else if ( (LA14_0=='~') ) {
            alt14=64;
        }
        else if ( (LA14_0=='*') ) {
            alt14=65;
        }
        else if ( (LA14_0=='^') ) {
            alt14=66;
        }
        else if ( (LA14_0=='.') ) {
            alt14=79;
        }
        else if ( ((LA14_0>='A' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='q'||(LA14_0>='v' && LA14_0<='z')) ) {
            alt14=82;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=83;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_43 = input.LA(2);

            if ( ((LA14_43>='\u0000' && LA14_43<='\uFFFE')) ) {
                alt14=84;
            }
            else {
                alt14=87;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_44 = input.LA(2);

            if ( ((LA14_44>='\u0000' && LA14_44<='\uFFFE')) ) {
                alt14=84;
            }
            else {
                alt14=87;}
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=86;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='$' && LA14_0<='%')||LA14_0==';'||LA14_0=='?'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='\u007F' && LA14_0<='\uFFFE')) ) {
            alt14=87;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | RULE_NEGATIVE_INTEGER | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:162: T50
                {
                mT50(); 

                }
                break;
            case 40 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:166: T51
                {
                mT51(); 

                }
                break;
            case 41 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:170: T52
                {
                mT52(); 

                }
                break;
            case 42 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:174: T53
                {
                mT53(); 

                }
                break;
            case 43 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:178: T54
                {
                mT54(); 

                }
                break;
            case 44 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:182: T55
                {
                mT55(); 

                }
                break;
            case 45 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:186: T56
                {
                mT56(); 

                }
                break;
            case 46 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:190: T57
                {
                mT57(); 

                }
                break;
            case 47 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:194: T58
                {
                mT58(); 

                }
                break;
            case 48 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:198: T59
                {
                mT59(); 

                }
                break;
            case 49 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:202: T60
                {
                mT60(); 

                }
                break;
            case 50 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:206: T61
                {
                mT61(); 

                }
                break;
            case 51 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:210: T62
                {
                mT62(); 

                }
                break;
            case 52 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:214: T63
                {
                mT63(); 

                }
                break;
            case 53 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:218: T64
                {
                mT64(); 

                }
                break;
            case 54 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:222: T65
                {
                mT65(); 

                }
                break;
            case 55 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:226: T66
                {
                mT66(); 

                }
                break;
            case 56 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:230: T67
                {
                mT67(); 

                }
                break;
            case 57 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:234: T68
                {
                mT68(); 

                }
                break;
            case 58 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:238: T69
                {
                mT69(); 

                }
                break;
            case 59 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:242: T70
                {
                mT70(); 

                }
                break;
            case 60 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:246: T71
                {
                mT71(); 

                }
                break;
            case 61 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:250: T72
                {
                mT72(); 

                }
                break;
            case 62 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:254: T73
                {
                mT73(); 

                }
                break;
            case 63 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:258: T74
                {
                mT74(); 

                }
                break;
            case 64 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:262: T75
                {
                mT75(); 

                }
                break;
            case 65 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:266: T76
                {
                mT76(); 

                }
                break;
            case 66 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:270: T77
                {
                mT77(); 

                }
                break;
            case 67 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:274: T78
                {
                mT78(); 

                }
                break;
            case 68 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:278: T79
                {
                mT79(); 

                }
                break;
            case 69 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:282: T80
                {
                mT80(); 

                }
                break;
            case 70 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:286: T81
                {
                mT81(); 

                }
                break;
            case 71 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:290: T82
                {
                mT82(); 

                }
                break;
            case 72 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:294: T83
                {
                mT83(); 

                }
                break;
            case 73 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:298: T84
                {
                mT84(); 

                }
                break;
            case 74 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:302: T85
                {
                mT85(); 

                }
                break;
            case 75 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:306: T86
                {
                mT86(); 

                }
                break;
            case 76 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:310: T87
                {
                mT87(); 

                }
                break;
            case 77 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:314: T88
                {
                mT88(); 

                }
                break;
            case 78 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:318: T89
                {
                mT89(); 

                }
                break;
            case 79 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:322: T90
                {
                mT90(); 

                }
                break;
            case 80 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:326: RULE_NEGATIVE_INTEGER
                {
                mRULE_NEGATIVE_INTEGER(); 

                }
                break;
            case 81 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:348: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:364: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 83 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:372: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 84 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:381: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 85 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:393: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 86 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:409: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 87 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1:417: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}