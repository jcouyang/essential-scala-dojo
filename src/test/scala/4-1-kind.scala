package free
import monad._
import org.scalatest._

class `4-1-Kind` extends AsyncFlatSpec with Matchers {

behavior of "FunctionK"
it should "create a FunctionK from `Box[_]` to `Sphere[_]`" in {
  Printable.format(Sphere("hill")) shouldBe "\"hill\""
}

}