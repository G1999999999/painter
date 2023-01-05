package com.example.painter

import java.lang.Math.*

fun RD1(i: Int,j:Int): Double {
    var a=0.0
    var b=0.0
    var c:Double
    var d:Double
    var n=0.0
    c=a*a
    d=b*b
    while(c+d<4&&n++<880) {
        b=2.0*a*b+j*8.0e-9-0.645411
        a=c-d+i*8e-9+0.356888
        c=a*a
        d=b*b
    }
    return 255*pow((n-80)/800,3.0)
}
fun GR1(i: Int,j:Int): Double {
    var a=0.0
    var b=0.0
    var c:Double
    var d:Double
    var n=0.0
    c=a*a
    d=b*b
    while(c+d<4&&n++<880) {
        b=2*a*b+j*8*Math.pow(10.0, -9.0)-0.645411
        a=c-d+i*8*Math.pow(10.0, -9.0)+0.356888
        c=a*a
        d=b*b
    }
    return 255*pow((n-80)/800,0.7)
}
fun BL1(i: Int,j:Int): Double {
    var a=0.0
    var b=0.0
    var c:Double
    var d:Double
    var n=0.0
    c=a*a
    d=b*b
    while(c+d<4&&n++<880) {
        b=2*a*b+j*8*Math.pow(10.0, -9.0)-0.645411
        a=c-d+i*8*Math.pow(10.0, -9.0)+0.356888
        c=a*a
        d=b*b
    }
    return 255*pow((n-80)/800,0.5)
}