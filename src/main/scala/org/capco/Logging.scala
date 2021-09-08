package org.capco

import org.slf4j.Logger
import org.slf4j.LoggerFactory

trait Logging {
  def log: Logger = LoggerFactory.getLogger(this.getClass.getName.replace("$", ""))
}
