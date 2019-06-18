class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(element: MyDate): Boolean = element > start && element <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
