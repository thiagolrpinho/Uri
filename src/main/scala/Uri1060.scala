import scala.io.StdIn

/**
  * Created by thiagoluis on 20/05/17.
  */
object Uri1060 {
  def main(args: Array[String]): Unit = {
    var pos = 0
    for(i <- 0 to 5) {
      var n1 = StdIn.readFloat()
      if(n1 > 0) pos += 1
    }
    println(pos + " valores positivos")
  }
}
