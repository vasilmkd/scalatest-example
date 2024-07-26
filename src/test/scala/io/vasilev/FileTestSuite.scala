package io.vasilev

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FileTestSuite extends AnyFunSuite with Matchers {
  (1 to 10).foreach { x =>
    test(s"test $x") {
      if (x % 2 == 0) succeed
      else 1 shouldBe 2
    }
  }
}
