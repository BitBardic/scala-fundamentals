import scala.concurrent.Future

Future.successful("yay!")
Future.failed(new Exception("boom :("))

import scala.concurrent.{ Future, Promise }
val promise = Promise[Int]
promise.future
promise.success(100)
promise.future
promise.future.value