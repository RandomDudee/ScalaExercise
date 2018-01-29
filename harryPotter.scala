import harryPotter.Potion

object harryPotter extends App {

  val aconite = new Ingredient("Aconite")
  val addersFork = new Ingredient("Adder's Fork")
  val dragonHorn = new Ingredient("Dragon Horn")
  val eyeOfNewt = new Ingredient("Eye of Newt")
  val moonstone = new Ingredient("Moonstone")
  val deathCap= new Ingredient("Death-cap")
  val reemBlood= new Ingredient("Re'em blood")
  val pearlDust= new Ingredient("Pearl Dust")
  val nifflersFancy= new Ingredient("Niffler's fancy")
  val nightshade = new Ingredient("Nightshade")

  val doldpPotionIngredients = Set(deathCap,reemBlood)
  val polyPotionIngredients = Set(aconite,addersFork)


  val cauldron = new Cauldron
  // cauldron.brew(Ingredient)




  abstract class Potion (val ingredient1 : Ingredient, val ingredient2: Ingredient) {

  }

  class PolyjuicePotion(ingredient1 : Ingredient, ingredient2: Ingredient) extends Potion(ingredient1, ingredient2) {

  }

  class FailedPotion(ingredient1 : Ingredient, ingredient2: Ingredient) extends Potion(ingredient1, ingredient2)

  class DOLDP(ingredient1 : Ingredient, ingredient2: Ingredient) extends Potion (ingredient1, ingredient2) {
    override def contents: Potion =

  }

  class Ingredient (val name : String)

  class Cauldron{

    def brew (ingredient1: Ingredient, ingredient2: Ingredient) : Potion = {
      if (ingredient1.name =="Aconite" && ingredient2.name =="Adder's Fork") {
        PolyjuicePotion(ingredient1, ingredient2)
      }
      if (ingredient1.name =="Death C" && ingredient2.name =="Adder's Fork") {
        PolyjuicePotion(ingredient1, ingredient2)
      }
    }

  }


}



