name := "msbase"

ThisBuild / organization := "io.github.izgzhen"
ThisBuild / version      := "0.1-SNAPSHOT"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.0"

publishM2Configuration := publishM2Configuration.value.withOverwrite(true)