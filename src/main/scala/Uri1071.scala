import scala.io.StdIn

/**
  * Created by thiagoluis on 20/05/17.
  */
object Uri1071 {
  def main(args: Array[String]): Unit = {
    var n1 = StdIn.readInt()
    var n2 = StdIn.readInt()
    var sum = 0
    var lista: List
    if(n2 < n1) lista = (n2 until n1).toList
    else lista = (n1 until n2).toList

    for(j <- (n1+1) until n2) if(j%2 == 1) sum += j
    println(sum)
  }
}

