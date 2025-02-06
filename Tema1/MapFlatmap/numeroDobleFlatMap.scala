object TransformarNumerosFlatmap {
  def main(args: Array[String]): Unit = {
    val numeros = List(1, 2, 3, 4, 5)

    val transformado = numeros.flatMap(n => List(n, n * 2))

    println("Flatmap: " + transformado)
  }
}