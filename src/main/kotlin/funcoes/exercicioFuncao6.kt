//ESSE CÓDIGO FOI FORNECIDO PELA PRÓRPIA EQUIPE DO ANDROID
/*
Objetivo do código

Complete a função printNotificationSummary() para que o programa mostre estas linhas:


You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
 */
fun main() {
    val morningNotification = 99
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages <= 99){
        println("You have ${numberOfMessages} notifications.")
    }else{
       println("Your phone is blowing up! You have 99+ notifications.")
    }
}

