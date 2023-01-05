package com.example.painter
val RAND_MAX=1024
var k1:Double=0.0
var k2:Double=0.0
var k3:Double=0.0
fun RD5(i: Int,j:Int): Int {
    var suiji=(0..RAND_MAX).random()
    k1=k1+suiji/1.0/RAND_MAX
    var l:Int=k1.toInt()
    l%=512
    if(l>255){
        return 511-l
    }
    else{
        return l
    }
}
fun GR5(i: Int,j:Int): Int {
    var suiji=(0..RAND_MAX).random()
    k2=k2+suiji/1.0/RAND_MAX
    var l:Int=k2.toInt()
    l%=512
    if(l>255){
        return 511-l
    }
    else{
        return l
    }
}
fun BL5(i: Int,j:Int): Int {
    var suiji=(0..RAND_MAX).random()
    k3=k3+suiji/1.0/RAND_MAX
    var l:Int=k3.toInt()
    l%=512
    if(l>255){
        return 511-l
    }
    else{
        return l
    }
}