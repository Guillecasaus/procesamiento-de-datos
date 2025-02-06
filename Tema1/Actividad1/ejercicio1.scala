object Ejercicio1 {

  def invertAndMap[T, U](lista: List[T], funcion: T => U): Map[T, U] = {
    val listaInvertida = lista.reverse 
    listaInvertida.foldLeft(Map[T, U]()) { (mapa, elemento) =>
    mapa + (elemento -> funcion(elemento)) 
    }
  }

  def transformToString(num: Int): String = s"string: $num"

  def square(num: Int): Int = num * num

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)

    val r1 = invertAndMap(l, transformToString)
    println(r1) 

    val r2 = invertAndMap(l, square)
    println(r2) 
  }
}
