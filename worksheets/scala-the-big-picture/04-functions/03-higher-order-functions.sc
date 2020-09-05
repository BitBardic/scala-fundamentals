case class Fruit(name: String)

val apple = Fruit("apple")
val orange = Fruit("orange")
val kiwi = Fruit("kiwi")

val fruitBasket = List(apple, orange, kiwi, orange, kiwi, apple, kiwi, kiwi, apple, orange)

val numbers = List(1,2,3,4)
val letters = List("a", "b", "c", "d")

fruitBasket.filter((fruit: Fruit) => fruit.name == "apple")
fruitBasket.filter((fruit) => fruit.name == "apple")
fruitBasket.filter(fruit => fruit.name == "apple")
fruitBasket.filter(_.name == "apple")
fruitBasket.filter((fruit) => fruit.name != "kiwi" && fruit.name == "apple")

// fruitBasket.filter( _.name != "kiwi" && _.name == "apple")