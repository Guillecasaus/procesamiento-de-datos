object Main {
  def Operar(Param1: Int, Param2: Int, Param3: (Int, Int) => Int): Int = {
    Param3(Param1, Param2) 
  }

  def suma(a: Int, b: Int): Int = {
    a + b
  }

  def multiplicacion(a: Int, b: Int): Int = {
    a * b
  }

  def main(args: Array[String]): Unit = {
    val resultadoSuma = Operar(4, 5, suma) 
    println(s"Resultado de la suma: $resultadoSuma")

    val resultadoMultiplicacion = Operar(4, 5, multiplicacion) 
    println(s"Resultado de la multiplicación: $resultadoMultiplicacion")
  }
}
