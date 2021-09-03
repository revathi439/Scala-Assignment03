object AssignQ3 extends App{
  /*
  return the product of a and the integer passed to the higher order function
   */
  def product(a:Int) = (x:Int)=> a*x

println( product(3)(5)) // product
}