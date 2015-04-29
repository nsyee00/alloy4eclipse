# Editor #

  * Just hover an error or warning marker to see the message instead of going to the problems view.
  * **CTRL-SPACE allow the completion of all Alloy 4 keywords and most identifiers used in the spec file**.

# Commands #

  * A double click on a command in the commands view will execute that command.
  * Using the contextual Launch command(s) in the outline view will launch the selected commands.
  * It is possible to select multiple commands to run in the outline view.
  * Using Run as ... Alloy Specification on a .als file will run all the commands in that file.
  * Run as/Launch commands are stored in the run menu.
  * **The latest command(s) can be re-executed using the Eclipse "Run last launched" shortcut.(CTRL-F11)**

# Compiling and tracking errors #

  * The current alloy file will be compiled as it is saved.  Allows much more rapid feedback of errors.

  * Only a single error is usually shown, due to the way the Alloy compiler works.  Correct this to see the next error.  Multiple warnings will be shown, however.

# Errors are not detected properly #

Users of the initial versions of the plugin (pre 0.0.6 releases) might notice that the "compile on save" feature is not working properly or at all in their existing projects.
This is due to the way "compile on save" feature was implemented in the initial releases of the plugin: it was not using the expected Eclipse building feature.

An Alloy Builder was introduced in release 0.0.6.

You can add the Alloy Builder to an older Alloy project by using the "Add/Remove Alloy Project Nature" in the contextual popup menu of the project.

You can check that your project has the correct builders by taking a look at the builders tab in the project properties (available from the project contextual menu too).

# Applying a visualization theme #

Since release 0.1.5, it is possible to apply a visualization theme to Alloy graphs.
The theme can be loaded thanks to the editor menu available on the main menu bar when the visualization editor is active.

Since release 0.2.X, a theme file having the same name as a spec file will be used by default when displaying the models or counter examples of such spec file.

# A4E preferences #

If you cannot validate A4E preferences, **make sure that the directories in the directory fields are pointing out to real directories**. You can easily check this by going to such field. If the directory does not exist, an error message should appear on top on A4E preferences page.