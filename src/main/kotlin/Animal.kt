open class Animal(var name:String) {

   open fun run(distance:Int){
        println("$name ran $distance m. ")
    }

    open fun swim(distance: Int){
        println("$name swam $distance m. ")
    }
}