object WebShop extends App {

  case class Item(var name: String, var price: Double, var unitName: String)

  case class User(var name: String, var userName: String)

  case class OrderLine(val item: Item,val quantity: Int, val price: Double )


  case class Cart(var user: User, var order: List[OrderLine]) {
    println("user" + user.name + " bought " + order.map(_.item.name).mkString(", ") + " £" + sum)

    def sum: Double = order.map(x => x.price * x.quantity).sum


  }
    val bread = new Item("Bread",  1, "Kg")
    val oranges = new Item("Oranges",  1.5, "Kg")
    val bananas = new Item("Bananas",  0.8, "Kg")
    val milk = new Item("Milk",  1.5, "Ltr")


    val sean = new User(" Sean", "Awesome")
    val nozuza = new User(" Zuzanna Nowak", "Nozuza")
    val kolena = new User(" Lena Kowalski","Kolena")
    val wijulia = new User(" Julua Wisniewski", "Wijulia")
    val komaja = new User(" Maja  Kowalski" ,"Komaja")

   //val purchase1 = new Cart(sean, List(bread, oranges))
    //val purchase2 = new Cart(nozuza, List(bananas, milk))

    val purchase1 = new Cart(kolena, List(new OrderLine(bread, 3, 3), new OrderLine(milk, 4, 1.5)) )
    val purchase2 =

}