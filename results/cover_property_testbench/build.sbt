lazy val root = Project("ChiselDriver", file("")).
    settings(
        scalaVersion := "2.11.7",
        libraryDependencies += "edu.berkeley.cs" %% "chisel" % "2.3-SNAPSHOT",
        libraryDependencies += "coveragepropertydsl" %% "coveragepropertydsl" % "0.1-SNAPSHOT"
    )
