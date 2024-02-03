import java.util.stream.IntStream

fun main(args: Array<String>) {

//    вычисление среднего арифмет. возраста людей
    var listOfHuman:MutableList<Human> = mutableListOf()
    listOfHuman.add(Human("John",24,73))
    listOfHuman.add(Human("Evan",37,82))
    listOfHuman.add(Human("Alex",17,65))
    listOfHuman.add(Human("Daniel",70,89))
    listOfHuman.add(Human("Josh",46,115))

    fun averageAge():Double {
        var sum = 0.0
        for(human in listOfHuman){
           sum += human.age }
        val averageOfAge = sum / listOfHuman.size
        return averageOfAge
    }
    println( averageAge() )

/*//    about dog
    val dog:Dog = Dog("Bobik", "ovcharka", 13)
        println(dog.run())
   dog.info("Sharik","pudel" , 12)*/

/*//   про работников
     val worker:Worker = Worker("J","m", 100 )
   println( worker.infoWorker("W","lawyer",50000,10) )
    println()
    println( worker.infoAboutWorker("D", "E",200) )*/
}