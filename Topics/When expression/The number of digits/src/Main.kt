fun main() {
	var count = 0
	var num = readln().toInt()

	while (num != 0) {
		num /= 10
		++count
	}

	println("$count")
}