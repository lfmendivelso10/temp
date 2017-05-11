name := """nocopyrightsounds"""
organization := "org.luist"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  jdbc,
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4",
  "org.mindrot" % "jbcrypt" % "0.3m"
)
