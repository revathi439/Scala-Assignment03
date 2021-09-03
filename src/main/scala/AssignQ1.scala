object AssignQ1 extends App{
  /*
  Higher order function to find greatest number
   */
  def max(a: Int, b: Int): Int = {

    if (a > b) a
    else b
  }
  def maxthree(value: (Int, Int, Int), maxtwo: (Int, Int) => Int): Int = {
    maxtwo(value._1, maxtwo(value._2,value._3))
  }
  val x= 5;val y= 8; val z=9
  val out = maxthree((x,y,z), max)
  println("maximum of three numbers is : " +out)
}
