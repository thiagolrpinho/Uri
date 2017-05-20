import scala.io.StdIn

/**
  * Created by thiagoluis on 20/05/17.
  */
object Uri1066 {
  def main(args: Array[String]): Unit = {
    var pos = 0
    var neg = 0
    var par = 0
    var impar = 0
    for(i <- 0 to 4) {
      var n1 = StdIn.readFloat()
      if(n1%2 == 0) par += 1 else impar +=1
      if(n1 > 0) pos += 1 else if(n1 < 0) neg += 1
    }
    println(par + " valor(es) par(es)")
    println(impar + " valor(es) impar(es)")
    println(pos + " valor(es) positivo(s)")
    println(neg + " valor(es) negativo(s)")
  }
}
