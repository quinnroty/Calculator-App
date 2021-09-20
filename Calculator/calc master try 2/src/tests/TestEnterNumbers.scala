package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(5)
    calculator.numberPressed(2)
    calculator.numberPressed(3)
    calculator.numberPressed(4)
    calculator.numberPressed(6)
    calculator.numberPressed(7)
    calculator.numberPressed(8)
    calculator.numberPressed(9)
    calculator.numberPressed(0)
    assert(equalDoubles(calculator.displayNumber(), 12523467890.0), calculator.displayNumber())
    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.dividePressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(),2.5))
    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.dividePressed()
    calculator.numberPressed(1)
    calculator.numberPressed(0)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(),0.5))
    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(),0.25))
    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.numberPressed(10)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(),5))

    //decimal multiples
    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(9)
    calculator.multiplyPressed()
    calculator.numberPressed(9)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(),8.1))

    //real dec multiples
    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(5)
    assert(equalDoubles(calculator.displayNumber(),0.55))


  }

}
