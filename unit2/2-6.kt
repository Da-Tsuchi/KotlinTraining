/*
6. インターネット プロフィール
オンライン ウェブサイトで、必須の項目と必須でない項目があるプロフィールの入力を求められることがよくあります。たとえば、プロフィールを作るために個人情報や紹介者へのリンクを記入するなどします。

以下のコード スニペットの初期コードの中に、個人のプロフィール情報を出力するプログラムを書いてください。
 */

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       println("Name: $name")
       println("Age: $age")
       if (hobby != null) {
           print("Likes to $hobby. ")
       }
       if (referrer != null) {
           print("Has a referrer named ${referrer.name}")
       		if(referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
       
       } else {
           print("Doesn't have a referrer.")
       } 
       print("\n\n")
       
    }
}