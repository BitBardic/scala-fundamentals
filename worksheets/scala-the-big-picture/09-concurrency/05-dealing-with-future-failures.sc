import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val failedFuture = Future { 10 / 0 }
failedFuture.value
val failedException = failedFuture.failed

val fallbackFuture = Future.successful(100)
val computation = Future { 1 / 0} fallbackTo(fallbackFuture)
computation

val resultFuture = Future { 100 / 0 }
resultFuture

resultFuture.recover {
  case e: ArithmeticException => 0
}