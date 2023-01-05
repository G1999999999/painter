package com.example.painter
import java.lang.Math.*
fun RD6(i: Int,j:Int): Int {
    var mm= (-0.00076*j*(j-1024)+100)*sin(j.toDouble()*5)+300
    var nn=(-0.00076*j*(j-1024)+100)*sin(j.toDouble()*5)+800
    var suiji:Int
    if(mm<i.toDouble()&&i.toDouble()<nn){
        suiji=(100..150).random()
        return suiji
    }
    else if(mm<i.toDouble()){
        suiji=(50..100).random()
        return suiji
    }
    else{
        suiji=(0..50).random()
        return suiji
    }
}
fun GR6(i: Int,j:Int): Int {
    var mm= (-0.00076*j*(j-1024)+100)*sin(j.toDouble()*5)+300
    var nn=(-0.00076*j*(j-1024)+100)*sin(j.toDouble()*5)+800
    var suiji:Int
    if(mm<i.toDouble()&&i.toDouble()<nn){
        suiji=(150..200).random()
        return suiji
    }
    else{
        suiji=(100..150).random()
        return suiji
    }
}
fun BL6(i: Int,j:Int): Int {
    var mm= (-0.00076*j*(j-1024)+100)*sin(j.toDouble()*9)+300
    var nn=(-0.00076*j*(j-1024)+100)*sin(j.toDouble()*9)+800
    var suiji:Int
    if(mm<i.toDouble()&&i.toDouble()<nn){
        suiji=(200..255).random()
        return suiji
    }
    else{
        suiji=(0..50).random()
        return suiji
    }
}