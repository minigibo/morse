class TextToMorse(morseMap: MorseMap, commands: Commands, returnToMenu: () => Unit) {

  def translate() : Unit = {
    println("Type a character or a string to convert to morse:")
    do {
      println("Enter your message:")
      val userInput = commands.getInput

      if (validateInput(userInput)) {
        val morseTranslation = morseMap.stringToMorse(userInput)
        println(s"Morse code: $morseTranslation")
      } else {
        println("Invalid input. Only letters, numbers, or space are allowed.")
        println("Please enter a valid message")
      }
    } while (continueTranslation())

    println("Thank you for using the Morse code translator")
  }

  private def validateInput(input: String): Boolean = {
    input.forall(letter => morseMap.morseCodeMap.contains(letter.toLower))
  }

  private def continueTranslation(): Boolean = {
    println("Would you like to translate another message 'yes' or 'no' or 'return' for main menu")
    val response = commands.getInput
    response match {
      case "yes" => true
      case "no" => false
      case "return" =>
        println("Returning to menu")
        returnToMenu()
        false
      case _ =>
        println("Invalid input. Enter 'yes', 'no' or 'return'")
        continueTranslation()
    }
  }
}
