data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            dayOfMonth != other.dayOfMonth -> dayOfMonth - other.dayOfMonth
            else -> 0
        }
    }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
