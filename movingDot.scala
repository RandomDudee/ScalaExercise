
object movingDot extends App {

    args(0) match {
      case "up" => println(up(args))
      case "right" => println(right(args))
      case _ => println("Invalid input, use either \"add\" or \"multiply\" followed by numbers")
    }
  }
  def up = ("/n" + ".")

  }
  def right =  ("up" + " ")


}