package ca.wglabs.pattern

object Parse {

  def intToYesOrNo(choice: Int): String = choice match {
    case 1 => "yes"
    case 0 => "no"
    case _ => "error"
  }

  /**
    * Implement a function that parses the command line argument.
    *
    * hint: Use | operator to indicate 'or'.
    */
  def parseArgument(arg: String) = arg match {
    case "-h" | "--help" => "Sorry, I can't help you."
    case "-v" | "--version" => "Beta"
    case whatever => "Unknown argument: " + whatever
  }

  def parseType(x: Any): String = x match {
    case i:Int => "Integer: " + i
    case _:Double => "a Double"
    case s:String => "I want to say '" + s + "'"
  }

}
