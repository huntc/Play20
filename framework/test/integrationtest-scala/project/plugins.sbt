// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository contains all required dependencies
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.0"))

// Code style
addSbtPlugin( "com.typesafe.sbtscalariform" % "sbtscalariform" % "0.5.1")

// Test code coverage
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.0.0")