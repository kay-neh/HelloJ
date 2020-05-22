package com.example.hellokotlin

fun main(){
    delegate()
}

fun delegate(){
    val w = Whale(del33(),del33())
    w.eat()
}

interface fishColor{
    var color:String
}

interface fishAction{
    fun eat()
}

class Whale(obj:fishColor = del(),ocj:fishAction = del()):fishAction by ocj,fishColor by obj

class del:fishAction,fishColor {
    override var color: String
        get() = "pink"
        set(value) {}

    override fun eat() {
        println("eating")
        println(color)
    }
}

    class del33:fishAction,fishColor{
        override var color: String
            get() = "green"
            set(value) {}
        override fun eat() {
            println("killing")
            println(color)
        }
}