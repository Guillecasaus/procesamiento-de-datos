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

    def sum(ints: List[Int]): Int ={
        ints match{
            case Nil => 0
            case h :: Nil => h
            case h :: t => h + sum(t)
        }
    }
    sum(List())
    sum(List(16))
    sum(List(1,2,3))
  }
}
