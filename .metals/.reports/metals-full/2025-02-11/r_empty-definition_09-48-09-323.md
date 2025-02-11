error id: scala/Array#
file:///C:/Users/guill/OneDrive/Escritorio/Asignaturas/3ª%20Año/2ª%20Cuatrimeste/Procesamiento%20de%20datos/Tema1/Ejercicios/EliminarNElementos.scala
empty definition using pc, found symbol in pc: scala/Array#
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -Array#
	 -scala/Predef.Array#

Document text:

```scala
object EliminarPrimerosN {
  def drop(lista: List[Int], n: Int): List[Int] = (lista, n) match {
    case (_, x) if x <= 0 => lista
    case (Nil, _) => Nil
    case (_, x) if x >= lista.length => Nil
    case (_ :: cola, x) => drop(cola, x - 1)
  }

  def main(args: Array[String]): Unit = {
    println(drop(List(), 0))
    println(drop(List(1), 5))
    println(drop(List(1, 2, 5, 7), 3)) 
    println(drop(List(10, 20, 30, 40), 2)) 
  }
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/Array#