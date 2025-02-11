object BorrarElementos {
  def borraNElementos(list: List[Any], elementosABorrar: Int): List[Any] = {
    list match {
      case _ :: t if elementosABorrar > 0 => borraNElementos(t, elementosABorrar - 1)
      case _ => list 
    }
  }

  def main(args: Array[String]): Unit = {
    println(borraNElementos(List(), 0)) // List()
    println(borraNElementos(List(1), 5)) // List()
    println(borraNElementos(List(1, 2, 5, 7), 3)) // List(7)
    println(borraNElementos(List(10, 20, 30, 40), 2)) // List(30, 40)
  }
}
