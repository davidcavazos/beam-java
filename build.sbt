name := "my-artifact-id"
organization := "org.my.group.id"
version := "1.0-SNAPSHOT"
description := "An Apache Beam pipeline."

val beamVersion = "2.28.0"

libraryDependencies ++= Seq(
  "org.apache.beam" % "beam-sdks-java-core" % beamVersion,
  "org.apache.beam" % "beam-runners-direct-java" % beamVersion,
  "org.apache.beam" % "beam-runners-google-cloud-dataflow-java" % beamVersion,
  "org.slf4j" % "slf4j-jdk14" % "1.7.30"
)
