name := "play-scalapb-protobuf"

version := "0.1"

scalaVersion := "2.13.2"

PB.targets in Compile := Seq(
  scalapb.gen(
    flatPackage = true,
  ) -> (sourceManaged in Compile).value
)
