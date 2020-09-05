val letters = List("a", "b", "c", "d", "e")
for (letter <- letters) {
  println(letter)
}

val numbers = List(1,2,3,4,5,6,7,8,9,10)
for (number <- numbers) {
  if (number % 2 == 0) {
    println(number)
  }
}

for (number <- numbers if (number % 2) == 0) {
  println(number)
}

for (
  number <- numbers
  if (number % 2 == 0)
  if (number > 2)
) println(number)

val letters = List("a", "b", "c")
val numbers = List(1, 2)
for (number <- numbers) {
  for (letter <- letters) {
    println(number + " => " + letter)
  }
}

for {
  number <- numbers
  letter <- letters
} println(number + " => " + letter)

val numbers = List(1,2,3,4,5,6)
for (number <- numbers) yield number * 2
println(numbers)

for (number <- numbers) yield number * 2

for (number <- numbers) yield { number * 2 }

for (number <- numbers if (number % 2 == 0) ) yield { number * 2 }

val numbers = List(1,2,3,4,5,6)
val letters = List("a", "b")
for {
  number <- numbers
  letter <- letters
} yield number + " => " + letter