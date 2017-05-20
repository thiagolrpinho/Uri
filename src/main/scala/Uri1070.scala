  import scala.io.StdIn

  /**
    * Created by thiagoluis on 20/05/17.
    */
  object Uri1070 {
    def main(args: Array[String]): Unit = {
      var n1 = StdIn.readInt()
      var i = 0
      while (i < 6) {
        if (n1 % 2 == 1) {
          println(n1)
          i += 1
        }
        n1 += 1
      }
    }
  }

