val numbers = List(1, 2, 3, 4)
numbers.head
numbers.tail

numbers.init
numbers.last

numbers :+ 5
0 +: numbers
numbers

numbers ++ List(5, 6, 7)
List(-1, 0) ++ numbers

numbers.drop(1)
numbers.dropRight(1)
numbers.dropWhile(_ < 3)