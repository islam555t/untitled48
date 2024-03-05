
fun main() {
    var variableName = "Это переменная типа String"
    val NUM = 10
    var word = "Вы сохранили положительное число "
    variableName = "$NUM $word"
    println("Вы сохранили отрицательное число: $variableName, NUM: $NUM, Вы сохранили ноль: $word")
    when {
        NUM < 0 -> println("Вы сохранили отрицательное число")
        NUM > 0 -> println("Вы сохранили положительное число")
        else -> println("Вы сохранили ноль")
    }
}
