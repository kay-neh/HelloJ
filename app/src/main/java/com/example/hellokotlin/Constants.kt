package com.example.hellokotlin

class cons{
    companion object{
    const val pI = 1.42
    const val r = 8
    }
}

fun main(){
    println(2*cons.pI*cons.r)
    println("ish".hasF())
}

fun String.hasF() = this.find{ it == 'f'} != null
