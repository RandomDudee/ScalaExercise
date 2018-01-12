
import scala.annotation.tailrec


def howPretty(input: String) : String = {
  @tailrec
  def fn (x : String, counter: Int ): String = {
    if (x.isEmpty()) {
      if (counter == 0)
        "Not pretty"
      else if (counter == 1)
        "Pretty"
      else
        "Very Pretty "

    }
    else if (x.head == 'e'){
      fn(x.tail, counter + 1)
    }
    else {
      fn(x.tail, counter + 0)
    }

  }
  fn(input, 0)
}
howPretty("Jecke")
howPretty("Joe")
howPretty("Jack")

// TODO find more than one 'e' and also find 'a' in howPretty

// Create a function called how balanced, if it has equal number of "E's" then its is balanced
//otherwise it is unbalanced


def howBalanced(input: String) : String = {
  @tailrec
  def fn (x : String, counter: Int): String = {
    if (x.isEmpty()) {
      if (counter  % 2 == 0 )
        "Is Balanced"
      else
        "Not Balanced"

    }
    else if (x.head == 'e'){
      fn(x.tail, counter + 1)
    }
    else{
      fn(x.tail, counter + 0)
    }

  }
  fn(input , 0)
}
howBalanced("Jecke")
howBalanced("Joe")
howBalanced("Jack")

def count(input: String, how: (Int) => String, charToMatch: Char) : String = {
  @tailrec
  def fn (x : String, counter: Int): String = {
    if (x.isEmpty()) {
      how(counter)
    }
    else if (x.head == charToMatch){
      fn(x.tail, counter + 1)
    }
    else{
      fn(x.tail, counter + 0)
    }

  }
  fn(input , 0)
}

def balancedHow(counter: Int): String =
  if (counter  % 2 == 0 )
    "Is Balanced"
  else
    "Not Balanced"

def prettyHow(counter: Int): String =
  if (counter == 0)
    "Not pretty"
  else if (counter == 1)
    "Pretty"
  else
    "Very Pretty "

count("Jecke", balancedHow, 'c')

count("Jecke", prettyHow, 'c')



def count2(input: String, how: (Int) => String, matcher: (Char) => Boolean )   : String = {
  @tailrec
  def fn (x : String, counter: Int): String = {
    if (x.isEmpty()) {
      how(counter)
    }
    else if (matcher(x.head)){
      fn(x.tail, counter + 1)
    }
    else{
      fn(x.tail, counter + 0)
    }

  }
  fn(input , 0)
}

count2("Jecke", balancedHow, (char: Char) => char.isLower)
count2("Jack", balancedHow, (char: Char) => char.isLower)
count2("ELaine", prettyHow, (char: Char) => char.isLower)






//println(input.indexOf("J"))
//
//val pos1 = input.indexOf("e")
//
//if (pos1 > 0) {
//  println("Has E")
//} else {
//  println("No E")
//}
//
//val pos2 = input.indexOf("e",pos1 +1)
//
//if (pos2 >=  0) {
//  println("Is Pretty")
//} else {
//    println("Not Pretty")
//  }



//Try to make a function . reuse the function to