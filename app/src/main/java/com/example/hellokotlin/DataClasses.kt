package com.example.hellokotlin

fun main(){
    runDc()
}

fun runDc(){
    val d1 = Decorations("granite","iron")
    println(d1)

    val d2 = Decorations("sandstone","brass")
    println(d2)

    val d3 = d2.copy()
    println(d3)

    println(d3.equals(d2))

    val (slime,wood) = d3
    println(slime + wood)
}

data class Decorations(val rock:String,val metal:String){}