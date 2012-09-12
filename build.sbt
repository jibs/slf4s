
organization := "com.weiglewilczek.slf4s"

name := "slf4s"

version := "1.0.8"

scalaVersion := "2.9.2"

crossScalaVersions := Seq(
    "2.8.0",
    "2.8.1",
    "2.9.0-1",
    "2.9.1",
    "2.9.2",
    "2.10.0-M6")

libraryDependencies ++= Seq(
    "org.slf4j" % "slf4j-api" % "1.7.0")

//publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

publishTo := Some(Resolver.file("file",  new File("./repo")))

