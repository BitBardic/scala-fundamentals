def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
  }
}

val arguments = List("10", "eight", "5", "four", "3", "20", "one")
arguments.map(toInt(_))
arguments.flatMap(toInt(_))
arguments.flatMap(toInt(_)).sum
arguments.map(toInt(_)).flatten.sum