package lectures.part3concurrency

import scala.concurrent.{Await, Future, Promise}
import scala.util.{Failure, Random, Success, Try}
import scala.concurrent.duration._

// important for futures
import scala.concurrent.ExecutionContext.Implicits.global

object FuturesPromises extends App {

  def calculateMeaningOfLife: Int = {
    Thread.sleep(2000)
    42
  }

  val aFuture = Future {
    calculateMeaningOfLife // calculates the  meaning of  life on ANOTHER thread
  } // (global) which is passed by the compiler


  println(aFuture.value) // Option[Try[Int]]

  println("Waiting on the future")
  val someRes = aFuture.onComplete {
    case Success(meaningOfLife) => 43 // return val is ignored
    case Failure(e) => println(s"I have failed with $e")
  } // SOME thread

  Thread.sleep(3000) // this needs to see onComplete result


}
