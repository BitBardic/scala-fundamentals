val nestedList =  List(List(1, 2, 3, 4), List(4, 5, 6, 7))
nestedList.map(aList => aList.map(_ + 1))
nestedList.map(aList => aList.map(_ + 1)).flatten
nestedList.flatMap(aList => aList.map(_ + 1))