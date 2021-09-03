import org.scalatest.funsuite.AnyFunSuite

class AssignQ5Test extends AnyFunSuite{
  test("AssignQ5Test"){
    assert(AssignQ5.conditional[String]("Higherorderfunction", _.size>4, _.toUpperCase)=== "HIGHERORDERFUNCTION")
  }

}
