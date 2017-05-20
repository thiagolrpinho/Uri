import scala.io.StdIn

/**
  * Created by thiagoluis on 20/05/17.
  */

object vertebrado {
  var n2 = StdIn.readLine() match {
    case "ave" => ave
    case "mamifero" => mamifero
  }
}

object ave{
  var n3 = StdIn.readLine() match {
    case "carnivoro" => println("aguia")
    case "onivoro" => println("pomba")
  }
}

object mamifero{
  var n3 = StdIn.readLine() match {
    case "herbivoro" => println("vaca")
    case "onivoro" =>  println("homem")
  }
}

object invertebrado{
    var n2 = StdIn.readLine() match {
      case "inseto" => inseto
      case "anelideo" => anelideo
    }
}

object inseto{
  var n3 = StdIn.readLine() match{
    case "hematofago" => println("pulga")
    case "herbivoro" => println("lagarta")
  }
}

object anelideo{
  var n3 = StdIn.readLine() match{
    case "hematofago" => println("sanguessuga")
    case "onivoro" => println("minhoca")
  }

}
  object Main {
    def main(args: Array[String]) {
      var n1 = StdIn.readLine() match {
        case "vertebrado" => vertebrado
        case "invertebrado" => invertebrado
      }
    }
  }
