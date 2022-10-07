<center>
    <h2 align="center">Kotlin Fundamentos</h2>
    <img src="https://kotlinlang.org/docs/images/kotlin-logo.png" width="300px"/>
</center>

Este repositório tem como intuito documentar o meu aprendizado em Kotlin, mais especificamente os fundamentos da lingaguem.
Podendo assim incentivar todos aqueles que vão começar.

## Projetos

Exemplos de projeto:

- Em desenvolvimento

---


## Variaveis

Em kotlin existem duas palavras reservadas para variáveis: ```val``` and ``var``.

- ``val`` torna uma variável IMUTÁVEL
- ``var`` Possibilita que as variáveis sofram alterações durante o desenvolvimento

Exemplo:<a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/strings/Main.kt" target="_blank"> Exemplos de variáveis val e var</a><br>

### Inferência de Tipo

Não é considerado obrigatório declarar o tipo do dado que a variável irá receber, entretanto, caso não seja definido, o próprio
compilador irá fazer isso de forma implicita em tempo de compilação, o nome desse processo
se chama "Inferência de Tipo"

Exemplo: <a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/strings/inferenciaDeTipo.kt" target="_blank"> Exemplos de Inferência de Tipo</a>

---

## Operação Aritmética
As operações matemáticas seguem o mesmo padrão das linguagens de programação

### Ordem de prescedência 
É importante lembrar que, as operações matemáticas em Kotlin também tem ordem de precedência, isso interfere
na forma como monta a operação.
* 1 - Parênteses;
* 2 - Mais/menos unário;
* 3 - Multiplicação, divisão e módulo;
* 4 - Adição e subtração;

<a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/operadoresAritmeticos/OperadoresAritmeticas.kt" target="_blank"> Exemplos de operação aritméticas</a>

---

## Funções

Basicamente função é um "bloco" de um programa que pode realizar uma tarefa específica.
A função ela é útil por que em vez de você escrever uma determinada tarefa várias vezes
pode agrupar a tarefa em funções, neste caso economiza tempo de escrita de código
e posteriormente caso tenha que fazer alguma refatoração, sera necessário mudar apenas a 
a função, e não todo o código em sí.

## Definindo funções 

```
fun nomeDaFuncao(){
}
```
A sintaxe da função é simples, é seguida pela palavra reservada fun + nome da funçao + parametro da função + entre
chaves o corpo da função, ou seja, a tarefa que a função vai realizar

- <a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/funcoes/exemploFuncoesSimples.kt" target="_blank"> Exemplos de Funções Simples</a>



### Funções com parâmetros 
Nenhuma função é obrigatório você definir os parâmetros que ela vai receber,
isso vai depender da tarefa que você realizar, veja exemplo 

```
fun somarNumero (a: Int, b: Int){
    println (a + b)
}
```
A função ela pode receber N parâmetros, no caso acima, recebe apenas dois. Toda a 
tarefa que a função irá realizar nós definimos no body, neste caso quando a função 
for chamada, ela irá imprimir na tela do usuário o resultado dos números que a variável
receber

-  <a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/funcoes/exemploFun%C3%A7oesComParametros.kt" target="_blank"> Exemplos de Funções com parâmetro</a>

### Função com retorno

````
fun imprimindoTexto(): String{
    val texto = "Texto de exemplo"

    return texto
}
````

Existe apenas duas diferenças quando queremos declarar uma função com retorno definido
atribuimos a ela o tipo de retorno, e ao final da instrução utilizamos a palavra reservada "return"

-  <a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/funcoes/exemploFuncoesComRetorno.kt" target="_blank"> Exemplos de Funções com retorno</a>


### Função de uma única linha
Vamos simplificar a função do exemplo acima

`````
fun imprimindoTexto2() = "Texto de exemplo"
}
`````

No caso da função de uma única linha, só é possível caso a função execute apenas uma intrução
e também não é necessário dizer ao kotlin o tipo de retorno da função, já que o próprio kotlin, consegue interpretar

-<a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/funcoes/exemploFuncaoUnicaLinha.kt" target="_blank"> Exemplos de Funções com uma única linha</a>


### Função anônima

As funções anônimas são reconhecidas exatamente pela tarefa em que elas executam, ou pela referência 
que se dá a elas, e as funções anônimas podem conter qualquer número de expressão.

````

val tamanhoDaString: (String) -> Int = {input ->
    input.length
}

````
No exemplo, temos uma função anônima que conta como entrada uma String e a saída retornada
é do tipo Int.

-<a href="https://github.com/diegobsilva10/kotlin-fundamentos/blob/master/src/main/kotlin/funcoes/exemploFuncaoAnonima.kt" target="_blank"> Exemplos de Funções Anônimas</a>


## References

- [Documentação Kotlin](https://kotlinlang.org/docs/basic-syntax.html)
- [Lista de exemplos sobre Kotlin Básico](https://developer.android.com/kotlin/learn) 
- [Mais exemplos e exercicios](https://developer.android.com/codelabs/basic-android-kotlin-compose-first-program#4)
- [Mais exemplos e exercicios](https://hyperskill.org/tracks/18)

developed by [Diego Silva](https://www.linkedin.com/in/diego-silva-2479711a7/)
