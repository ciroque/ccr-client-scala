name := "ccr-client-scala"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaVersion = "2.4.0"
  val sprayVersion = "1.3.3"
  Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    "org.easymock" % "easymock" % "3.2" % "test",
    "io.spray" %% "spray-can" % sprayVersion
  )
}