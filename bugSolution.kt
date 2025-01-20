fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.toMutableList() // Create a copy
    newList.removeIf { it % 2 == 0 }
    println(newList) //This will correctly print [1,3,5]
}
Alternatively, iterate in reverse to avoid index issues:
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    for (i in list.size -1 downTo 0) {
       if (list[i] % 2 == 0) list.removeAt(i)
    }
    println(list) // This will also correctly print [1,3,5]
}