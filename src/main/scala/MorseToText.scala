class MorseToText(morseMap: MorseMap, commands: Commands, returnToMenu: () => Unit) {


  def translate(): Unit = {
    println("Type morse to convert to text:")

    do {
      println("Enter your Morse code:")
      val morseInput = commands.getInput

      if(validateInput(morseInput)) {
        val textTranslation = morseMap.morseToString(morseInput)
        println(s"Text: $textTranslation")
      } else {
        println("Invalid input or the input does not match the translation, only '-' or '.' allowed and enter each morse letter followed by a space if multiple letters")
        println("Please enter a valid message")
      }
    } while (continueTranslation())

    println("Thank you for using the Morse code translator")
  }

  private def validateInput(input: String): Boolean = {
    val cleanInput = input.trim
    val morseSeq = cleanInput.split("\\s+")
    morseSeq.forall(morseSeq => morseMap.reverseMorseCodeMap.contains(morseSeq))
  }

  private def continueTranslation(): Boolean = {
    println("Would you like to translate another Morse code 'yes' or 'no' or 'return' for main menu")
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