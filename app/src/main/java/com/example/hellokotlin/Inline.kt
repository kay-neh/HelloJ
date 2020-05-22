package com.example.hellokotlin

import java.util.*

fun main(){
    inlineExample()
}

class Fish1(val name: String)

fun inlineExample(){
    val fihs = Fish1("aquaman")
    println(fihs.name.toUpperCase(Locale.ROOT))

    fihs.run { myWith("ade"){
        println(toUpperCase(Locale.ROOT))
    }
    }


}

inline fun myWith(name:String,block: String.() -> Unit){
    name.block()
}