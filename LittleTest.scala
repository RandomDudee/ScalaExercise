import java.util.Calendar

object LittleTest extends App {

  val now = Calendar.getInstance()
  val currentMinute = now.get(Calendar.MINUTE)
  val currentHour = now.get(Calendar.HOUR_OF_DAY)
  val currentSecond = now.get(Calendar.SECOND)




  println(currentHour,  currentMinute, currentSecond)


}
