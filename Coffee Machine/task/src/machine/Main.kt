package machine



fun main() {
	// map for list - water, milk, coffee bean, disposable cups, money
	val coffMachStart = listOf(400, 540, 120, 9, 550)
	// copy coffMachStart into this and use until exit so you can maintain levels
	var copyOfMachStartList = coffMachStart.toMutableList()

	val whileVar = true
	while (whileVar) {
		val doWhat = getAction()
		if (doWhat == "buy") {
			val getReturnBuy = buy(copyOfMachStartList)
			copyOfMachStartList = getReturnBuy
		} else if (doWhat == "fill") {
			val getReturnFill = fill(copyOfMachStartList)
			copyOfMachStartList = getReturnFill
		} else if (doWhat == "take") {
			take(copyOfMachStartList)
		} else if (doWhat == "remaining") {
			pOutMachineTotals(copyOfMachStartList)
		} else if (doWhat == "exit") {
			break
		}
	}

}

fun pOutMachineTotals(fromMain: MutableList<Int>) {
	println("\nThe coffee machine has:")
	println("${fromMain[0]} ml of water")
	println("${fromMain[1]} ml of milk")
	println("${fromMain[2]} g of coffee beans")
	println("${fromMain[3]} disposable cups")
	println("\$${fromMain[4]} of money")
}

fun getAction(): String {
	println("\nWrite an action (buy, fill, take, remaining, exit):")
	return readln()
}

fun buy(fromMain: MutableList<Int>): MutableList<Int> {
	// drink types and values
	val espresso = listOf(250, 16, 4) // water, coffee, price
	val latte = listOf(350, 75, 20, 7) // water, milk, coffee, price
	val cappuccino = listOf(200, 100, 12, 6) // water, milk, coffee, price
	//val returnFromTrans = fromMain // list to return from transactions

	// functions for each action
	fun buyEsp(fromMain: MutableList<Int>): MutableList<Int> {
		if (
		fromMain[0] >= espresso[0] &&
		fromMain[2] >= espresso[1] &&
		fromMain[3] >= 1
		) {
			println("I have enough resources, making you a coffee!\n")
			// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
			fromMain[0] -= espresso[0]
			fromMain[2] -= espresso[1]
			fromMain[3] -= 1
			fromMain[4] += espresso[2]
			return fromMain
		} else if (
			fromMain[0] < espresso[0] ||
			fromMain[2] < espresso[2] ||
			fromMain[3] < 1
		) {
			val containerForLowItems = mutableListOf<String>()
			var stringContainer = ""
			if (fromMain[0] < espresso[0]) {
				containerForLowItems.add("water")
			} else if (fromMain[2] < espresso[2]) {
				containerForLowItems.add("coffee")
			}
			if (containerForLowItems.size == 1) {
				stringContainer = containerForLowItems[0]
			} else if (containerForLowItems.size == 2) {
				stringContainer = "${containerForLowItems[0]} and ${containerForLowItems[1]}"
			}
			println("Sorry, not enough $stringContainer!\n")
		}
		return fromMain
	}

	fun buyLat(fromMain: MutableList<Int>): MutableList<Int> {
		if (
			fromMain[0] >= latte[0] &&
			fromMain[1] >= latte[1] &&
			fromMain[2] >= latte[2] &&
			fromMain[3] >= 1
		) {
			println("I have enough resources, making you a coffee!\n")
			// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
			//val returnFromTrans = fromMain.toMutableList()
			fromMain[0] -= latte[0]
			fromMain[1] -= latte[1]
			fromMain[2] -= latte[2]
			fromMain[3] -= 1
			fromMain[4] += latte[3]
			return fromMain
		} else if (
			fromMain[0] < latte[0] ||
			fromMain[1] < latte[1] ||
			fromMain[2] < latte[2] ||
			fromMain[3] < 1
		) {
			val containerForLowItems = mutableListOf<String>()
			var stringContainer = ""
			if (fromMain[0] < latte[0]) {
				containerForLowItems.add("water")
			} else if (fromMain[1] < latte[1]) {
				containerForLowItems.add("milk")
			} else if (fromMain[2] < latte[2]) {
				containerForLowItems.add("coffee")
			}
			if (containerForLowItems.size == 1) {
				stringContainer = containerForLowItems[0]
			} else if (containerForLowItems.size == 2) {
				stringContainer = "${containerForLowItems[0]} and ${containerForLowItems[1]}"
			} else if (containerForLowItems.size == 3) {
				stringContainer =
					"${containerForLowItems[0]} and ${containerForLowItems[1]} and ${containerForLowItems[1]}"
			}
			println("Sorry, not enough $stringContainer!\n")
		}
		return fromMain
	}

	fun buyCap(fromMain: MutableList<Int>): MutableList<Int> {
		if (
			fromMain[0] >= cappuccino[0] &&
			fromMain[1] >= cappuccino[1] &&
			fromMain[2] >= cappuccino[2] &&
			fromMain[3] >= 1
		) {
			println("I have enough resources, making you a coffee!\n")
			// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
			//val returnFromTrans = fromMain.toMutableList()
			fromMain[0] -= cappuccino[0]
			fromMain[1] -= cappuccino[1]
			fromMain[2] -= cappuccino[2]
			fromMain[3] -= 1
			fromMain[4] += cappuccino[3]
			return fromMain
		} else if (
			fromMain[0] < cappuccino[0] ||
			fromMain[1] < cappuccino[1] ||
			fromMain[2] < cappuccino[2] ||
			fromMain[3] < 1
		) {
		val containerForLowItems = mutableListOf<String>()
		var stringContainer = ""
		if (fromMain[0] < cappuccino[0]) {
			containerForLowItems.add("water")
		} else if (fromMain[1] < cappuccino[1]) {
			containerForLowItems.add("milk")
		} else if (fromMain[2] < cappuccino[2]) {
			containerForLowItems.add("coffee")
		}
		if (containerForLowItems.size == 1) {
			stringContainer = containerForLowItems[0]
		} else if (containerForLowItems.size == 2) {
		stringContainer = "${containerForLowItems[0]} and ${containerForLowItems[1]}"
		} else if (containerForLowItems.size == 3) {
			stringContainer =
				"${containerForLowItems[0]} and ${containerForLowItems[1]} and ${containerForLowItems[1]}"
		}
		println("Sorry, not enough $stringContainer!\n")
		}
		return fromMain
	}

	println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
	when (readln()) {
		"1" -> buyEsp(fromMain)
		"2" -> buyLat(fromMain)
		"3" -> buyCap(fromMain)
	}

	return fromMain
}

fun fill(fromMain: MutableList<Int>): MutableList<Int> {
	//val itemsInContainer = mutableListOf<Int>(0, 0, 0, 0, 0)
	println("\nWrite how many ml of water you want to add:")
	val waterIn = readln().toInt()
	if (waterIn > 0) {
		fromMain[0] += waterIn
	}
	println("\nWrite how many ml of milk you want to add:")
	val milkIn = readln().toInt()
	if (milkIn > 0) {
		fromMain[1] += milkIn
	}
	println("\nWrite how many grams of coffee you want to add:")
	val coffeeIn = readln().toInt()
	if (coffeeIn > 0) {
		fromMain[2] += coffeeIn
	}
	println("\nWrite how many disposable cups you want to add:")
	val disposableCupsIn = readln().toInt()
	if (disposableCupsIn > 0) {
		fromMain[3] += disposableCupsIn
	}

	return fromMain
}

fun take(fromMain: MutableList<Int>): MutableList<Int> {
	println("I gave you $${fromMain[4]}\n")
	fromMain[4] = 0
	return fromMain
}
