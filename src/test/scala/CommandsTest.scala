import org.scalatest.BeforeAndAfter
import org.scalatest.funspec.AnyFunSpec
import java.io.ByteArrayInputStream

class CommandsTest extends AnyFunSpec with BeforeAndAfter {

  var commands: Commands = _

  before {
    commands = new Commands()
  }

  it("should return user input trimmed and lowercase"){
    val userInput = "  TeSt InPut  "
    val expectedOutput = "test input"
    val in = new ByteArrayInputStream(userInput.getBytes)
    Console.withIn(in){
      val actualOutput = commands.getInput
      assert(actualOutput == expectedOutput)
    }
  }

  it("should handle empty input"){
    val userInput = "  "
    val expectedOutput = ""
    val in = new ByteArrayInputStream(userInput.getBytes)
    Console.withIn(in) {
      val actualOutput = commands.getInput
      assert(actualOutput == expectedOutput)
    }
  }

  it("should handle input with special characters") {
    val userInput = "  !@#  "
    val expectedOutput = "!@#"
    val in = new ByteArrayInputStream(userInput.getBytes)
    Console.withIn(in) {
      val actualOutput = commands.getInput
      assert(actualOutput == expectedOutput)
    }
  }

}
