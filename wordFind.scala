import com.sun.tools.doclets.internal.toolkit.util.DocFinder.Input

object wordFind  {

  def main(args: Array[String]): Unit = {
    val article  : String = "Dragon is a free-flying spacecraft designed to deliver both cargo and people to orbiting destinations. Dragon made history in 2012 when it became the first\n " +
      "commercial spacecraft in history to deliver cargo to the International Space Station and safely return cargo to Earth, a feat previously achieved only by governments. \n" +
      "It is the only spacecraft currently flying that is capable of returning significant amounts of cargo to Earth.\n " +
      "Currently Dragon carries cargo to space, but it was designed from the beginning to carry humans.\n" +
      " Under an agreement with NASA, SpaceX is now developing the refinements that will enable Dragon to fly crew. Dragon's first manned test flight is expected to take place as early as 2018."

    val articalList = article.split("\\W").filter(_.nonEmpty)
    val articalMap = articalList.groupBy(identity).mapValues(_.size)
    val articalSort = articalMap.toList.sortBy(_._2).reverse.take(10)

    println(articalSort)
  }


}
