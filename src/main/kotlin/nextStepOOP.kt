
fun main(args:Array<String>){
//    задание с монстрами
    /* var monster:Monster = Monster()
     var monster1:Monster = Monster(eyes = 3)
     var monster2:Monster = Monster(legs = 4, hands = 4)
     var monster3:Monster = Monster(eyes = 1, legs = 4, hands = 3)

      monster2.printInfo()
     println(monster.voice(3,"meow"))*/

//    задание с сотрудниками
     /*val employee = Employee("F","r","ed",3456, 34000, 23)
     println(employee.infoEmployee())

     val employees = arrayOfNulls<Employee>(5)
     employees[0] = Employee("E","reg", "thdk", 86750, 32000, 46  )
     employees[1] = Employee("D","rekr", "tlgfg", 96230, 26000, 34  )
     employees[2] = Employee("W","rfgg", "otjgfg", 56743, 82000, 26  )
     employees[3] = Employee("A","kdfkj", "tutiy", 59870, 96000, 49  )
     employees[4] = Employee("M","gjksg", "poqdm", 78950, 77000, 30  )

     employees.forEach {if(it?._age in 40..100)
     {  println(it?.infoEmployee()) }
     }
*/

//    задание с животными(кошки,собаки)
   val dogBobik = Dog2("Bobik")
   val n = Dog2()
   val bf = Dog2("FSDA")
     /*dogBobik.run(760)
     dogBobik.swim(9)*/
    Dog2.numberOfDogs()

    val catMurka = Cat("Murka")
    val g = Cat("Kisa")
   /* catMurka.run(480)
    catMurka.swim(23)*/
    Cat.numberOfCats()


    val animal = Animal("Lion")
    val ani = Animal("Tiger")
    Animal.numberOfAllAnimals()
}