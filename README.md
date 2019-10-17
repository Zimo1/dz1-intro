# Домашнее задание к лекции "Введение в Kotlin"

Для каждой задачи создайте решение на базе Gradle и залейте его в GitHub.

Для этого ДЗ вы можете сдавать всё в виде одного проекта, где каждая задача будет размеща в собственном файле, например:
/src/main/kotlin:
- hw1.kt - main + ваша функция для первой задачи
- hw2.kt - main + ваша функция для второй задачи
- hw3.kt - main + ваша функция для третьей задачи

Все проекты должны быть созданы с использованием Gradle (без него не принимаются).

Не забудьте про [.gitignore](../.gitignore)

Как тестировать: в каждом `main` должно быть несколько вызовов вашей функции, демонстрирующих различные сценарии.

## Задача №1 - Расчёт процента

### Легенда

Вы решили мотивировать пользователей генерировать больше контента (желательно платного). И внедрить следующую схему: чем на большую сумму скачано контента, созданного пользователем, тем меньше %, который берёт платформа с продаж.

Условия следующие:

1. Если предыдущая сумма продаж от 0 до 1 000, то % составляет 30% от суммы
1. Если предыдущая сумма продаж от 1 001 до 10 000, то % составляет 25% от суммы
1. Если предыдущая сумма продаж от 10 001 до 50 000, то % составляет 20% от суммы
1. Если предыдущая сумма продаж от 50 001, то % составляет 15% от суммы

Эксклюзивные авторы (т.е. авторы, публикующие контент только в нашей соц.сети, дополнительно получают -5% к налогам). Например, эксклюзивный автор, продавший на 11 000, будет платить не 20%, а 15%.

Напишите функцию (назовите её `calculateFee`), которая на вход принимает стоимость текущей продажи, предыдущую сумму продаж и флаг эксклюзивности (можете задать его `Boolean` флагом `exclusive`).

Пример вызова функции:
```kotlin
val amount = 200 // стоимость текущей продажи
val total = 11_000 // сумма предыдущих продаж
val fee = calculateFee(200, 11_000)  // exclusive по умолчанию = false
println(fee) // 40
```

Продемонстрируйте вызов с выставленным флагом эксклюзивности и без него.

## Задача №2 - Индекс массы тела

Вы решили расширить свою социальное приложение дополнительной функциональностью. Т.е. помимо основных функций, можно создавать свои мини-приложения (как в Vk). Первое из них - приложение для слежения за своим физическим состоянием.

В любое время достаточно популярными являются приложения, которые по ряду параметров рассчитывают различные характеристики здоровья человека.

Приложение на основании роста и веса человека вычисляет индекс массы тела.

Вам необходимо написать функцию `bodyMassIndex`, которая на вход принимает рост человека в метрах и массу в кг. Функция вычисляет только индекс массы тела.

Полученный результат вы должны использовать в конструкции `when` как выражение, чтобы вывести вердикт, исходя из рассчитанного индекса:

```kotlin
val index = bodyMassIndex(...)
val verdict = when(index) ...
println(verdict)
```

Формулу расчёта и вердикты необходимо получить самостоятельно из [статьи на Википедии](https://ru.wikipedia.org/wiki/Индекс_массы_тела)

## Задача №3 (необязательная) - Время прописью

Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации, например:

* publishedAgo: 30
* результат: менее минуты назад

* publishedAgo: 90
* результат: минуту назад

* publishedAgo: 360
* результат: 6 минут назад

* publishedAgo: 3600
* результат: час назад

* publishedAgo: 7200
* результат: 2 часа назад

Реализуйте подобную функцию.

Примечание: это достаточно сложная задача, поэтому если вы реализуйте механизм учёта до часа (далее отображая - "несколько часов назад"), этого уже будет достаточно для выполнения задачи. 

Самое лучшее, если вы реализуете отображение до года, например, "год назад" и "несколько лет назад".
