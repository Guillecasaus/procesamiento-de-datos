import scala.util.{Try, Success, Failure}

def divisionWithException(x: Int, y: Int): Int = {
  Try(x / y) match {
    case Success(resultado) => resultado
    case Failure(e: Throwable) => // Captura explícitamente cualquier excepción
      println("Error: " + e.getMessage)
      0
  }
}

// Pruebas
println(divisionWithException(10, 2)) // Salida esperada: 5
println(divisionWithException(10, 0)) // Salida esperada: Error: / by zero y devuelve 0
