class MorseMap {

  val morseCodeMap: Map[Char, String] = Map(
    'a' -> ".-",    'b' -> "-...",  'c' -> "-.-.",  'd' -> "-..",   'e' -> ".",
    'f' -> "..-.",  'g' -> "--.",   'h' -> "....",  'i' -> "..",    'j' -> ".---",
    'k' -> "-.-",   'l' -> ".-..",  'm' -> "--",    'n' -> "-.",    'o' -> "---",
    'p' -> ".--.",  'q' -> "--.-",  'r' -> ".-.",   's' -> "...",   't' -> "-",
    'u' -> "..-",   'v' -> "...-",  'w' -> ".--",   'x' -> "-..-",  'y' -> "-.--",
    'z' -> "--..",
    '0' -> "-----", '1' -> ".----", '2' -> "..---", '3' -> "...--", '4' -> "....-",
    '5' -> ".....", '6' -> "-....", '7' -> "--...", '8' -> "---..", '9' -> "----.",
    ' ' -> "/"
  )

  val reverseMorseCodeMap: Map[String, Char] = morseCodeMap.map(_.swap)

  def charToMorse(char: Char) : String = morseCodeMap.getOrElse(char.toLower,"")

  def stringToMorse(string: String) : String = {
    string.map(charToMorse).mkString(",")
  }

  def morseToChar(morse: String) : Char = reverseMorseCodeMap.getOrElse(morse, '?')

  def morseToString(morse: String) : String = {
    morse.split(" ").map(morseToChar).mkString
  }
  }
