

import Array._
import scala.util.Random._
import Threads._
import com.sun.xml.internal.bind.v2.TODO

import scala.collection.immutable

object Lotto extends App {

//  //var multipleTickets = 0
//
//  val thread1 = new Thread(new Runnable() {
//    def run(): Unit =
//      while (true) {
//        val multipleTickets = for (i <- 1 to 500000) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
//        val firstSet = multipleTickets
//      }
//  })
////  TODO Try and inject firstSet into thread3
//
//  val thread2 = new Thread(new Runnable() {
//    def run(): Unit =
//      while (true) {
//        val multipleTickets = for (i <- 500001 to 1000000) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
//        val secondSet = multipleTickets
//      }
//  })
////  TODO Try and inject secondSet into thread3
//
//
//  val thread3 = new Thread(new Runnable() {
//    def run(): Unit =
//      while (true) {
//        val random = util.Random.shuffle(1 to 90)
//
//        val fiveNumbers = random.splitAt(5)
//
//        val singleTicket = fiveNumbers._1
//
//        val multipleTickets = for (i <- 1 to 5) yield util.Random.shuffle(1 to 90).splitAt(5)._1.sortWith(_ < _)
//
//        val draw = singleTicket.sortWith(_ < _)
//
//        val winLose = multipleTickets.contains(draw)
//
//        if (winLose == true)println("Found") else println("None Found")
//
//      }
//  })
///*  TODO looks like thread 3 is only taking its own 5 tickets and checking against them and not taking the 1 million tickets from threads 1 & 2
//    TODO also looks like thread3 keeps generating a new draw only need it to create one draw and match against threads 2 & 3
// */
//


//
//    val random = util.Random.shuffle(1 to 90)
//
//    val fiveNumbers = random.splitAt(5) // should have just took 5 instead of split
//
//    val singleTicket = fiveNumbers._1 // takes first list of 5 instead of both lists 5 and 85
//
//
//      //   val list = List(singleTicket)


      //do { list } while (list < 5 )

    def multipleTickets: immutable.Seq[Seq[Int]] = for (i <- 1 to 1000000) yield util.Random.shuffle(1 to 90).take(5).sortWith(_ < _)
      // Got help of jack as I could not get loops working. Didn't know Yield was a thing.... HAd single ticket and drew it 5 times  instead of 5 random tickets changed to work.

//    def multipleTickets2 = for (i <- 250001 to 500000) yield util.Random.shuffle(1 to 90).take(5).sortWith(_ < _)
//
//    def multipleTickets3 = for (i <- 500001 to 750000) yield util.Random.shuffle(1 to 90).take(5).sortWith(_ < _)
//
//    def multipleTickets4 = for (i <- 750001 to 1000000) yield util.Random.shuffle(1 to 90).take(5).sortWith(_ < _)

    def draw = util.Random.shuffle(1 to 90).take(5).sortWith(_ < _) // (_ < _) sorts by ascending order

    def winLose = multipleTickets.contains(draw) // kept failing saying false. swapped round args.

    def four = util.Random.shuffle(1 to 90).take(4).sortWith(_<_)

    def matchFour = multipleTickets.contains(four)

    val three: Seq[Int] = util.Random.shuffle(1 to 90).take(3).sortWith(_<_)

    val matchThree =  three.map{x => multipleTickets.map(_.contains(x))}

    val one = util.Random.shuffle(1 to 90).take(1).sortWith(_<_).head

    val matchOne: immutable.Seq[Boolean] = multipleTickets.map(_.contains(one))

//    val winLose2 = multipleTickets2.contains(draw)
//
//    val winLose3 = multipleTickets3.contains(draw)
//
//    val winLose4 = multipleTickets4.contains(draw)

    if (winLose == true)println("Found") else println("None Found")

    if (matchFour == true)println("Found Four") else println("None Found Four")

    if (matchThree.count(_ == true) >= 1)println("Found Three") else println("None Found Three")

    if (matchOne.count(_ == true) >= 1)println("Found One") else println("None Found One")

//    if (winLose2 == true)println("Found 2") else println("None Found 2")
//
//    if (winLose3 == true)println("Found 3") else println("None Found 3")
//
//    if (winLose4 == true)println("Found 4") else println("None Found 4")



//
//     println(draw)
//     println(multipleTickets)
   //println(thread1)
   // println(thread2)
//
//    println(winLose)
//    println(winLose2)
//    println(winLose3)
//    println(winLose4)


//  //test line


//
//
//thread1.
//thread1.start()
//thread2.start()
//thread3.start()
}


