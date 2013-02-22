sbt-terminal
============

rxvt/xterm utilities for sbt.

A rather trivial sbt plugin that adds a couple terminal control commands.

terminal-clear
---------------
Clears the terminal, and more importantly, resets its scrollback buffer.

Useful for continuous compilation, where you no longer have to keep track of
where in the output the current build began and the previous ended.
Just slam your mouse wheel north to get to the first line of output of the
most recent compile.

Fitt's law and all that.

Typical usage:

    $ sbt
    [info] Loading global plugins from /home/dln/.sbt/plugins
    [info] Loading project definition from /home/dln/src/awesome-sauce/project
    [info] Set current project to awesome-sauce (in build file:/home/dln/src/awesome-sauce/)
    > ~ ;terminal-clear;compile

This command will clear the terminal between triggered builds.


Copyright
---------

Copyright (c) 2013 Daniel Lundin

This software is licensed under the Apache License, Version 2.0.
Please see LICENSE for details.
