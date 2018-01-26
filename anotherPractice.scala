object anotherPractice extends App {

  case class Car(var Name: String, var Price1: String, var Price2: Int, var odometer1: Int, var odometer2: Char)
  
  val Astra = new Car("Astra", "£", 9000, 11000, 'm')
  val Focus = new Car("Focus", "£", 8000, 15000, 'm')
  val AClass = new Car("AClass", "£", 8000, 15000, 'm')

  println(Astra, Focus, AClass)

}
