package calculator.model


class Calculator() {
  var result: String = "0"
  var LHS: String = "0"
  var RHS: String = "0"
  var preAns: String = "0"
  var state: State = new Clear(this)
  // Accessed by View. You should edit this method as you build functionality
  def displayNumber(): Double = {
    // TODO
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    // TODO
    this.state.clearPressed()
  }

  def numberPressed(number: Int): Unit = {
    // TODO
    this.state.numberPressed(number)
  }

  def dividePressed(): Unit = {
    // TODO
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
    // TODO
    this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    // TODO
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    // TODO
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    // TODO
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    // TODO
    this.state.decimalPressed()
  }


}
