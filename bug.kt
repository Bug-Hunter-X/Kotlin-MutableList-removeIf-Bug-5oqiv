fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code has a subtle bug. When using `removeIf` on a `MutableList`, you're modifying the list during iteration which can lead to unexpected behavior.  Elements might be skipped if the removal changes the indices.