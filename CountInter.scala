import scala.swing._
import java.time
import java.time.LocalTime
import java.util.{Calendar, Date}
import java.util.concurrent.TimeUnit
import java.util.concurrent._
import javax.swing.{JFrame, JLabel}


object CountInter {

  def main(args: Array[String]): Unit = {
    val jf = new JFrame("Home in...")
    jf.setAlwaysOnTop(true)
    jf.setMaximumSize(new Dimension(170,40))
    jf.setMinimumSize(new Dimension(170,40))
    jf.setResizable(false)
    val lab = new JLabel(("Random"))
    jf.add(lab)
    jf.pack()
    jf.setVisible(true)

    def updateLab: Unit = {
      val fmt = new java.text.SimpleDateFormat("d/m/y HH:mm:ss")
      val timeTo: Date = fmt.parse("05/01/2018 16:00:00")

      val cal = Calendar.getInstance()
      cal.setTime(timeTo)

      val cal2: Calendar = Calendar.getInstance()
      //println(CountInter.difference(cal,cal2))
      lab.setText(CountInter.difference(cal, cal2)) //= CountInter.difference(cal, cal2)
    }

    val ex = new ScheduledThreadPoolExecutor(1)
    val task = new Runnable {
      def run() = updateLab
    }
    val f = ex.scheduleAtFixedRate(task, 55, 55, TimeUnit.MILLISECONDS)
    //f.cancel(false)

  }

  def difference(timeUntil: Calendar, timeNow: Calendar): String = {

    val hNow = timeNow.get(Calendar.HOUR)
    val hUntil = timeUntil.get(Calendar.HOUR)
    val mNow = timeNow.get(Calendar.MINUTE)
    val mUntil = timeUntil.get(Calendar.MINUTE)
    val sNow = timeNow.get(Calendar.SECOND)
    val sUntil = timeUntil.get(Calendar.SECOND)
    val msNow = timeNow.get(Calendar.MILLISECOND)
    val msUntil = timeUntil.get(Calendar.MILLISECOND)

    def hDiff(n: Int, u: Int): Int = {
      if(mNow < mUntil) {
        Math.abs(u-n)
      } else {
        Math.abs(u-n - 1)
      }
    }
    def mDiff(n: Int, u: Int): Int = {
      if(n < u) {
        u - n
      } else {
        u - n + 60
      }
    }
    def sDiff(n: Int, u: Int): Int = {
      if(n < u) {
        u - n
      } else {
        u - n + 60
      }
    }
    def msDiff(n: Int, u: Int): Int = {
      if(n < u) {
        u - n
      } else {
        u - n + 1000
      }
    }

    s"  ${hDiff(hNow,hUntil)} h, %02d m, %02d s, %04d ms".format(mDiff(mNow,mUntil),sDiff(sNow,sUntil),msDiff(msNow,msUntil))
  }

}
