case class Fruit(name: String)

val apple = Fruit("apple")
val orange = Fruit("orange")
val kiwi = Fruit("kiwi")
val fruitBasket = List(apple, orange, kiwi, apple, orange, kiwi, apple, orange, kiwi)
def getApples(basket: List[Fruit]) = for (fruit <- basket if fruit.name == "apple") yield fruit
def getOranges(basket: List[Fruit]) = for (fruit <- basket if fruit.name == "orange") yield fruit
def getFruits(basket: List[Fruit], filterByFruit: Fruit => Boolean) = for (fruit <- basket if filterByFruit(fruit)) yield fruit
def getApples(basket: List[Fruit]) = getFruits(fruitBasket, (fruit: Fruit)=> fruit.name == "apple")
def getOranges(basket: List[Fruit])= getFruits(fruitBasket, (fruit: Fruit)=> fruit.name == "orange")
def getKiwis(basket: List[Fruit])= getFruits(fruitBasket, (fruit: Fruit)=> fruit.name == "kiwi")
