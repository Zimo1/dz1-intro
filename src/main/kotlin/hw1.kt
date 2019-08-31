// Котлин. Домашнее задание 1
// Задача 1 - Расчет процента
// Суслопаров Алексей

fun main() {

    println("Ваша плата: ${calculateFee(200.0, 11_000.0)} руб.")
    println("Ваша плата: ${calculateFee(200.0, 11_000.0, true)} руб.")
    println()
    println("Ваша плата: ${calculateFee(200.0, 60_000.0)} руб.")
    println("Ваша плата: ${calculateFee(200.0, 60_000.0, true)} руб.")
    println()
    println("Ваша плата: ${calculateFee(200.0, 900.0)} руб.")
    println("Ваша плата: ${calculateFee(200.0, 900.0, true)} руб.")
}

fun calculateFee(curSale: Double, lastSale: Double, exclusive: Boolean = false): Double {
    var percent = when {
        lastSale >= 50_001 -> 15.0
        lastSale >= 10_001 -> 20.0
        lastSale >= 1_001 -> 25.0
        else -> 30.0
    }
    if (exclusive) percent -= 5.0
    return curSale*percent/100
}