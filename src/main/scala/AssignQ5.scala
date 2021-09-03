object AssignQ5 extends App {
/*
conditional function
 */
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }

  val a = conditional[String]("Scala", _.size>4 ,_.toUpperCase)
  println(a)
}