val pageLoadTimesInSeconds = List(2, 1, 5, 9, 14, 22, 45, 2, 4, 23)
pageLoadTimesInSeconds.filter(seconds => seconds >= 10)
pageLoadTimesInSeconds.filter(_ >= 10)
pageLoadTimesInSeconds.filter(_ >= 10).min
pageLoadTimesInSeconds.filter(_ >= 10).max

val list = List(4, 3, 2, 1)
val set = Set(4, 3, 2, 1)
val map = Map(1 -> "Sunday", 2 -> "Monday")
list.isEmpty
list.nonEmpty
set.isEmpty
set.nonEmpty
map.isEmpty
map.nonEmpty

val list = List(4, 5, 1, 3, 3, 3)
list.toSet

val set = Set(1, 2, 3, 4)
set.toList