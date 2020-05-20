package Day1

var Str = "Hello Kotlin Strings"
fun main() {
    var s = String()
    s = "This is string in mainfunction"

    println(Str.length)
    println(Str.subSequence(0,5))

    println(s.compareTo(Str))
    println(s.compareTo(Str,true))

    println(Str[0])
    println(Str.get(4))

    for (element in Str){
        println(element)
    }
}