fun main (){
    calculaMedia(3.5, 5.4,9.8,62.0)


}

fun calculaMedia(vararg n: Double) {
    var soma: Double = 0.0
    for (numero in n) {
        soma += numero
    }
    println("Media ${soma / n.size}")
}
