import org.scalatest.funsuite.AnyFunSuite

class AssignQ2Test extends AnyFunSuite{
  test("AssignQ2Test"){
    assert(AssignQ2.max(5,9)===9)
    assert(AssignQ2.min(2,3)===2)
    assert(AssignQ2.secondInt(2,5)===5)
  }

}
