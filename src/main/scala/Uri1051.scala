import scala.io.StdIn
import scala.collection.immutable.StringOps

/**
  * Created by thiagoluis on 20/05/17.
  */


object Uri1051 {
  def main(args: Array[String]): Unit = {
    var n1 = StdIn.readFloat() match {
      case x if x <= 2000 => Isento()
      case x if x <= 3000  => tipoA(x)
      case x if x <= 4500  => tipoB(x)
      case x : Float => tipoC(x)
    }
  }

  def Isento(): Unit ={
    println("Isento")
  }

  def tipoA(valor: Float): Unit ={
    val taxa = ((valor - 2000)*0.08)
    var tax = (f"$taxa%.2f")
    tax = tax.replace(",",".")
    println("R$ " + tax)
  }

  def tipoB(valor: Float): Unit ={
    val taxa = ((1000)*0.08 + (valor - 3000)*0.18)
    var tax = (f"$taxa%.2f")
    tax = tax.replace(",",".")
    println("R$ " + tax)
  }

  def tipoC(valor: Float): Unit ={
    val taxa = ((1000)*0.08 + (1500)*0.18 + (valor - 4500)*0.28)
    var tax = (f"$taxa%.2f")
    tax = tax.replace(",",".")
    println("R$ " + tax)
  }
}
