class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator() = MyDateIterator(this)

    class MyDateIterator(private val dateRange: DateRange) : Iterator<MyDate> {
        private var currentDate: MyDate = dateRange.start
        override fun hasNext(): Boolean {
            return currentDate <= dateRange.end
        }

        override fun next(): MyDate {
            val current = currentDate
            currentDate = currentDate.nextDay()
            return current
        }
    }
}


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
