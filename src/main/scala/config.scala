package com.oaganalytics

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import au.com.cba.omnia.permafrost.hdfs._

object Test {
  def main(args: Array[String]) {
    val conf = new Configuration()
    println(conf)
    println(conf.get("fs.defaultFS"))
    println(Hdfs.copyFromLocalFile(new java.io.File("/tmp/testfile"), new org.apache.hadoop.fs.Path("/testfile")).run(conf))
  }
}
