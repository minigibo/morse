import org.scalatest.BeforeAndAfter
import org.scalatest.funspec.AnyFunSpec

class MorseMapTest extends AnyFunSpec with BeforeAndAfter {

  var morseMap: MorseMap = _

  before {
    morseMap = new MorseMap()
  }

  describe("MorseMap") {

    it("should convert a character to Morse code") {
      val char = 'a'
      val expectedMorse = ".-"
      val actualMorse = morseMap.charToMorse(char)
      assert(actualMorse == expectedMorse)
    }

    it("should convert a string to Morse code") {
      val string = "abc"
      val expectedMorse = ".-,-...,-.-."
      val actualMorse = morseMap.stringToMorse(string)
      assert(actualMorse == expectedMorse)
    }

    it("should convert Morse code to a character") {
      val morse = ".-"
      val expectedChar = 'a'
      val actualChar = morseMap.morseToChar(morse)
      assert(actualChar == expectedChar)
    }

    it("should convert Morse code to a string") {
      val morse = ".- -... -.-."
      val expectedString = "abc"
      val actualString = morseMap.morseToString(morse)
      assert(actualString == expectedString)
    }
  }
}
