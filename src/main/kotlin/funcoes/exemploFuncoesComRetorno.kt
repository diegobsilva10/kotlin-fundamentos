fun main(){
    val nome = "Diego"
    var a = 1
    var b = 2

    // CHAMANDO A FUNÇÃO
    println(imprimindoTexto())

    //CHAMANDO A FUNÇÃO
    println( hello(nome))

    //CHAMANDO A FUNÇÃO
    println( soma(a, b))
}

//Exemplo função com retorno
fun imprimindoTexto(): String{
    val texto = "Texto de exemplo"

    return texto
}
//EXEMPLO DE FUNÇÃO COM RETORNO, RETORNANDO UMA STRING
fun hello (nome: String): String{
    return "Olá $nome"
}

//EXEMPLO DE FUNÇÃO QUE RETORNA UM VALOR DO TIPO INT
fun soma(a: Int,b: Int ): Int{
    return a+b
}