package org.example

class LinkedList<T:Any>{
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        if(isEmpty()){
            return "Empty list"
        }else{
            return head.toString()
        }
    }
}