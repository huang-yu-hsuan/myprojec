package com.hyh

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello();
    val h = Human()
    h.hello()
    var age = 19
    age = 20
    var weight = 66.5
    val name : String
    name = "huang"

}

class Human {
    fun hello(){
        println("Hello Kotlin")
    }
}