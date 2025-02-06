object Ejercicio2 {
  case class Persona(nombre: String, edad: Int, email: String)

  def agruparPorEdadGroupBy(personas: List[Persona]): Map[Int, List[Persona]] = {
    personas.groupBy(_.edad)
  }

  def agruparPorEdadFoldLeft(personas: List[Persona]): Map[Int, List[Persona]] = {
    personas.foldLeft(Map[Int, List[Persona]]()) { (mapa, persona) =>
      val listaExistente = mapa.getOrElse(persona.edad, List())
      mapa + (persona.edad -> (persona :: listaExistente))
    }
  }

  def main(args: Array[String]): Unit = {
    val personas: List[Persona] = (1 to 10).toList.map(i =>
      Persona(s"Persona$i", 20 + (i % 5), s"persona$i@example.com")
    )

    println("Lista de personas:")
    personas.foreach(println)

    val agrupadoGroupBy = agruparPorEdadGroupBy(personas)
    println("\nAgrupado por edad (groupBy):")
    agrupadoGroupBy.foreach { case (edad, lista) =>
      println(s"Edad $edad: ${lista.map(_.nombre).mkString(", ")}")
    }

    val agrupadoFoldLeft = agruparPorEdadFoldLeft(personas)
    println("\nAgrupado por edad (foldLeft):")
    agrupadoFoldLeft.foreach { case (edad, lista) =>
      println(s"Edad $edad: ${lista.map(_.nombre).mkString(", ")}")
    }
  }
}
