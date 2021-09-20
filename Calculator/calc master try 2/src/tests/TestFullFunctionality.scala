package tests
import calculator.model.Calculator
import org.scalatest.FunSuite
class TestFullFunctionality extends FunSuite{
  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }
  test("Test full functionality"){
    val c:Calculator=new Calculator()
    c.numberPressed(5)
    c.addPressed()
    c.numberPressed(5)
    c.equalsPressed()
    c.addPressed()
    c.numberPressed(5)
    c.equalsPressed()
    assert(equalDoubles(c.displayNumber(),15))

    c.clearPressed()
    assert(equalDoubles(c.displayNumber(),0.0))
    c.numberPressed(5)
    c.addPressed()
    c.numberPressed(5)
    c.dividePressed()
    c.numberPressed(10)
    c.equalsPressed()
    assert(equalDoubles(c.displayNumber(),1.0))

    c.clearPressed()
    c.numberPressed(7)
    c.addPressed()
    c.multiplyPressed()
    c.numberPressed(3)
    c.equalsPressed()
    assert(equalDoubles(c.displayNumber(),21.0))
  }

}
