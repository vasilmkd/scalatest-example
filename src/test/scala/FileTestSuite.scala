import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FileTestSuite extends AnyFunSuite with Matchers {
  Seq(1, 2, 3).foreach { x =>
    test(s"test $x") {
      None shouldBe empty
    }
  }
}
