import java.util.*

val linked: LinkedList = LinkedList()

fun add() {

    val scanner: Scanner = Scanner(System.`in`)

    println("Enter Name")
    val name = scanner.nextLine()

    println("Enter Phone")
    val phone = scanner.nextLine()

    val contact = Contact()
    contact.Name = name
    contact.Phone = phone

    linked.add(contact)
}

fun update() {
    val scanner: Scanner = Scanner(System.`in`)

    println("Enter Name")
    val name = scanner.nextLine()

    println("Enter Phone")
    val phone = scanner.nextLine()

    val contact = Contact()
    contact.Name = name
    contact.Phone = phone

    linked.updateContact(contact)
}

fun delete() {
    val scanner: Scanner = Scanner(System.`in`)

    println("Enter Phone")
    val phone = scanner.nextLine()

    val contact = Contact()
    contact.Phone = phone

    linked.deleteContact(contact)
}

fun printAll() {
    linked.printAllContacts()
}

fun searchByName() {
    val scanner: Scanner = Scanner(System.`in`)

    println("Enter Name")
    val name = scanner.nextLine()


    val con = linked.searchByName(name)

    println(con)
}

fun searchByPhone() {
    val scanner: Scanner = Scanner(System.`in`)

    println("Enter Phone")
    val phone = scanner.nextLine()


    val con = linked.searchByPhone(phone)

    println(con)
}
