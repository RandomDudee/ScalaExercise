

import Array._
import scala.util.Random._
import Threads._

object Lotto extends App {

  val thread1 = new Thread(new Runnable() {
    def run(): Unit =
      while (true) {
        val multipleTickets = for (i <- 1 to 5) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
      }
  })


  val thread2 = new Thread(new Runnable() {
    def run(): Unit =
      while (true) {
        val multipleTickets = for (i <- 6 to 10) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
      }
  })


  val thread3 = new Thread(new Runnable() {
    def run(): Unit =
      while (true) {
        val random = util.Random.shuffle(1 to 90)

        val fiveNumbers = random.splitAt(5)

        val singleTicket = fiveNumbers._1

        val multipleTickets = for (i <- 1 to 5) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)

        val draw = singleTicket.sortWith(_ < _)

        val winLose = multipleTickets.contains(draw)

        println(winLose)

      }
  })




//    val random = util.Random.shuffle(1 to 90)
//
//    val fiveNumbers = random.splitAt(5) // should have just took 5 instead of split
//
//    val singleTicket = fiveNumbers._1 // takes first list of 5 instead of both lists 5 and 85
//
//
//      //   val list = List(singleTicket)
//
//
//      //do { list } while (list < 5 )
//
//    val multipleTickets = for (i <- 1 to 5) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
//      // Got help of jack as I could not get loops working. Didn't know Yield was a thing.... HAd single ticket and drew it 5 times  instead of 5 random tickets changed to work.
//
//    val draw = singleTicket.sortWith(_ < _) // (_ < _) sorts by ascending order
//
//    val winLose = multipleTickets.contains(draw) // kept failing saying false. swapped round args.

    // println(draw)
    // println(multipleTickets)
   //println(thread1)
   // println(thread2)

    //println(winLose)





thread1.start()
thread2.start()
thread3.start()
}

