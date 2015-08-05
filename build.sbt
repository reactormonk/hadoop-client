uniform.project("hadoop-client", "com.oaganalytics")

uniformDependencySettings

strictDependencySettings

scalaVersion := "2.11.7"

libraryDependencies :=
  depend.hadoopClasspath ++
  depend.hadoop("2.0.0-cdh4.2.0")

uniformThriftSettings
