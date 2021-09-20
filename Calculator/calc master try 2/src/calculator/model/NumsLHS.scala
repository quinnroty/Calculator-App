package calculator.model

class NumsLHS (calculator: Calculator)
extends State(calculator){
  override def displayNumber(): Double = {
    calculator.LHS.toDouble
  }

  override def clearPressed(): Unit = {
    calculator.state = new Clear(calculator)
  }
  override def numberPressed(number:Int):Unit ={
    calculator.LHS+=number.toString
  }

  override def dividePressed(): Unit = {
    calculator.state = new Division(calculator)
  }

  override def multiplyPressed(): Unit = {
    calculator.state = new Multiplication(calculator)
  }

  override def subtractPressed(): Unit = {
    calculator.state = new Subtraction(calculator)
  }

  override def addPressed(): Unit = {
    calculator.state = new Addition(calculator)
  }

  override def equalsPressed(): Unit = {
    calculator.result=calculator.LHS
    calculator.state = new Equals(calculator)
  }
  override def decimalPressed(): Unit ={
    calculator.LHS=calculator.LHS+"."
    calculator.state = new NumsLHSaftDec(calculator)
  }

}
