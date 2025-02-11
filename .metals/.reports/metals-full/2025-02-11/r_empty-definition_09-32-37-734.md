error id: scala/package.Nil.
file:///C:/Users/guill/OneDrive/Escritorio/Asignaturas/3ª%20Año/2ª%20Cuatrimeste/Procesamiento%20de%20datos/Tema1/Ejercicios/Ejercicio.scala
empty definition using pc, found symbol in pc: scala/package.Nil.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -Nil.
	 -Nil#
	 -Nil().
	 -scala/Predef.Nil.
	 -scala/Predef.Nil#
	 -scala/Predef.Nil().

Document text:

```scala
object ListaSinDuplicados {
  def agregarSiNoExiste(lista: List[Int], elemento: Int): List[Int] = {
    if (lista.contains(elemento)) lista 
    else lista :+ elemento 
}

  def main(args: Array[String]): Unit = {
    val listaOriginal = List(1, 2, 3, 4, 5)

    val resultado1 = agregarSiNoExiste(listaOriginal, 3)
    println(resultado1)

    val resultado2 = agregarSiNoExiste(listaOriginal, 6)
    println(resultado2)
  }
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/package.Nil.