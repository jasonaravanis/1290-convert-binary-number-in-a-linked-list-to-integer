fun getDecimalValue(head: ListNode?): Int {
    val bits = mutableListOf<Int>()
    var node = head
    while (node != null) {
        bits.add(node.`val`)
        node = node.next
    }

    var sum = 0
    for (i in 0..<bits.size) {
        val exp = (bits.size - i - 1)
        val bitColumnValue = 1 shl exp

        sum += (bits[i] * bitColumnValue)
    }

    return sum
}

fun main() {
    val nodeOne = ListNode(1)
    val nodeTwo = ListNode(0)
    val nodeThree = ListNode(1)
    val nodeFour = ListNode(1)

    nodeOne.next = nodeTwo
    nodeTwo.next = nodeThree
    nodeThree.next = nodeFour

    val solution = getDecimalValueOptimal(nodeOne)

    println(solution)
}
