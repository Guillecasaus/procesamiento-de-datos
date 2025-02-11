val listaA = List(1, 2, 3)
val listaB = List(4, 5)

val resultado = for {
    x <- listaA if x%2 == 1
    y <- listaB if y%2 == 1 && x>0
} yield x * y 

println(resultado) 