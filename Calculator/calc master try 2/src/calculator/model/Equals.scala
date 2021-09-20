package calculator.model

class Equals (calculator: Calculator)
extends State(calculator){
  //calculator.LHS = calculator.result
  calculator.RHS ="0"

  override def displayNumber(): Double = {
    calculator.result.toDouble
  }

  override def clearPressed(): Unit = {
    calculator.state = new Clear(calculator)
  }
  override def numberPressed(number:Int):Unit={
    //calculator.result+=number.toString
    //calculator.LHS=calculator.result+number.toString
    calculator.LHS=number.toString
    calculator.state = new NumsLHS(calculator)
  }

  override def dividePressed(): Unit = {
    calculator.LHS=calculator.result
    calculator.state = new Division(calculator)
  }

  override def multiplyPressed(): Unit = {
    calculator.LHS=calculator.result
    calculator.state = new Multiplication(calculator)
  }

  override def subtractPressed(): Unit = {
    calculator.LHS=calculator.result
    calculator.state = new Subtraction(calculator)
  }

  override def addPressed(): Unit = {
    calculator.LHS=calculator.result
    calculator.state = new Addition(calculator)
  }
  override def equalsPressed(): Unit = {
    calculator.LHS=calculator.result
    calculator.state = new Equals(calculator)
  }

  override def decimalPressed(): Unit = {
    //calculator.LHS=calculator.result
    //calculator.LHS=calculator.LHS.replace(".","")+"."
    calculator.LHS="."
    calculator.state = new NumsLHSaftDec(calculator)
  }

}
