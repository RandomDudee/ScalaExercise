object MyStringProgram {

  def main(args: Array[String]) {
//  val sort = args.sorted

//    println(sort.toList.sortWith(seanSort))
//
//    def seanSort(a:String, b:String): Boolean = {
//      //println()
//      println(a, b)
//      //a < b.sorted
//      a.startsWith("s")
//      b.startsWith("_")

      val args = Array("bb","aa","Sc", "Sb","sa")
      val (sfirst,rest) = args.toList.sorted.partition(_.startsWith("s"))
      println(sfirst ::: rest)




    }
}


