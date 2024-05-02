/*
7. 折りたたみ式スマートフォン
通常、スマートフォンの画面は、電源ボタンを押すとオンとオフが切り替わります。一方、折りたたみ式スマートフォンを折りたたんだ場合、メインの内部画面は、電源ボタンを押したときにオンになりません。

以下のコード スニペットの初期コードの中に、Phone クラスを継承する FoldablePhone クラスを書いてください。そのクラスには、以下のものを含めてください。

スマートフォンが折りたたまれているかどうかを示すプロパティ。
スマートフォンが折りたたまれていないときにだけ画面をオンにする、Phone クラスとは異なる動作の switchOn() 関数。
折りたたみ状態を変更するメソッド。
 */

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFold: Boolean = true): Phone() {
    
    override fun switchOn() {
        if (isFold == false) {
            isScreenLightOn = true
        } 
    }
    
    fun fold() {
        isFold = true
    }

    fun unfold() {
        isFold = false
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}