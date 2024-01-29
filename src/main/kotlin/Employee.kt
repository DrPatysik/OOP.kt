class Employee(var fullName:String, var position:String, var email:String, var phone:Int, var wage:Int, var age:Int ) {
    var _age = age
        get() = field
        set(value) {field = value}
     fun infoEmployee():String{
        return "Employee fullName is ${this.fullName}, position - ${this.position}, " +
                "email - ${this.email}, phone - ${this.phone}, wage - ${this.wage},age - ${this.age}"
    }

 }