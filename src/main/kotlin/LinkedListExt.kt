package org.example

fun <T: Any> LinkedList<T>.printInReverse(){
    var counter = size - 1
    while (counter > -1){
       val node = nodeAt(counter)
        print(node?.value)
        counter--
        if(counter > -1) print(" <- ")
    }
}
