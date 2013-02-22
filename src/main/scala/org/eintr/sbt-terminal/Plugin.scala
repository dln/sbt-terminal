package org.eintr.sbtterminal

import sbt._
import Keys._

object Plugin extends sbt.Plugin {

  override lazy val settings = Seq(commands += terminalClear)

  def terminalClear = {
    Command.command("terminal-clear") { state =>
      println("\033c")
      state
    }
  }
}
