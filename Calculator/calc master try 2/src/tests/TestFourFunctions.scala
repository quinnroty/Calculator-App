package tests
import calculator.model.Calculator
import org.scalatest.FunSuite
class TestFourFunctions extends FunSuite {
  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }
  test("Test 4 functions"){
    val calc:Calculator = new Calculator()
    calc.numberPressed(5)
    calc.multiplyPressed()
    calc.numberPressed(4)
    calc.equalsPressed()
    assert(equalDoubles(calc.displayNumber(),20.0))
    calc.clearPressed()
    calc.numberPressed(2)
    calc.numberPressed(5)
    calc.dividePressed()
    calc.numberPressed(5)
    calc.equalsPressed()
    assert(equalDoubles(calc.displayNumber(),5.0))
    calc.clearPressed()
    calc.numberPressed(1)
    calc.decimalPressed()
    calc.decimalPressed()
    calc.numberPressed(2)
    calc.decimalPressed()
    calc.addPressed()
    calc.numberPressed(4)
    calc.decimalPressed()
    calc.numberPressed(3)
    calc.equalsPressed()
    assert(equalDoubles(calc.displayNumber(),5.5))
    calc.clearPressed()
    calc.numberPressed(6)
    calc.numberPressed(7)
    calc.numberPressed(8)
    calc.decimalPressed()
    calc.numberPressed(9)
    calc.subtractPressed()
    calc.numberPressed(0)
    calc.decimalPressed()
    calc.numberPressed(9)
    calc.equalsPressed()
    assert(equalDoubles(calc.displayNumber(),678))

    //decimal rhs
    calc.clearPressed()
    calc.numberPressed(6)
    calc.numberPressed(0)
    calc.dividePressed()
    calc.numberPressed(5)
    calc.decimalPressed()
    calc.numberPressed(5)
    calc.equalsPressed()
    assert(equalDoubles(calc.displayNumber(),10.909090909090908))

    //real rhs dec
    calc.clearPressed()
    calc.decimalPressed()
    calc.numberPressed(5)
    calc.decimalPressed()
    calc.numberPressed(5)
    assert(equalDoubles(calc.displayNumber(),0.55))
    calc.addPressed()
    calc.decimalPressed()
    calc.decimalPressed()
    calc.numberPressed(4)
    calc.numberPressed(5)
    calc.equalsPressed()
    assert(equalDoubles(calc.displayNumber(),1.0))
  }
}
