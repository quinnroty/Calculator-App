package calculator.model

class Clear (calculator: Calculator)
extends State(calculator){
  calculator.LHS ="0"
  calculator.RHS ="0"
  calculator.result = "0"

  override def displayNumber(): Double = {
    calculator.LHS.toDouble
  }

  override def clearPressed(): Unit = {
    calculator.state = new Clear(calculator)
  }
  override def numberPressed(number:Int):Unit={
    calculator.LHS += number.toString
    calculator.state = new NumsLHS(calculator)
  }

  override def dividePressed(): Unit = {
    calculator.state = new Division(calculator)
  }

  override def multiplyPressed(): Unit = {
    calculator.state = new Multiplication(calculator)
  }
  override def subtractPressed(): Unit ={
    calculator.state = new Subtraction(calculator)
  }
  override def addPressed(): Unit ={
    calculator.state = new Addition(calculator)
  }
  override def equalsPressed(): Unit ={
    calculator.result = calculator.LHS
    calculator.state = new Equals(calculator)
  }
  override def decimalPressed(): Unit ={
    calculator.LHS = calculator.LHS +"."
    calculator.state = new NumsLHSaftDec(calculator)
  }

}
