package me.sargunvohra.lib.ktunits

import org.testng.annotations.Test
import kotlin.test.assertEquals

class TimeTest {
    @Test
    fun daysToDays() = assertEquals(5L, 5L.days.toDays)

    @Test
    fun daysToNanoseconds() = assertEquals((1000000L * 1000 * 60 * 60 * 24 * 10), 10L.days.toNanoseconds)

    @Test
    fun nanosecondsToDays() = assertEquals(10L, (1000000L * 1000 * 60 * 60 * 24 * 10).nanoseconds.toDays)

    @Test
    fun intStuff() {
        assertEquals(Int.MAX_VALUE.toLong().nanoseconds, Int.MAX_VALUE.nanoseconds)
        assertEquals(Int.MAX_VALUE.toLong().milliseconds, Int.MAX_VALUE.milliseconds)
		assertEquals(Int.MAX_VALUE.toLong().microseconds, Int.MAX_VALUE.microseconds)
        assertEquals(Int.MAX_VALUE.toLong().seconds, Int.MAX_VALUE.seconds)
        assertEquals(Int.MAX_VALUE.toLong().minutes, Int.MAX_VALUE.minutes)
        assertEquals(Int.MAX_VALUE.toLong().hours, Int.MAX_VALUE.hours)
        assertEquals(Int.MAX_VALUE.toLong().days, Int.MAX_VALUE.days)
    }
}