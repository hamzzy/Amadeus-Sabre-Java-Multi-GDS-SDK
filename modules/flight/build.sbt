Build.moduleSettings("flight")

libraryDependencies ++= Build.commonDependencies ++: Seq(
  "javax.xml.ws" % "jaxws-api" % "2.2.11",
  "com.sun.xml.ws" % "jaxws-rt" % "2.2.10",
  "com.sun.xml.ws" % "jaxws-tools" % "2.2.10"
)
