
fun main() {

    // Primeira Solução
    print("Digite um número: ")
    val breadFromFrodo = readln()!!.toString()
    print("Digite outro número: ")
    val breadFromSam = readln()!!.toString()

    totalLembas(breadFromFrodo, breadFromSam)
    println()

    //Solução Simplificada
    print("Digite um número: ")
    val breadFromFrodo2 = readln()!!.toInt()
    print("Digite outro número: ")
    val breadFromSam2 = readln().toInt()

    (totalLembas2(breadFromFrodo2, breadFromSam2))

}
//PRIMEIRA SOLUÇÃO
fun totalLembas(first: String, second: String) = print(first.toInt() + second.toInt())

//FUNÇÃO SIMPLIFICADA
fun totalLembas2 (breadFromFrodo2 : Int, breadFromSam2: Int){
    println("Resultado da solução simplificada: ${breadFromFrodo2 + breadFromSam2}")
}

