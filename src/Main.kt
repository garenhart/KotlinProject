/**
 * Created by Garen on 10/16/2017.
 */

fun main(args: Array<String>) {
    println("Hello from Kotlin!")
    CustomClass("Garen").saySomething()
    println(MyJavaClass().value)
    println(CustomClass("Anush").getValue())
}

class CustomClass(val name: String) {
    fun saySomething() {
        println("Hello ${name}")
    }

    fun getValue(): String {
        return "from Kotlin"
    }

}