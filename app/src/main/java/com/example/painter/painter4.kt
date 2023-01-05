package com.example.painter

import java.lang.Math.*
val DIM=1024
fun RD4(i: Int,j:Int): Int {
    var s:Double
    s=3.0/(j+99)
    var y:Double
    y=(j+sin((i*i+(j-700)*(j-700)*5)/100.0/DIM)*35)*s;
    return (((i+DIM)*s+y).toInt()%2+((DIM*2-i)*s+y).toInt()%2)*127;
}
fun GR4(i: Int,j:Int): Int {
    var s:Double
    s=3.0/(j+99)
    var y:Double
    y=(j+sin((i*i+(j-700)*(j-700)*5)/100.0/DIM)*35)*s
    return ((5*((i+DIM)*s+y)).toInt()%2+(5*((DIM*2-i)*s+y)).toInt()%2)*127;
}
fun BL4(i: Int,j:Int): Int {
    var s:Double
    s=3.0/(j+99)
    var y:Double
    y=(j+sin((i*i+(j-700)*(j-700)*5)/100.0/DIM)*35)*s
    return ((29*((i+DIM)*s+y)).toInt()%2+(29*((DIM*2-i)*s+y)).toInt()%2)*127;
}