import scala.io.StdIn

/**
  * Created by thiagoluis on 20/05/17.
  */
object Uri1052 {
  def main(args: Array[String]): Unit = {
    var n1 = StdIn.readInt() match {
      case 1 => println("January")
      case 2 => println("February")
      case 3 => println("March")
      case 4 => println("April")
      case 5 => println("May")
      case 6 => println("June")
      case 7 => println("July")
      case 8 => println("August")
      case 9 => println("September")
      case 10 => println("October")
      case 11 => println("November")
      case _ => println("December")
    }
  }

}
