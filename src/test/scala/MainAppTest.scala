import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class MainAppTests extends AnyFunSuite with BeforeAndAfter {

  var commands: Commands = _

  before {
    commands = new Commands()
  }



}