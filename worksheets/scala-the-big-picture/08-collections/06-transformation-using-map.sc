case class Event(location: String, dayOfWeek: String, sessionTimeInSeconds: Integer, source: String)

val event1 = Event("US", "Sun", 10, "Twitter")
val event2 = Event("China", "Mon", 15, "WeChat")
val event3 = Event("New Zealand", "Sun", 30, "Twitter")
val event4 = Event("US", "Tue", 5, "Facebook")
val event5 = Event("US", "Thu", 24, "LinkedIn")
val event6 = Event("US", "Sat", 60, "Facebook")

val events = List(event1, event2, event3, event4, event5, event6)

val locations = events.map(event => event.location)
val locations = events.map(_.location)
val sources = events.map(_.source)
val days = events.map(_.dayOfWeek)