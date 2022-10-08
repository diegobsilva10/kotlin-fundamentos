package funcoes

fun main (){
    listaDeFilmesOuSeries("Supernatural", "Vingadores", "House of the Dragon", "Game of Thrones")



}

fun listaDeFilmesOuSeries(vararg FilmesOuSeries: String) {
    for (FilmesOuSeries in FilmesOuSeries){
        println(FilmesOuSeries)
    }

}