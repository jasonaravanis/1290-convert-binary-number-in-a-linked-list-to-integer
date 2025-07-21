fun getDecimalValueOptimal(head: ListNode?): Int {
    var result = 0
    var current = head

    while (current != null) {
        result = result * 2 + current.`val`
        current = current.next
    }

    return result
}
