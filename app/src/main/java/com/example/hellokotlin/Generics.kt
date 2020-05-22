package com.example.hellokotlin

open class Books(var type: String){
    fun printBooks(){
        println("$type Books")
    }
}

class PrintedBooks:Books("Printed")

class LibraryOut<T: Books>(val book: T){
    fun login():T{
        return book
    }
}

class LibraryIn<in T: Books>{
    fun login(book: T){
        println(book.type)
    }
}

fun <T:Books> demo(lib:LibraryOut<T>){
    println(lib.book.type)
}


fun main(){
    val libOut = LibraryOut(PrintedBooks())
    demo(libOut)
}