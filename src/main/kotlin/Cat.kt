class Cat(name:String):Animal(name) {
   init{ countCreateCats++}
   companion object{
      var countCreateCats = 0
      fun numberOfCats(){
         println("Number of cats created  are $countCreateCats")
      }
   }
   override fun run(distance:Int ) {
      val dist = distance
      if(dist in 1..200)
      {println("Cat $name ran $distance m.")}
      else{
         println("Cat $name can't run $distance m.!")
      }
   }
   override fun swim(distance: Int) {
      println("Cat $name can't swim $distance m.,because it can't swim at all")
   }
}