package org.example

class LinkedList<T : Any> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    fun push(value: T): LinkedList<T> = apply {
        //Create a node with new value and points
        // to the node that was previously the head
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }
}