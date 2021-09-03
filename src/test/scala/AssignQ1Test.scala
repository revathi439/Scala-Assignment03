import org.scalatest.funsuite.AnyFunSuite

class AssignQ1Test extends AnyFunSuite{
  test("Assignment1"){
    assert(AssignQ1.max(10,12)===12)
    assert(AssignQ1.maxthree((5,8,10),AssignQ1.max)=== 10)
  }


}
