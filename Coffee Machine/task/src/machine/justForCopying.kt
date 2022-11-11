package machine

//fun buyLat(fromMain: MutableList<Int>): MutableList<Int> {
//	if (
//		fromMain[0] >= latte[0] &&
//		fromMain[1] >= latte[1] &&
//		fromMain[2] >= latte[2] &&
//		fromMain[3] >= 1
//	) {
//		println("I have enough resources, making you a coffee!\n")
//		// make the coffee and deduct the amount from the machine totals and return. This will reset machine totals
//		//val returnFromTrans = fromMain.toMutableList()
//		returnFromTrans[0] -= latte[0]
//		returnFromTrans[1] -= latte[1]
//		returnFromTrans[2] -= latte[2]
//		returnFromTrans[3] -= 1
//		returnFromTrans[4] += latte[3]
//		return returnFromTrans
//	} else if (
//		fromMain[0] < latte[0] ||
//		fromMain[1] < latte[1] ||
//		fromMain[2] < latte[2] ||
//		fromMain[3] < 1
//	) {
//		val containerForLowItems = mutableListOf<String>()
//		var stringContainer: String = ""
//		if (fromMain[0] < latte[0]) {
//			containerForLowItems.add("water")
//		} else if (fromMain[1] < latte[1]) {
//			containerForLowItems.add("milk")
//		} else if (fromMain[2] < latte[2]) {
//			containerForLowItems.add("coffee")
//		}
//		if (containerForLowItems.size == 1) {
//			stringContainer = containerForLowItems[0]
//		} else if (containerForLowItems.size == 2) {
//			stringContainer = "${containerForLowItems[0]} and ${containerForLowItems[1]}"
//		} else if (containerForLowItems.size == 3) {
//			stringContainer =
//				"${containerForLowItems[0]} and ${containerForLowItems[1]} and ${containerForLowItems[1]}"
//		}
//		println("Sorry, not enough $stringContainer!\n")
//	}
//	return returnFromTrans
//}