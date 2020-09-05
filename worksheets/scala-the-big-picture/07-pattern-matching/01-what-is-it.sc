val numbers = List(1, 2, 3)
if (numbers.nonEmpty && numbers.size >=2) println(numbers(1)) else println("found nothing")

val number = 5
number match {
  case 0 => "zero"
  case 5 => "five"
  case 9 => "nine"
}

//val number = 99
//number match {
//  case 0 => "zero"
//  case 5 => "five"
//  case 9 => "nine"
//}

val number = 99
number match {
  case 0 => "zero"
  case 5 => "five"
  case 9 => "nine"
  case _ => "nothing matched"
}

number match {
  case _ => "nothing"
  case 0 => "zero"
}