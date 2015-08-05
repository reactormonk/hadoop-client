uniform.project("hadoop-client", "com.oaganalytics")

uniformDependencySettings

strictDependencySettings

scalaVersion := "2.11.7"

libraryDependencies :=
  depend.hadoopClasspath ++
depend.hadoop() ++ Seq(
  "au.com.cba.omnia" %% "permafrost" % "0.10.0-20150729223234-1f86afc"
)

uniformThriftSettings

scalacOptions in (Compile, console) ~= (_ filterNot (_ == "-Ywarn-unused-import"))
