package me.sargunvohra.lib.ktunits

import org.testng.annotations.Test
import kotlin.test.assertEquals

class BytesTest {
    @Test
    fun mebiToMebi() = assertEquals(128L, 128.mebibytes.toMebibytes)

    @Test
    fun pebiToBits() = assertEquals(5L * 1024 * 1024 * 1024 * 1024 * 1024 * 8, 5.pebibytes.toBits)
	
	@Test
	fun bitsToPebi() = assertEquals(5L, (5L * 1024 * 1024 * 1024 * 1024 * 1024 * 8).bits.toPebibytes)

    @Test
    fun intStuff() {
        assertEquals(Int.MAX_VALUE.toLong().bits, Int.MAX_VALUE.bits)
		assertEquals(Int.MAX_VALUE.toLong().bytes, Int.MAX_VALUE.bytes)
		assertEquals(Int.MAX_VALUE.toLong().kibibytes, Int.MAX_VALUE.kibibytes)
		assertEquals(Int.MAX_VALUE.toLong().mebibytes, Int.MAX_VALUE.mebibytes)
		assertEquals(Int.MAX_VALUE.toLong().gibibytes, Int.MAX_VALUE.gibibytes)
		assertEquals(Int.MAX_VALUE.toLong().tebibytes, Int.MAX_VALUE.tebibytes)
		assertEquals(Int.MAX_VALUE.toLong().pebibytes, Int.MAX_VALUE.pebibytes)
    }
}