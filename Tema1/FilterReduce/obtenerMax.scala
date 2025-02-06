object NumeroMasAlto {
  def main(args: Array[String]): Unit = {
    val numeros = List(22, 44, 33, 87, 98)

    val maximo = numeros
      .filter(_ => true) 
      .reduce((a, b) => if (a > b) a else b)

    // Imprimir el resultado
    println(s"El numero mas alto es: $maximo")
  }
}

