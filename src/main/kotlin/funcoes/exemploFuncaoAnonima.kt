fun main (){
    //CHAMANDO A FUNÇÃO
    println(tamanhoDaString("Texto"))
    var a = 1
    var b = 2
    somarNumero(a, b)

}

//Exemplo de função anonima

val tamanhoDaString: (String) -> Int = {input ->
    input.length
}
//FUNÇÃO ANÔNIMA PARA CÁLCULO SIMPLES
val somaDeNumero: (Int, Int) -> Unit = { i: Int, i1: Int ->
    println (i + i1)
}