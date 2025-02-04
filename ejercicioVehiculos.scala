trait Volador {
  def volar(): Unit = {
    println("Volando por el cielo")
  }
}

trait Navegador {
  def navegar(): Unit = {
    println("Navegando en el agua")
  }
}

trait Conductor {
  def conducir(): Unit = {
    println("Conduciendo por carretera")
  }
}

abstract class Vehiculo(val nombre: String, val combustible: String) {
  def describir(): Unit = {
    println(s"$nombre usa $combustible")
  }
}

class Avion(nombre: String, combustible: String) extends Vehiculo(nombre, combustible) with Volador

class Anfibio(nombre: String, combustible: String) extends Vehiculo(nombre, combustible) with Navegador with Conductor

object Main {
  def main(args: Array[String]): Unit = {

    val boeing = new Avion("Boeing 747", "queroseno")
    boeing.describir()
    boeing.volar()

    println()


    val anphiCar = new Anfibio("AnphiCar", "Híbrido")
    anphiCar.describir()
    anphiCar.conducir()
    anphiCar.navegar()
  }
}
