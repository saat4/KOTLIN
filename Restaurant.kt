fun main() {
    val item = arrayOf("Idly", "Vada")
    var price = arrayOf(25, 30)
    var choice = arrayOf(0, 0)
    println("Item name\tPrice")
    for (i in 0 until item.size) {
        println(item[i] + "\t\t" + price[i])
    }
    while (true) {
        print("Select an item or press 's' to exit : ")
        var iname: String = readLine()!!
        if (iname == "s") {
            break
        }
        if (iname in item) {
            var id = item.indexOf(iname)
            print("Enter quantity : ")
        var qn = readLine()!!.toInt()
        choice[id] = qn
    } else println("Enter valid item")
    }
    var total:Int = 0
    for (i in 0 until choice.size) {
        total += choice[i] * price[i]
    }
    println("Total amount : $total")
}