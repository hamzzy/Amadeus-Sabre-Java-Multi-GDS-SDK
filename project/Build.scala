import sbt._
import Keys._
//import AssemblyKeys._

object Build {

  lazy val appName = "amadeus-sabre-multi-gds"

  val myScalaVersion = "2.11.8"

  lazy val projectVersion = "2.0.5-SNAPSHOT"

  def settings(projectName: String) = Seq(
    name := projectName,
    organization := "tech.brakket",
    version := projectVersion,
    scalaVersion := myScalaVersion,
    scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked", "-language:reflectiveCalls", "-language:postfixOps", "-language:implicitConversions"),
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
    resolvers := Build.commonResolvers
  )

  def appSetting(projectResources: Seq[String]) = settings(projectName = appName) ++: Seq(
    compileOrder in Compile := CompileOrder.JavaThenScala
  )

  lazy val sharedConfFilesReplicator = taskKey[Seq[File]]("Replicate shared.*.conf files.")

  def moduleSettings(module: String) = settings(projectName = module) ++: Seq(
    javaOptions += s"-Dconfig.resource=$module.conf",
    sharedConfFilesReplicator in Compile := sharedConfFilesReplicate(baseDirectory.value / ".." / "..", resourceManaged.value, streams.value.log),
    resourceGenerators in Compile += (sharedConfFilesReplicator in Compile)
  )

  def sharedConfFilesReplicate(rootDir: File, managedDir: File, log: Logger): Seq[File] = {
    val files = ((rootDir / "conf") ** "*.conf").get
    val destinationDir = managedDir / "src" / "main" / "resources"
    destinationDir.mkdirs()
    files.map { file =>
      val destinationFile = destinationDir / file.getName
      IO.copyFile(file, destinationFile)
      file
    }
  }

  val akkaVersion = "2.4.19"
  var commonDependencies: Seq[ModuleID] = Seq(
    "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
    "com.google.inject" % "guice" % "4.0" exclude("com.google.guava", "guava"),
    "org.apache.commons" % "commons-math3" % "3.6.1",
    "org.apache.commons" % "commons-lang3" % "3.0",
    "org.apache.httpcomponents" % "httpclient" % "4.5.1",
    "com.typesafe" % "config" % "1.4.0",
    "joda-time" % "joda-time" % "2.9.9",
    "io.monix" %% "shade" % "1.10.0",
    "commons-io" % "commons-io" % "2.6",
    "org.json4s" %% "json4s-native" % "3.5.0",
    "org.jsoup" % "jsoup" % "1.10.2", //HTML Parsing
    "com.fasterxml.jackson.core" % "jackson-core" % "2.8.8",
    "com.fasterxml.jackson.core" % "jackson-annotations" % "2.8.8",
    "com.google.guava" % "guava" % "19.0",
    "ch.qos.logback" % "logback-classic" % "1.0.13",
    "junit" % "junit" % "4.12" % Test,
    "org.scalatest" %% "scalatest" % "3.0.1" % Test,
    "io.circe" %% "circe-core" % "0.9.3",
    "io.circe" %% "circe-generic" % "0.9.3",
    "io.circe" %% "circe-parser" % "0.9.3",
    "com.google.code.gson" % "gson" % "2.8.5"
  )

  val commonResolvers = Seq(
    Resolver.jcenterRepo
  )

  lazy val gitHash = taskKey[Seq[File]]("Generating Resource file for Git Repo")


  // Documentation for this project:
  //    sbt "project docs" "~ paradox"
  //    open docs/target/paradox/site/index.html
  //  lazy val docs = (project in file("docs")).enablePlugins(ParadoxPlugin).settings(
  //    paradoxProperties += ("download_url" -> "https://example.lightbend.com/v1/download/play-rest-api")
  //  )

}
