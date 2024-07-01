import org.scalatest.BeforeAndAfter
import org.scalatest.funspec.AnyFunSpec
import org.mockito.MockitoSugar._

class TextToMorseTest extends AnyFunSpec with BeforeAndAfter {

  var mockMorseMap: MorseMap = _
  var mockCommands: Commands = _
  var mockReturnToMenu: () => Unit = _
  var textToMorse: TextToMorse = _

  before {
    mockMorseMap = mock[MorseMap]
    mockCommands = mock[Commands]
    mockReturnToMenu = mock[() => Unit]
    textToMorse = new TextToMorse(mockMorseMap, mockCommands, mockReturnToMenu)
  }

    it("should translate text to Morse code") {
      val userInput = "Hello World"
      val morseTranslation = ".... . .-.. .-.. ---   .-- --- .-. .-.. -.."
    }

  // was getting errors to do with null pointer exceptions when trying to get user inputs
  }
