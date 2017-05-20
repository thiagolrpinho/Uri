/**
  * Created by thiagoluis on 20/05/17.
  */
import org.scalatest.FunSuite
import scala.io.StdIn

class Scalatest extends FunSuite{
  test("Checando o reader"){
    val n1 = StdIn.readLine();

    assert(n1 == "sua")
  }
}
