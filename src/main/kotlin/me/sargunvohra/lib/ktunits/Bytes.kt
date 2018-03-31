@file:JvmName("Bytes")
package me.sargunvohra.lib.ktunits

val Long.bits: BitValue get() = BitValue(this)
val Long.bytes: BitValue get() = (this * 8).bits
val Long.kibibytes: BitValue get() = (this * 1024).bytes
val Long.mebibytes: BitValue get() = (this * 1024).kibibytes
val Long.gibibytes: BitValue get() = (this * 1024).mebibytes
val Long.tebibytes: BitValue get() = (this * 1024).gibibytes
val Long.pebibytes: BitValue get() = (this * 1024).tebibytes

val Int.bits: BitValue get() = toLong().bits
val Int.bytes: BitValue get() = toLong().bytes
val Int.kibibytes: BitValue get() = toLong().kibibytes
val Int.mebibytes: BitValue get() = toLong().mebibytes
val Int.gibibytes: BitValue get() = toLong().gibibytes
val Int.tebibytes: BitValue get() = toLong().tebibytes
val Int.pebibytes: BitValue get() = toLong().pebibytes

data class BitValue internal constructor(internal val bits: Long) {
    val toBits = bits
    val toBytes = toBits / 8
    val toKibibytes = toBytes / 1024
    val toMebibytes = toKibibytes / 1024
    val toGibibytes = toMebibytes / 1024
    val toTebibytes = toGibibytes / 1024
    val toPebibytes = toTebibytes / 1024
}
