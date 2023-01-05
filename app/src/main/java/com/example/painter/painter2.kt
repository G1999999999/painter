package com.example.painter


import java.lang.Math.*

fun RD2(i: Int,j:Int): Double {

    var x:Double=0.0
    var y:Double=0.0
    var k:Double=0.0
    while(k++<256) {
        var a:Double
        a=x*x-y*y+(i-768.0)/512
        y=2*x*y+(j-512.0)/512
        x=a
        if(x*x+y*y>4){
            break
        }
    }
    return log(k)*47

}
fun GR2(i: Int,j:Int): Double {
    var x:Double=0.0
    var y:Double=0.0
    var k:Double=0.0
    while(k++<256) {
        var a:Double
        a=x*x-y*y+(i-768.0)/512
        y=2*x*y+(j-512.0)/512
        x=a
        if(x*x+y*y>4){
            break
        }
    }
    return log(k)*47
}
fun BL2(i: Int,j:Int): Double {
    var x:Double=0.0
    var y:Double=0.0
    var k:Double=0.0
    while(k++<256) {
        var a:Double
        a=x*x-y*y+(i-768.0)/512
        y=2*x*y+(j-512.0)/512
        x=a
        if(x*x+y*y>4){
            break
        }
    }
    return 128-log(k)*23;
}