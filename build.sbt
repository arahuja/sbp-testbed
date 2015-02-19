lazy val buildSettings = Seq(
  organization := "com.arunahuja",
  scalaVersion := "2.11.5",
  crossScalaVersions := Seq("2.11.5")
)

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:experimental.macros",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture"
  ),
  libraryDependencies ++= Seq(
    "org.spire-math" %% "algebra" % "0.2.0-SNAPSHOT" from "http://plastic-idolatry.com/jars/algebra_2.11-0.2.0-SNAPSHOT.jar"
  ),
  scmInfo := Some(ScmInfo(url("https://github.com/arahuja/sbp-testbed"),
    "git@github.com:arahuja/sbp-testbed.git"))
)

lazy val settings = buildSettings ++ commonSettings

lazy val core = project
  .settings(moduleName := "sbp-testbed")
  .settings(settings: _*)

addCommandAlias("validate", ";compile;test;scalastyle;test:scalastyle;unidoc;tut")