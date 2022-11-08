// write your function here

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}

fun isGreater(first: Int, second: Int, third: Int, fourth: Int): Boolean {
    return (first + second) > (third + fourth)
}