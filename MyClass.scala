```scala
class MyClass(val value: Int) {
  def this() = this(0) // Delegating constructor
  def myMethod(): Int = {
    if (value > 10) {
        return value * 2
    } else {
        return value + 5
    }   
  }
}

object Main extends App{
  val instance = new MyClass(12)
  val result = instance.myMethod()
  println(result) // Output: 24
  
  val instance2 = new MyClass()
  val result2 = instance2.myMethod()
  println(result2) // Output: 5
}
```