import Threads.temp

object Threads extends App {

  var temp = 0l

  val thread1 = new Thread(new Runnable() {
    override def run(): Unit =
      while(true){
        //println("AAA")}
        temp = Long.MaxValue/2}

  })
  val thread2 = new Thread(new Runnable() {
    override def run(): Unit =
      while(true){
       // println("BBB")}
        temp = 0l}


  })

val thread3 = new Thread(new Runnable() {
  def run(): Unit = {
    while (true) {
      if (temp != 0 && temp != Long.MaxValue / 2) {
        println("TROUBLE" + temp)
      }
    }
  }

})



  thread1.start()
  thread2.start()
  thread3.start()
}
