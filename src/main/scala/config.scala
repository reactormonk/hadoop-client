package com.oaganalytics

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import au.com.cba.omnia.permafrost.hdfs._

object Config {
  val conf = new Configuration()
}

object Test {
  def main(args: Array[String]) {
    Hdfs.copyFromLocalFile(new java.io.File("/tmp/testfile"), new org.apache.hadoop.fs.Path("/testfile")).run(Config.conf)
  }
}
