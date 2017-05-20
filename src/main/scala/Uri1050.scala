import scala.io.StdIn

/**
  * Created by thiagoluis on 20/05/17.
  */
object Uri1050 {
  def main(args: Array[String]): Unit = {
    var n1 = StdIn.readInt() match {
      case 61 => println("Brasilia")
      case 71 => println("Salvador")
      case 11 => println("Sao Paulo")
      case 21 => println("Rio de Janeiro")
      case 32 => println("Juiz de Fora")
      case 19 => println("Campinas")
      case 27 => println("Vitoria")
      case 31 => println("Belo Horizonte")
      case _ => println("DDD nao cadastrado")
    }
  }
}
