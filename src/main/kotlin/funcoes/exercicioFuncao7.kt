package funcoes

/*
Complete a função ticketPrice() para que o programa mostre estas linhas:


The movie ticket price for a person aged 5 is $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.
 */

fun main() {
    val child = 12
    val adult = 60
    val senior = 101

    val isMonday = true

    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int? {
    if (age <= 12) {
        return 15
    }
    else if (age == 13 || age <= 60 && isMonday == true){
        return  25
    }
    else if (age == 61 || age <= 100) {
        return 20
    }
    else{
        return -1
    }
}
