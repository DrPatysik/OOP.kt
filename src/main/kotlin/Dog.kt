class Dog(val name:String, val breed:String, val speed:Int,) {
    fun run(){
        val s = "run, ".repeat(speed)
        println(s)
    }
    fun info():String {
        return "Dog's name-$name, breed-${breed}, speed-$speed"
    }
}