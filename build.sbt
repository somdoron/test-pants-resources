lazy val root = project
  .in(file("."))
  .settings(scalaVersion := "2.13.8", libraryDependencies ++= Seq("org.scala-lang.modules" %% "scala-collection-contrib" % "0.2.2"))
