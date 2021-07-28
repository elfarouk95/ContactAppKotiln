class LinkedList {

    private var head: Node? = null
    var size: Int = 0

    public fun add(contact: Contact) {
        head = if (head == null) {
            Node(contact, null)
        } else {
            val temp = Node(contact, head)
            temp
        }
    }

    public fun printAllContacts() {
        printHelper(head)
    }

    private fun printHelper(node: Node?) {

        if (node != null) {
            printHelper(node.node)
            println(node.contact)
        }
    }

    public fun updateContact(con: Contact) {
        if (head?.contact?.Phone.equals(con.Phone)) {
            head?.contact = con
        } else {
            var temp = head

            while (!temp?.contact?.Phone.equals(con.Phone)) {
                temp = temp?.node
            }

            temp?.contact = con
        }
    }

    public fun searchByName(name: String): Contact? {

        return if (head?.contact?.Name.equals(name))
            head?.contact
        else {
            var temp = head

            while (temp?.contact?.Name.equals(name)) {
                temp = temp?.node
            }
            temp?.contact
        }
    }

    public fun searchByPhone(phone: String): Contact? {

        return if (head?.contact?.Phone.equals(phone))
            head?.contact
        else {
            var temp = head

            while (temp?.contact?.Phone.equals(phone)) {
                temp = temp?.node
            }
            temp?.contact
        }
    }

    public fun deleteContact(con: Contact)
    {
        if (head?.contact?.Phone.equals(con.Phone))
        {
            head = head?.node
        }
        else{
            var temp = head

            while (temp?.node?.contact?.Phone.equals(con.Phone)) {
                temp = temp?.node
            }

            temp?.node = temp?.node?.node
        }
    }

}