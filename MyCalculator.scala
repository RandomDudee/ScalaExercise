object MyCalculator {

  def main(args: Array[String]): Unit = {


   println(add(args))

  }

  def add(numberArray: Array[String]): Int = {


    val intArray = numberArray.map(_.toInt)

    intArray.sum

  }

  def multi(numberArray: Array[String]): Int = {


    val intArray = numberArray.map(_.toInt)

    intArray.product

}




}
