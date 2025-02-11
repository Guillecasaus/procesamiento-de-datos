import scala.util.{Try, Success, Failure}

def safeParseInt(str: String): String = {
    Try(str.toInt) match {
        case Success(value) => s"Conversion exitosa: $value"
        case Failure(_) => "Error: No se pudo convertir el string a entero."
    }
}

// Pruebas
println(safeParseInt("10"))
println(safeParseInt("10.5"))
println(safeParseInt("abc"))
