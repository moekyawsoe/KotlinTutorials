package Day1

fun main() {
    var value1 = 10
    var charcode:Char = '\u0042'
    val value2: Long = value1.toLong()
    val value3: Short = value1.toShort()
    val value4: Int = value1.toInt()
    val value5: Float = value1.toFloat()
    val value6: Double = value1.toDouble()
    val value7: Char = charcode.toChar()
    println(value2)
    println(value3)
    println(value4)
    println(value5)
    println(value6)
    println(value7)
}