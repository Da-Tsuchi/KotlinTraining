/**
3. 映画のチケット料金
映画のチケット料金は、通常、映画を観る人の年齢に応じて異なります。

以下のコード スニペットの初期コードの中に、次のような年齢に基づいたチケット料金を計算するプログラムを書いてください。

12 歳以下は、15 ドルの子供料金。
13 歳から 60 歳までは、30 ドルの一般料金（月曜日は 25 ドルの割引料金）。
61 歳以上は、20 ドルのシニア料金（最高齢は 100 歳と想定）。
想定外の年齢が入力された場合は、無効な料金を表す値 -1
**/
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if (age <= 12) {
        return 15
    } else if (age >= 13 && age <= 60) {
        if (isMonday) {
            return 25
        } else {
        	return 30 
        }
    } else if (age >= 61 && age <= 100) {
        return 20
    } else {
        return -1
    }
}