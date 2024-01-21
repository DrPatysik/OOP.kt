import java.util.Scanner

class Worker(val name: String, val position: String, val wage: Int, ) {
    fun infoWorker(name: String, position: String, wage: Int,month:Int ):String {
        val totalWage = wage * month
        return "Worker $name work on position $position get $totalWage for $month month!"
    }
    fun infoAboutWorker( name: String, position: String, wage: Int):String {
        println("How much month? ")
      val month = Scanner(System.`in`).nextInt()
        val sumWage = wage * month

        return "Worker $name work on position $position get $sumWage for $month month! "
    }
}