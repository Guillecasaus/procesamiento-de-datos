error id: `<none>`.
file:///C:/Users/guill/OneDrive/Escritorio/Asignaturas/3ª%20Año/2ª%20Cuatrimeste/Procesamiento%20de%20datos/Tema1/Ejercicios/Ejercicio.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
object ListaSinDuplicados {
  def agregarSiNoExiste(lista: List[Int], elemento: Int): List[Int] = {
    if (lista.contains(elemento)) lista // Si ya está, devuelve la misma lista
    else lista :+ elemento // Si no está, agrega el elemento al final
}

  def main(args: Array[String]): Unit = {
    val listaOriginal = List(1, 2, 3, 4, 5)

    // Prueba con un elemento que ya existe
    val resultado1 = agregarSiNoExiste(listaOriginal, 3)
    println(resultado1) // Salida esperada: List(1, 2, 3, 4, 5)

    // Prueba con un elemento nuevo
    val resultado2 = agregarSiNoExiste(listaOriginal, 6)
    println(resultado2) // Salida esperada: List(1, 2, 3, 4, 5, 6)
  }
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.