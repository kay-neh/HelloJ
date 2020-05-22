package com.example.hellokotlin

open class Aquarium(var width:Int ,var height:Int = 40,var length:Int = 100) {

   open var volume: Int
        get() = (width*length*height)/1000
        set(value) {}

}

class Baby(var id: Int, width: Int):Aquarium(width){
    override var volume: Int
        get() = (width*length*height)
        set(value) {}
}

abstract class Fish{
    abstract val color:String
}

interface FishAction1{
    fun eat()
    fun kill()
    fun play()
}

class Octopus:Fish(),FishAction1{
    override val color: String = "pink"
    override fun eat() {
        println("eating $color")
    }

    override fun kill() {
        println("killing $color")
    }

    override fun play() {
        println("playing $color")
    }
}
