case class Trip(to: String)
case class Car(model: String)
case class Cash(amount: Integer)
case class NoPrize()

val magicBucket = List(NoPrize(), Car("Tesla"), Trip("New Zealand"), NoPrize(), Trip("California"), Cash(1000), Cash(500), NoPrize(), NoPrize(), NoPrize(), NoPrize())

scala.util.Random.shuffle(magicBucket).take(1)(0) match {
  case t: Trip => println(s"You have won a trip to ${t.to}")
  case c: Car => println(s"You have won a ${c.model}")
  case ca: Cash => println(s"You have won cash worth ${ca.amount} dollars")
  case n: NoPrize => println("Hard luck, you did not win anything. try again!")
}