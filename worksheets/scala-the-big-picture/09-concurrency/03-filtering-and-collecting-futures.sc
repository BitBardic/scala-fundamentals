import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val salary = Future { Thread.sleep(5000); 7000 }
val salaryLarge = salary.filter(s => s > 5000)
salaryLarge

val salaryFuture = Future { Thread.sleep(5000); 3000 }
val salaryIncremented = salaryFuture.collect { case salary if salary < 5000 => salary + 1000 }
salaryIncremented