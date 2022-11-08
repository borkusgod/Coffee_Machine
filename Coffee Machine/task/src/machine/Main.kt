package machine

fun main() {
	// map for list - water, milk, coffee bean, disposable cups, money
	val coffMachStart = listOf(400, 540, 120, 9, 550)
	initialPrintout(coffMachStart)
	val doWhat = getAction()
	println(doWhat)
	when (doWhat) {
		"buy" -> buy(coffMachStart)
		"fill" -> fill(coffMachStart)
		"take" -> take(coffMachStart)
		else -> println("")
	}
}

fun initialPrintout(fromMain: List<Int>) {
	println("The coffee machine has:")
	println("${fromMain[0]} ml of water")
	println("${fromMain[1]} ml of milk")
	println("${fromMain[2]} g of coffee beans")
	println("${fromMain[3]} disposable cups")
	println("\$${fromMain[4]} of money")
}

fun getAction(): String {
	println("Write an action (buy, fill, take):")
	val getFromUser = readln()
	return getFromUser
}

fun buy(fromMain: List<Int>) {
	// drink types and values
	val espresso = listOf<Int>(250, 16, 4) // water, coffee, price
	val latte = listOf<Int>(350, 75, 20, 7) // water, milk, coffee, price
	val cappuccino = listOf<Int>(200, 100, 12, 6) // water, milk, coffee, price

	// functions for each action
	fun buyEsp(fromMain: List<Int>) {
		println("${fromMain[0] - espresso[0]} ml of water")
		println("${fromMain[1]} ml of milk")
		println("${fromMain[2] - espresso[1]} g of coffee beans")
		println("${fromMain[3] - 1} disposable cups")
		println("${fromMain[4] + espresso[2]} of money")
	}

	fun buyLat(fromMain: List<Int>) {
		println("${fromMain[0] - latte[0]} ml of water")
		println("${fromMain[1] - latte[1]} ml of milk")
		println("${fromMain[2] - latte[2]} g of coffee beans")
		println("${fromMain[3] - 1} disposable cups")
		println("${fromMain[4] + latte[3]} of money")
	}

	fun buyCap(fromMain: List<Int>) {
		println("${fromMain[0] - cappuccino[0]} ml of water")
		println("${fromMain[1] - cappuccino[1]} ml of milk")
		println("${fromMain[2] - cappuccino[2]} g of coffee beans")
		println("${fromMain[3] - 1} disposable cups")
		println("${fromMain[4] + cappuccino[3]} of money")
	}

	println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
	when (readln().toInt()) {
		1 -> buyEsp(fromMain)
		2 -> buyLat(fromMain)
		3 -> buyCap(fromMain)
	}
}

fun fill(fromMain: List<Int>) {
	val itemsInContainer = mutableListOf<Int>()
	println("Write how many ml of water you want to add:")
	val waterIn = readln().toInt()
	itemsInContainer.add(waterIn)
	println("Write how many ml of water you want to add:")
	val milkIn = readln().toInt()
	itemsInContainer.add(milkIn)
	println("Write how many ml of water you want to add:")
	val coffeeIn = readln().toInt()
	itemsInContainer.add(coffeeIn)
	println("Write how many ml of water you want to add:")
	val disposableCupsIn = readln().toInt()
	itemsInContainer.add(disposableCupsIn)

	println("The coffee machine has:")
	println("${fromMain[0] + itemsInContainer[0]} of water")
	println("${fromMain[1] + itemsInContainer[1]} of milk")
	println("${fromMain[2] + itemsInContainer[2]} of coffee beans")
	println("${fromMain[3] + itemsInContainer[3]} of disposable cups")
	println("$${fromMain[4]} of money")
}

fun take(fromMain: List<Int>) {
	println("I gave you $${fromMain[4]}\n")
	println("The coffee machine has:")
	println("${fromMain[0]} ml of water")
	println("${fromMain[1]} ml of milk")
	println("${fromMain[2]} g of coffee beans")
	println("${fromMain[3]} disposable cups")
	println("$0 of money")
}
