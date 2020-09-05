val numbers = List(10, 20, 30)
numbers match {
  case List(a, b, c) => b
  case _ => -1
}

numbers match {
  case List(_, second, _) => second
  case _ => -1
}

val numbers = List(1, 2, 3, 4, 5, 6)
numbers match {
  case List(_, second, _) => second
  case _ => -1
}

numbers match {
  case List(_, second, _*) => second
  case _ => -1
}