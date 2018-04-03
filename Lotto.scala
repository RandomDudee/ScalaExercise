import Array._
import scala.util.Random._

object Lotto extends App {

  {

   val random = util.Random.shuffle(1 to 90)

   val fiveNumbers = random.splitAt(5) // should have just took 5 instead of split

   val singleTicket = fiveNumbers._1


//   val list = List(singleTicket)


 //do { list } while (list < 5 )

    val multipleTickets = for(i <- 1 to 5) yield singleTicket.sortWith(_ < _) // Got help of jack as I could not get loops working. Didn't know Yield was a thing


    val draw = singleTicket.sortWith(_ < _)

    val winLose = draw.contains(multipleTickets)

    println(draw)
    println(multipleTickets)

    println(winLose)




  }



}

