lazy val root = Project("ChiselDriver", file("")).
    settings(
        scalaVersion := "2.11.7",
        libraryDependencies += "edu.berkeley.cs" %% "chisel" % "2.3-SNAPSHOT" 
    )
