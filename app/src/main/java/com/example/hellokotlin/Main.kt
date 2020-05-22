package com.example.hellokotlin

fun main(){
    buildAquarium()
    makeFish()
}

fun buildAquarium(){
//    val aqObj = Aquarium()
//    println("Length : ${aqObj.length}, width : ${aqObj.width}, height : ${aqObj.height}")
//
//    aqObj.height = 100
//    println("New height : ${aqObj.height}")
//    println("Volume : ${aqObj.volume}")
//
//    println("Small Aquarium")
//    val smallAq = Aquarium(10,20,50)
//    println("Length : ${smallAq.length}, width : ${smallAq.width}, height : ${smallAq.height}")
//    smallAq.length =100
//    println("Volume : ${smallAq.volume}")
//
//    val medAq = Aquarium(20,30,40)
//    println("Length : ${medAq.length}, width : ${medAq.width}, height : ${medAq.height}")

    val baby  = Baby(20,20)
    println("Baby volume : ${baby.volume} id: ${baby.id} width: ${baby.width}")
}
fun makeFish(){
    val oc = Octopus()
    oc.eat()
    q(oc)
}

fun q(fish: FishAction1){
    fish.kill()
    fish.play()
}

