package playground

object scalaPlayground extends App{
  class class1 {
    def hello(name: String): Unit = println(s"Hello $name, I am from class 1")
  }
  class class2 extends class1 with trait1 {   //Inherits from class1 and trait1
    def hello2(name: String): Unit = println(s"Hello $name, I am from class 2")
  }
  trait trait1 {
    def hello3(name:String): Unit = println(s"Hello $name, I am from trait1")
  }
  val greetings = new class2
  greetings.hello("Dylan")
  greetings.hello2("Dylan")
  greetings.hello3("Dylan")

}
