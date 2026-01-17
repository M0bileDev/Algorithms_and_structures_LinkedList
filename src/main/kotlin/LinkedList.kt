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

    fun append(value: T) {
        if (isEmpty()) {
            push(value)
            return
        }

        val newNode = Node(value)
        tail!!.next = newNode

        tail = newNode
        size++
    }

    fun nodeAt(index: Int): Node<T>?{
        var currentNode = head
        var currentIndex = 0

        while(currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T>{
        if(tail == afterNode){
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

}