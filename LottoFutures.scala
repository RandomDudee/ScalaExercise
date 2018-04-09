import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object LottoFutures extends App {

  //This is just a random function that will return an Int of 500000 sets of 5 numbers after 3 seconds
  def ticketsMultiple: Unit = {
    Thread.sleep(3000)
    val multipleTickets = for (i <- 1 to 500001) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
    val singleTicket = util.Random.shuffle(1 to 90).splitAt(5)._1
    val winLose = multipleTickets.contains(singleTicket)

    if (winLose == true)println("Found") else println("None Found")

  }





  //When we call this, it will be Future<Incomplete> until randomFunction returns (3 seconds)
  def mySimpleFuture: Future[Unit] = Future {
    ticketsMultiple
  }


  //Assign a val so we can add a callback
  val futureInstance = mySimpleFuture

  //This is the callback, after the 3 seconds, this will be called.
  //It should always succeed, but the compiler doesn't like it if we don't put in a
  //failure case
  futureInstance.onComplete {
    case Success(result) => println(ticketsMultiple)
    case Failure(error) => println(error)
  }

  //Keep the JVM running on the main thread, or it will shut down before our future
  //returns
  Thread.sleep(5000)
}


