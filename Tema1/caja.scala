// Clase genérica Caja[T]
class Caja[T](private var contenido: T) {
  
  // Método para guardar un valor en la caja
  def guardar(valor: T): Unit = {
    contenido = valor
    println(s"Se ha guardado un nuevo valor en la caja: $valor")
  }

  // Método para obtener el valor almacenado
  def obtener(): T = {
    contenido
  }

  // Método para actualizar el valor almacenado
  def actualizar(valor: T): Unit = {
    contenido = valor
    println(s"Se ha actualizado el contenido de la caja a: $valor")
  }

  // Sobrescribir el método toString para mostrar un mensaje con el contenido
  override def toString: String = {
    s"El contenido de la caja es: $contenido"
  }
}

// Objeto Main para probar la clase Caja
object Main {
  def main(args: Array[String]): Unit = {
    // Crear una caja para almacenar un número entero
    val cajaInt = new Caja[Int](10)  // Inicializa con el valor 10
    println(s"Valor obtenido: ${cajaInt.obtener()}") // Valor obtenido: 10

    // Actualizar el valor almacenado
    cajaInt.actualizar(25)
    println(cajaInt) // El contenido de la caja es: 25

    // Crear una caja para almacenar una cadena de texto
    val cajaString = new Caja[String]("Scala") // Inicializa con la cadena "Scala"
    println(cajaString) // El contenido de la caja es: Scala

    // Guardar un nuevo valor
    cajaString.guardar("Programación Genérica")
    println(cajaString) // El contenido de la caja es: Programación Genérica
  }
}

