object MyMultiplierProgramTwo {

  def main(args: Array[String]): Unit = {

    println(multi(args))

  }

  def multi(numberArray: Array[String]): Int = {


    val intArray = numberArray.map(_.toInt)

    intArray.product

  }


}
