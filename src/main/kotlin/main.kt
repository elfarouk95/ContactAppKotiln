fun menu(): Int {
    println("menu for Contact App")
    println("Please Enter Number of one from this Choice")
    println("1-Add New Contact")
    println("2-Update Contact")
    println("3-Delete Contact")
    println("4-PrintAll Contact")
    println("5-Search Contact by Name")
    println("6-Search Contact by Phone")
    println("7-Exit")

    return readLine()!!.toInt()
}

fun main(args: Array<String>?) {
    do {
        when (menu()) {
            1 -> add()
            2 -> update()
            3 -> delete()
            4 -> printAll()
            5 -> searchByName()
            6 -> searchByPhone()
            else -> {
                println("-----------------------------")
                println("Thank you for Using our App")
                break
            }
        }
    } while (true)
}

