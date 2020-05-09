name := "play-scalapb-protobuf"

version := "0.1"

scalaVersion := "2.13.2"

PB.targets in Compile := Seq(
  scalapb.gen(
    flatPackage = true,
  ) -> (sourceManaged in Compile).value
)

val circeVersion = "0.12.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"

libraryDependencies += "com.thesamet.scalapb" %% "scalapb-json4s" % "0.10.1"
