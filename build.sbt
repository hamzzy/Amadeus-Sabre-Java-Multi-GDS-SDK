// SBT Configuration for WebServices Integration
// Igbalajobi Jamiu Okunade on 17/07/2016 2:31 AM
Build.appSetting(projectResources = Seq("common", "flight"))

lazy val common = project in file("modules/common")

lazy val flight = (project in file("modules/flight")).dependsOn(common)

lazy val root = (project in file(".")).aggregate(common, flight).dependsOn(common, flight)

libraryDependencies ++= Build.commonDependencies

resolvers ++= Build.commonResolvers

connectInput in run := true