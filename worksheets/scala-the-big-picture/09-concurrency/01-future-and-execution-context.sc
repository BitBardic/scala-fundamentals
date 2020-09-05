import scala.concurrent.Future
//val fut = Future { Thread.sleep(10000); 21 + 21 }

import scala.concurrent.ExecutionContext.Implicits.global
val fut = Future { Thread.sleep(10000); 21 + 21 }

fut.isCompleted
new java.util.Date()
new java.util.Date()
fut.isCompleted

fut.value

import scala.util.{Success, Failure}
fut.onComplete({
  case Success(result) => println("got: " + result)
  case Failure(e) => println("failed: " + e)
})