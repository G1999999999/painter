package com.example.painter

import java.lang.Math.*

fun RD3(i: Int,j:Int): Double {
    return ((cos(atan2((j-512).toDouble(),(i-512).toDouble())/2))*(cos(atan2((j-512).toDouble(),(i-512).toDouble())/2))*255)
}

fun GR3(i: Int,j:Int): Double {
    return ((cos(atan2((j-512).toDouble(),(i-512).toDouble())/2-2*acos(-1.0)/3))*(cos(atan2((j-512).toDouble(),(i-512).toDouble())/2-2*acos(-1.0)/3))*255)
}

fun BL3(i: Int,j:Int): Double {
    return ((cos(atan2((j-512).toDouble(),(i-512).toDouble())/2+2*acos(-1.0)/3))*(cos(atan2((j-512).toDouble(),(i-512).toDouble())/2+2*acos(-1.0)/3))*255)
}