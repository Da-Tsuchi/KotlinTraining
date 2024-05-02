/**
2. モバイル通知
通常、スマートフォンには通知の概要が表示されます。

以下のコード スニペットの初期コードの中に、受信した通知数に基づいて概要メッセージを出力するプログラムを書いてください。メッセージには次の内容を入れてください。

通知数が 100 未満の場合は、正確な通知数。
通知数が 100 以上の場合は、99+。
**/
fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages<100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
    	
}