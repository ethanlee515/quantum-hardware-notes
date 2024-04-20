abstract class Base {
  def f()
}

class FirstDerived(val message: String) extends Base {
  override def f() = {
    println("First: " + message)
  }
}

class SecondDerived(val message: String) extends Base {
  override def f() = {
    println("Second: " + message)
  }
}

def construct_and_use(
    T : Class[_ <: Base] = classOf[FirstDerived],
    m : String = "test") = {
  val ctor = T.getConstructor(classOf[String])
  val inst = ctor.newInstance("hello world")
  inst.f()
}

construct_and_use()
construct_and_use(classOf[SecondDerived], "Hello world!")
