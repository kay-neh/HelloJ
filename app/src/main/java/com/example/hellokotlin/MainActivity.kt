package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

val temp = Random().nextInt(100)

fun main() {
    val lam: (Int) -> Unit = { cool -> println("Temperature value : $cool")}
    lam(temp)
    println("The temperature is ${if (temp > 27) "hot" else "cool"}")
    eager()
    feedFish()
    highProcess(40)
}

fun feedFish(){
    val day = weekDays()
    val food = when(day){
        "Monday"-> "burger"
        "Tuesday" -> "Yam"
        "Wednesday" -> "MeatPie"
        "Thursday" -> "Potato"
        "Friday" -> "egg"
        else -> "oil"
    }
    println("Today is $day and the fish should be fed with $food")

    if(changeWater(day,temp = temp,dirty = temp)){
        println("Change water")
    }else{
        println("Don't change water")
    }
}

val lam2: (Int) -> Int = { heat -> heat/2 }
fun t1(heat:Int) = heat/2
fun t2(heat: Int):Int{
    return heat/2
}

//high order func
fun highOrder(heat:Int,operation:(Int)->Int){
     println("Result of high order func is ${operation(heat)}")
}

fun highProcess(warm:Int){
    highOrder(warm, lam2)
    highOrder(warm,::t1)
    highOrder(warm,::t2)
    highOrder(warm){hot->hot/2}
}

//method to generate a random day
fun weekDays():String{
    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val ind = Random().nextInt(7)
    return days[ind]
}

fun changeWater(day: String,temp: Int = 20,dirty: Int = 20): Boolean{
    return when {
        isTooHot(temp) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temp: Int) = temp > 30
fun isSunday(day: String) = day == "Sunday"
fun isDirty(dirty: Int) = dirty > 30

fun eager(){
    val myList = listOf("beans","rice","yam","mango","pear","apple","banga")
    println(myList.filter { it[0] == 'b' })
    println((myList).asSequence().filter { it[0] == 'b' }.toList())
}