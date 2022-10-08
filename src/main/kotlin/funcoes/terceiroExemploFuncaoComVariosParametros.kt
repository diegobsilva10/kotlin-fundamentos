fun main(){
    recebeTiposDeDados(1, " ", 'c',7f, true, false, null, "String" )

}

// Função que pode receber vários tipos de dados
fun <T> recebeTiposDeDados(vararg dados: T){
    for (dados in dados){
        println(dados)
    }
}