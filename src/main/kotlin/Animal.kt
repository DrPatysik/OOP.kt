open class Animal(var name:String) {
    init{ countCreateAllAnimals++}
    companion object{
        var countCreateAllAnimals = 0
        fun numberOfAllAnimals(){
            println("Number of animals created  are $countCreateAllAnimals")
        }
    }
    open fun run(distance:Int){
        println("$name ran $distance m. ")
    }
    open fun swim(distance: Int){
        println("$name swam $distance m. ")
    }
}