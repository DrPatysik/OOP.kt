// import java.lang.System.*
import java.util.Scanner
// import kotlin.time.times


class Worker(val name: String, val position: String, val wage: Int, ) {

    fun infoAboutWorker( name: String, position: String, wage: Int):String {
        println("How much month? ")
      val month = Scanner(System.`in`).nextInt()
        val sumWage = wage * month

        return "Worker $name work on position $position get $sumWage for $month month! "
    }
}