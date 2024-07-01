object MainApp extends App {
  val morseMap = new MorseMap()
  val commands = new Commands

  val morseToText = new MorseToText(morseMap, commands, loop)
  val textToMorse = new TextToMorse(morseMap, commands, loop)

  println("Welcome to the morse code translator")

  def loop() : Unit = {
    println("Would you to convert from text to morse (1) or morse to text (2) or quit (3)")
    val userInput = commands.getInput
    userInput match {
      case "1" => textToMorse.translate()
      case "2" => morseToText.translate()
      case "3" => println("Thank you for using the translator")
      case _ =>
        println("Invalid enter '1', '2' or '3'")
        loop()
    }
  }

  loop()

}
