// Котлин. Домашнее задание 1
// Задача 2 - Индекс массы тела
// Суслопаров Алексей

fun main(){
    println("Ваш вердикт: ${verdict(bodyMassIndex(1.8, 92.2))}")
    println("Ваш вердикт: ${verdict(bodyMassIndex(1.8, 70.5))}")
    println("Ваш вердикт: ${verdict(bodyMassIndex(1.8, 120.3))}")
    println("Ваш вердикт: ${verdict(bodyMassIndex(1.8, 52.2))}")
}

fun bodyMassIndex(height: Double, weight: Double) = weight/height/height

fun verdict(imt: Double) =
    when {
        imt <= 16.0 -> "Выраженный дефицит массы тела"
        imt <= 18.5 -> "Недостаточная (дефицит) масса тела"
        imt <= 24.99 -> "Норма"
        imt <= 30.0 -> "Избыточная масса тела (предожирение)"
        imt <= 35.0 -> "Ожирение"
        imt <= 40.0 -> "Ожирение резкое"
        else -> "Очень резкое ожирение "
    }