package com.oaganalytics

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import au.com.cba.omnia.permafrost.hdfs._

object Config {
  val conf = new Configuration()
  conf.addResource(new Path(getClass().getResource("/conf/core-site.xml").toURI))
  conf.addResource(new Path(getClass().getResource("/conf/hdfs-site.xml").toURI))
  conf.addResource(new Path(getClass().getResource("/conf/mapred-site.xml").toURI))
}

object Test {
  def main(args: Array[String]) {
    println(Config.conf)
    Hdfs.copyFromLocalFile(new java.io.File("/tmp/testfile"), new org.apache.hadoop.fs.Path("/testfile")).run(Config.conf)
  }
}
