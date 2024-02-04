class Dog2(name:String):Animal(name) {
    constructor():this(name=String())
    init{ countCreateDogs++}
    companion object{
        var countCreateDogs = 0
        fun numberOfDogs(){
            println("Number of dogs created  are $countCreateDogs")
        }
    }
    override fun run(distance:Int ) {
        val dist = distance
        if(dist in 1..500)
        { println("Dog $name ran $distance m.") }
        else{
            println("Dog $name can't run $distance m.!")
        }
    }
    override fun swim(distance: Int) {
        val distSwim = distance
        if(distSwim in 1..10)
        { println("Dog $name swam $distance m.") }
        else{ println("Dog $name can't swim $distance m.")
        }
    }
}