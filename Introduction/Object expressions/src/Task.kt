import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList) { p0, p1 -> p1 - p0 }
    return arrayList
}