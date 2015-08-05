resolvers += Resolver.url("commbank-releases-ivy", new URL("http://commbank.artifactoryonline.com/commbank/ext-releases-local-ivy"))(Patterns("[organization]/[module]_[scalaVersion]_[sbtVersion]/[revision]/[artifact](-[classifier])-[revision].[ext]"))

addSbtPlugin("au.com.cba.omnia" % "uniform-core" % "1.2.6-20150617004712-fa18e15")

addSbtPlugin("au.com.cba.omnia" % "uniform-thrift" % "1.2.6-20150617004712-fa18e15")

addSbtPlugin("au.com.cba.omnia" % "uniform-assembly" % "1.2.6-20150617004712-fa18e15")

addSbtPlugin("au.com.cba.omnia" % "uniform-dependency" % "1.2.6-20150617004712-fa18e15")
