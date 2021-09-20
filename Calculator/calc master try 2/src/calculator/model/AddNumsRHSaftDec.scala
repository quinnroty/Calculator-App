package calculator.model

class AddNumsRHSaftDec (calculator: Calculator)
extends State(calculator){
  override def displayNumber(): Double = {
    calculator.RHS.toDouble
  }

  override def clearPressed(): Unit = {
    calculator.state = new Clear(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.RHS+=number.toString
  }

  override def dividePressed(): Unit = {
    calculator.LHS = (calculator.LHS.toDouble + calculator.RHS.toDouble).toString
    calculator.RHS = "0"
    calculator.state = new Division(calculator)
  }
  override def multiplyPressed(): Unit = {
    calculator.LHS = (calculator.LHS.toDouble + calculator.RHS.toDouble).toString
    calculator.RHS = "0"
    calculator.state = new Multiplication(calculator)
  }

  override def subtractPressed(): Unit = {
    calculator.LHS = (calculator.LHS.toDouble + calculator.RHS.toDouble).toString
    calculator.RHS = "0"
    calculator.state = new Subtraction(calculator)
  }

  override def addPressed(): Unit = {
    calculator.LHS = (calculator.LHS.toDouble + calculator.RHS.toDouble).toString
    calculator.RHS = "0"
    calculator.state = new Addition(calculator)
  }

  override def equalsPressed(): Unit = {
    calculator.result = (calculator.LHS.toDouble+calculator.RHS.toDouble).toString
    calculator.RHS = "0"
    calculator.state = new Equals(calculator)
  }
  override def decimalPressed(): Unit ={
  }

}
