import scala.io.StdIn.readLine

sealed trait Input{
  def getInput: String
}

class Commands extends Input {

 def getInput: String= {
   val userInput = readLine().trim.toLowerCase()
   userInput
 }
}
