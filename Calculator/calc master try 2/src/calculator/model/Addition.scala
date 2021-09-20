package calculator.model

class Addition (calculator: Calculator)
extends State(calculator){
  override def displayNumber():Double={
    calculator.LHS.toDouble
  }

  override def clearPressed(): Unit = {
    calculator.state = new Clear(calculator)
  }

  override def numberPressed(number: Int): Unit = {
    calculator.RHS+=number.toString
    calculator.state = new AddNumsRHS(calculator)
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
  override def addPressed():Unit ={
  }

  override def equalsPressed(): Unit = {
    calculator.result = calculator.LHS
    calculator.state = new Equals(calculator)
  }

  override def decimalPressed(): Unit = {
    calculator.RHS = calculator.RHS + "."
    calculator.state = new AddNumsRHSaftDec(calculator)
  }
}
