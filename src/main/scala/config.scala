package com.oaganalytics

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path

object Config {
  val conf = new Configuration()
  conf.addResource(new Path(getClass().getResource("/conf/core-site.xml")))
  conf.addResource(new Path(getClass().getResource("/conf/hdfs-site.xml")))
  conf.addResource(new Path(getClass().getResource("/conf/mapred-site.xml")))
}
