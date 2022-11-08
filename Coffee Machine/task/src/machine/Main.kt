package machine

fun main() {
	// base line for cup of coffee
	val waterML = 200
	val milkML = 50
	val coffeeG = 15
	// this will get how much supply the coffee machine has to work with
	println("Write how many ml of water the coffee machine has: ")
	// convert each to an int to be able to do math on it
	val machWater = (readln().toInt())
	val machWaterInCups = machWater / waterML
	println("Write how many ml of milk the coffee machine has: ")
	val machMilk = (readln().toInt())
	val machMilkInCups = machMilk / milkML
	println("Write how many grams of coffee beans the coffee machine has: ")
	val machCoffee = (readln().toInt())
	val machCoffeeInCups = machCoffee / coffeeG
	// This tells you how many cups the machine can make with current ingredients
	val machHasCups = listOf<Int>(machWaterInCups, machMilkInCups, machCoffeeInCups)
	val machHasCupsSorted = machHasCups.sorted()
	val machCanMake = machHasCupsSorted[0]
	// asks the user how much the customer is asking for cups of coffee
	println("Write how many cups of coffee you will need: ")
	val numCups = readln().toInt()

	if (machCanMake > numCups) {
		val andThenSome = machCanMake - numCups
		println("Yes, I can make that amount of coffee (and even $andThenSome more than that")
	} else if (machCanMake == numCups) {
		println("Yes, I can make that amount of coffee")
	} else {
		println("No, I can make only $machCanMake cups of coffee")
	}

}
