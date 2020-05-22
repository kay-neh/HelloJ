package com.example.hellokotlin

import java.util.*

fun main(){
    inlineExample()
}

class Fish1(val name: String)

fun inlineExample(){
    val fihs = Fish1("say")
    println(fihs.name.toUpperCase(Locale.ROOT))

    println(fihs.name.toLowerCase(Locale.ROOT))

    fihs.run { myWith("hi"){
        println(toUpperCase(Locale.ROOT))
    }
    }


}

inline fun myWith(name:String,block: String.() -> Unit){
    name.block()
}