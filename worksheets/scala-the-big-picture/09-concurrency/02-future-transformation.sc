import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
val salary = Future {Thread.sleep(20000); 4000}
val bonus = 500

val salaryWithBonus = salary.map(value => value + 500)
salaryWithBonus

val productPrice = Future {Thread.sleep(10000); 150}
val productTax = Future {Thread.sleep(10000); 8.95}

val finalPrice = for {
  price <- productPrice
  tax <- productTax
} yield price + tax

finalPrice