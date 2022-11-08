import org.w3c.dom.ranges.Range

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()
    val e: Int = readln().toInt()

	val firstRange = a..b
	val secondRange = c..d
	if (e in firstRange && e in secondRange) {
		println("true")
	} else {
		println("false")
	}
}