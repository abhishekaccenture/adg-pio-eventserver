name := "pio-eventserver-heroku"

libraryDependencies ++= Seq(
  "io.prediction"    %% "tools"      % "0.9.6",
  "org.apache.spark" %% "spark-core" % "2.0.0",
  "org.postgresql"   %  "postgresql" % "9.4.1208"
)

cancelable in Global := true

enablePlugins(JavaAppPackaging)
