open class Monster(val eyes:Int = 2, val legs:Int = 2, val hands:Int = 2 ) {
    constructor(): this(2,2,2 )
    constructor(eyes:Int): this(eyes, 2 , 2 )
    constructor(legs:Int, hands:Int): this(2 ,legs, hands)

    fun printInfo() {
      println(" eyes - ${this.eyes},legs - ${this.legs} , hands - ${this.hands} " )
    }

    fun voice():String{
        return "Voice"
    }

    fun voice(i:Int):String{
        return "Voice, ".repeat(i)
    }
    fun voice(i:Int, word:String):String{
        return "$word, ".repeat(i)
    }
}