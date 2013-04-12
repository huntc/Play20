logLevel := Level.Warn

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.3")

addSbtPlugin( "com.typesafe.sbtscalariform" % "sbtscalariform" % "0.5.1") 

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.0.0")
