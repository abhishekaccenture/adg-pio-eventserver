import io.prediction.data.api.{EventServer, EventServerConfig}

object EventServerApp extends App {

  val port = sys.env.getOrElse("PORT", "5432").toInt

  EventServer.createEventServer {
    EventServerConfig(ip = "https://adg-pio-eventserver.herokuapp.com", port = port)
  }

}
