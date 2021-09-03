object AssignQ4 extends App {
/*
reviewing another developers code
 */
  def fzero(x: Int, f: Int => Unit): Int = {
      f(x); x
    }
    fzero(10, a => println("the number is:" + a)) // output

}

