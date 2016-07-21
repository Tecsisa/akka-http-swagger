organization := "com.tecsisa"

name := "akka-http-swagger"
scalaVersion := "2.11.8"

val SwaggerVersion = "1.3.12"
val AkkaStreamVersion = "2.4.8"


libraryDependencies ++=  Seq(
  // akka http
  "com.typesafe.akka" %% "akka-stream" % AkkaStreamVersion,
  "com.typesafe.akka" %% "akka-http-experimental" % AkkaStreamVersion,

  // swagger
  "com.wordnik" %% "swagger-core" % SwaggerVersion excludeAll(ExclusionRule(organization = "org.json4s"), ExclusionRule(organization = "org.fasterxml*")),
  "org.json4s" %% "json4s-native" % "3.2.11",
  "javax.ws.rs" % "jsr311-api" % "1.1.1",

  // other
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
)

// test
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaStreamVersion % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.github.nscala-time" %% "nscala-time" % "2.0.0" % "test",
  "org.json4s" %% "json4s-jackson" % "3.2.11" % "test"
)

parallelExecution in Test := false
publishArtifact in Test := false

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
