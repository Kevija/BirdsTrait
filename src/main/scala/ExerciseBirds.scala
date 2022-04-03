//TODO create FlightTrait trait with fly method declaration (no need to define it, just declare it)

//TODO create RunningTrait with at least run method declaration

//TODO create SwimmingTrait with swim method declaration inside

//TODO create Penguin class extended with appropriate traits
//TODO create Chicken class extended with appropriate traits
///optional create generic Bird class first and extend that
//There is no one True solution here

//TODO create two penguin objects
//TODO make them swim
//TODO create two chicken objects
//TODO make the chickens run

//BONUS maybe make some more birds? :)

//traits and classes go here (or in a separate file)

class Penguin extends RunningTrait with SwimmingTrait {
   def run(): Unit = println("I am running")
   def swim(): Unit = println("I am swimming")
}

class Chicken extends FlightTrait with RunningTrait {
  def fly(): Unit = println("I am flying")
  def run(): Unit = println("I am running")
}

class Duck extends FlightTrait with RunningTrait with SwimmingTrait {
   def fly(): Unit = println("I am flying")
   def run(): Unit = println("I am running")
   def swim(): Unit = println("I am swimming")
}

object ExerciseBirds extends App {
  println("Let's create some birds using traits!")

  val pingFirst  = new Penguin()
  pingFirst.swim()

  val pingSecond = new Penguin()
  pingSecond.swim()

  val chickFirst = new Chicken()
  chickFirst.run()

  val chickSecond = new Chicken()
  chickSecond.run()

  val myDuck = new Duck()
  myDuck.fly()
  myDuck.run()
  myDuck.swim()

}
