val weekDays = Map(1 -> "Sunday", 2 -> "Monday", 3 -> "Tuesday")
weekDays(1)
weekDays + (4 -> "Wednesday")
weekDays - 1
weekDays

weekDays.foreach(entry => println(s"${entry._1} => ${entry._2}"))

val tuple = (10, 20, 30)
tuple._1
tuple._2
tuple._3

weekDays ++ Map(4 -> "Wednesday", 5 -> "Thursday")