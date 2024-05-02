/*
4. 温度の変換
世界で使用されている主な温度の単位は、摂氏、華氏、ケルビンの 3 つです。

以下のコード スニペットの初期コードの中に、温度をある単位から別の単位に変換するプログラムを書いてください。

摂氏（C）から華氏（F）: F = 9/5 (° C) + 32
ケルビン（K）から摂氏（C）: C = K - 273.15
華氏（F）からケルビン（K）: K = 5/9 (° F - 32) + 273.15
 */

fun main() {
    val celsiusToFahreheit: (Double) -> Double = {
        9.0 / 5.0 * it + 32 
    }
    val kelvinToCelsius: (Double) -> Double = {
        it - 273.15
    }
    val fahrenheitToKelvin: (Double) -> Double = {
        5.0 / 9.0 * (it - 32) + 273
    }
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahreheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}