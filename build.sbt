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
    "org.spire-math" %% "spire" % "0.9.0",
    "org.typelevel" %% "machinist" % "0.2.2",
    "com.chuusai" %% "shapeless" % "2.1.0"
  ),
  scmInfo := Some(ScmInfo(url("https://github.com/arahuja/sbp-testbed"), "git@github.com:arahuja/sbp-testbed.git"))
)

lazy val settings = buildSettings ++ commonSettings

lazy val core = project
  .settings(moduleName := "sbp-testbed")
  .settings(settings: _*)

addCommandAlias("validate", ";compile;test;scalastyle;test:scalastyle;unidoc;tut")