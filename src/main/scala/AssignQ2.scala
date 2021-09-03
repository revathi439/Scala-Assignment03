object AssignQ2 extends App{
  /*
  Using library function util.Random.nextInt to print max, min and given numbers */
  def a_rand = util.Random.nextInt
  println("random number is:" +a_rand) // random number is
  def max( a: Int, b: Int): Int =
  {
   if(a>b) a else b
  }
  def min(a: Int, b: Int): Int ={
    if(a>b) b else a
  }
  def secondInt(a: Int, b: Int): Int = b

  val x = util.Random.nextInt
    val y = util.Random.nextInt
    println("maximum number is: " + max(x,y)+" "+ "\n minimun number is:" +min(x,y))// display max and min number
    println("Always second integer: "+secondInt(x,y)) // always second number

}
