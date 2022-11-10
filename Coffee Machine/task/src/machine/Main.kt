package machine



fun main() {
	// map for list - water, milk, coffee bean, disposable cups, money
	val coffMachStart = listOf(400, 540, 120, 9, 550)
//	val coffMachLevels = mutableListOf<Int>()
//	coffMachLevels.addAll(coffMachStart)
	// copy coffMachStart into this and use until exit so you can maintain levels
	var copyOfMachStartList = coffMachStart.toMutableList()
//	val doWhat = getAction()
//	println(doWhat)
//	when (doWhat) {
//		"buy" -> buy(copyOfMachStartList)
//		"fill" -> fill(copyOfMachStartList)
//		"take" -> take(copyOfMachStartList)
//		"remaining" -> initialPrintout(copyOfMachStartList)
//		"exit" -> println("")
//		else -> println("")
//	}

	val whileVar = true
	while (whileVar) {
		val doWhat = getAction()
		if (doWhat == "buy") {
			val getReturnBuy = buy(copyOfMachStartList)
			copyOfMachStartList = getReturnBuy
		} else if (doWhat == "fill") {
			fill(copyOfMachStartList)
		} else if (doWhat == "take") {
			take(copyOfMachStartList)
		} else if (doWhat == "remaining") {
			pOutMachineTotals(copyOfMachStartList)
		} else if (doWhat == "exit") {
			break
		}
	}

}

fun pOutMachineTotals(fromMain: List<Int>) {
	println("The coffee machine has:")
	println("${fromMain[0]} ml of water")
	println("${fromMain[1]} ml of milk")
	println("${fromMain[2]} g of coffee beans")
	println("${fromMain[3]} disposable cups")
	println("\$${fromMain[4]} of money")
}

fun getAction(): String {
	println("Write an action (buy, fill, take, remaining, exit):")
	val getFromUser = readln()
	return getFromUser
}

fun buy(fromMain: List<Int>): MutableList<Int> {
	// drink types and values
	val espresso = listOf<Int>(250, 16, 4) // water, coffee, price
	val latte = listOf<Int>(350, 75, 20, 7) // water, milk, coffee, price
	val cappuccino = listOf<Int>(200, 100, 12, 6) // water, milk, coffee, price
	val returnFromTrans = fromMain.toMutableList() // list to return from transactions

	// functions for each action
	fun buyEsp(fromMain: List<Int>): MutableList<Int> {
		if (
		fromMain[0] >= espresso[0] &&
		fromMain[2] >= espresso[2] &&
		fromMain[3] >= 1
		) {
			println("I have enough resources, making you a coffee!")
			// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
			returnFromTrans[0] = fromMain[0] - espresso[0]
			returnFromTrans[2] = fromMain[2] - espresso[1]
			returnFromTrans[3] - 1
			returnFromTrans[4] = fromMain[4] + espresso[2]
			return returnFromTrans
		} else if (
			fromMain[0] < espresso[0] ||
			fromMain[2] < espresso[2] ||
			fromMain[3] < 1
		) {

			println("Sorry, not enough \$fill in list element(s) that are lacking")
		}
		return returnFromTrans
	}

	fun buyLat(fromMain: List<Int>): MutableList<Int> {
		if (
			fromMain[0] >= latte[0] &&
			fromMain[1] >= latte[1] &&
			fromMain[2] >= latte[2] &&
			fromMain[3] >= 1
		) {
			println("I have enough resources, making you a coffee!")
			// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
			//val returnFromTrans = fromMain.toMutableList()
			returnFromTrans[0] = fromMain[0] - latte[0]
			returnFromTrans[2] = fromMain[2] - latte[1]
			returnFromTrans[4] = fromMain[4] + latte[2]
			returnFromTrans[3] - 1
			return returnFromTrans
		} else if (
			fromMain[0] < latte[0] ||
			fromMain[2] < latte[2]
		) {

			println("Sorry, not enough \$fill in list element(s) that are lacking")
		}
		return returnFromTrans
	}

	fun buyCap(fromMain: List<Int>): MutableList<Int> {
		if (
			fromMain[0] >= latte[0] &&
			fromMain[1] >= latte[1] &&
			fromMain[2] >= latte[2] &&
			fromMain[3] >= 1
		) {
			println("I have enough resources, making you a coffee!")
			// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
			//val returnFromTrans = fromMain.toMutableList()
			returnFromTrans[0] = fromMain[0] - latte[0]
			returnFromTrans[2] = fromMain[2] - latte[1]
			returnFromTrans[4] = fromMain[4] + latte[2]
			returnFromTrans[3] - 1
			return returnFromTrans
		} else if (
			fromMain[0] < latte[0] ||
			fromMain[2] < latte[2]
		) {

			println("Sorry, not enough \$fill in list element(s) that are lacking")
		}
		return returnFromTrans
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
