import sbt._

logLevel := Level.Warn

resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

// sbt-paradox, used for documentation
//addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.8.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")
