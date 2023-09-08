ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "learnCaliban"
  )

val calibanVersion = "2.3.0"

libraryDependencies ++= Seq(
  "com.github.ghostdogpr"         %% "caliban"                       % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-http4s"                % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-play"                  % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-akka-http"             % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-zio-http"              % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-cats"                  % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-federation"            % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-tapir"                 % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-client"                % calibanVersion,
  "com.github.ghostdogpr"         %% "caliban-tools"                 % calibanVersion,
  "org.http4s"                    %% "http4s-ember-server"           % "0.23.16",
  "org.http4s"                    %% "http4s-dsl"                    % "0.23.16",
  "com.softwaremill.sttp.client3" %% "zio"                           % "3.3.18",
  "io.circe"                      %% "circe-generic"                 % "0.14.1",
  "com.typesafe.play"             %% "play-akka-http-server"         % "2.8.14",
  "com.typesafe.akka"             %% "akka-actor-typed"              % "2.6.18",
  // "com.softwaremill.sttp.tapir"   %% "tapir-jsoniter-scala"          % "1.2.2", // Jsoniter
  //  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % "1.2.2", // Circe
  "com.softwaremill.sttp.tapir" %% "tapir-json-play"      % "1.2.11" // Play JSON
)