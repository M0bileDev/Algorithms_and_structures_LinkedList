package org.example

fun <T : Any> LinkedList<T>.printInReverse() {
    var counter = size - 1
    while (counter > -1) {
        val node = nodeAt(counter)
        print(node?.value)
        counter--
        if (counter > -1) print(" <- ")
    }
}

fun <T : Any> LinkedList<T>.findItemInTheMiddle(): Node<T>? {
    if (isEmpty()) return null
    if (size == 1) return nodeAt(0)

    val middleIndex = size / 2
    return nodeAt(middleIndex)
}