import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(times: Int): TimeIntervalWithMultiplier {
    return TimeIntervalWithMultiplier(this, times)
}

data class TimeIntervalWithMultiplier(val timeInterval: TimeInterval, val multiplier: Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timeWithMultiplier: TimeIntervalWithMultiplier): MyDate =
        addTimeIntervals(timeWithMultiplier.timeInterval, timeWithMultiplier.multiplier)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
