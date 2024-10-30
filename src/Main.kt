fun main() {

}

//Функция для задачи 1
fun Int.getSquare() = this * this

//Функция для задачи 2
fun String.concat(string: String) = this + string

//Функция для задачи 3
fun String.getLastIndex() = this.length - 1

//Дополнительная функция для задачи 3
fun String.getLastChar() = this.toCharArray()[this.length - 1]

//Функция для задачи 4
fun Int.sqrt() = kotlin.math.sqrt(this.toDouble())