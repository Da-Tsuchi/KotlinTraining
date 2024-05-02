/*
8. 特殊なオークション
通常のオークションでは、最高額入札者がアイテムの価格を決定します。このオークションでは、入札者がいない場合、自動的に最低価格でオークション会社に売却されます。

以下のコード スニペットの初期コードの中に、null 値許容の Bid? 型を引数として受け取る auctionPrice() 関数を用意してあります。
 */

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
	return bid?.amount ?: minimumPrice
}