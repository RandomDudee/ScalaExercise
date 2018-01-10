import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User

object TheScope extends App {
// To create a object you need a class
  val book = new Item("book", 5)
  val wine = new Item("Wine", 20)
  val chocolate = new Item("Chocolate", 3)
  val biscuit = new Item("Biscuit", 4)

  val sean = new User("Sean")
  val jack = new User("Jack")

  val purchase1 = new Cart(sean, List(book, wine))
  val purchase2 = new Cart(jack, List (biscuit, chocolate))

  purchase1.sum()
  purchase2.sum()

  case class Item(var name: String, var price: Int)
// Classes are the blueprints for objects
  case class User(var name: String)

  case class Cart(var user: User, var order: List[Item]){
    println("user" + user + "bought"+ order)
    def sum(): Unit ={
      val sum = order.map(_.price).sum
      println("sum: " + sum)
    }
  }

}
//  val one = new DemoI()
//  val two = new DemoI()
//
//
//  println(one.i)
//  println(two.i)
//  println(Amanda.i)
//  one.i = 11
//  two.i = 22
//  Amanda.i = 33
//  println(one.i)
//  println(two.i)
//  println(Amanda.i)
//}


//  class DemoI {
//
//    var i: Int = 0
//    doIT(57)
//
//    def doIT(x: Int): Boolean = {
//
//      var i: Int = 9
//      println("i2:" + i)
//
//      return true
//
//    }
 // }


//  object Amanda {
//    var i = 55
//    println("Amanda")
//    def doIT(x: Int):Boolean = {
//      var i: Int = 9
//      println("i2:" + i)
//
//      return true
//    }
//
//  }

