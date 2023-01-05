package com.example.painter
import android.graphics.Bitmap
import android.graphics.Color
var RD:Int=0
var GR:Int=0
var BL:Int=0
var bitmap = Bitmap.createBitmap(DIM, DIM, Bitmap.Config.ARGB_8888)
fun write(a:Int,b:Int,n:Int){
    if (n == 1) {
        RD = RD1(a, b).toInt().and(255)
        GR = GR1(a, b).toInt().and(255)
        BL = BL1(a, b).toInt().and(255)
    } else if (n == 2) {
        RD = RD2(a, b).toInt() and 255
        GR = GR2(a, b).toInt() and 255
        BL = BL2(a, b).toInt() and 255
    } else if (n == 3) {
        RD = RD3(a, b).toInt() and 255
        GR = GR3(a, b).toInt() and 255
        BL = BL3(a, b).toInt() and 255
    } else if (n == 4) {
        RD = RD4(a, b).toInt() and 255
        GR = GR4(a, b).toInt() and 255
        BL = BL4(a, b).toInt() and 255
    } else if (n == 5) {
        RD = RD5(a, b).toInt() and 255
        GR = GR5(a, b).toInt() and 255
        BL = BL5(a, b).toInt() and 255
    }
    else if(n==6){
        RD = RD6(a, b).toInt()
        GR = GR6(a, b).toInt()
        BL = BL6(a, b).toInt()
    }
}
fun painter(n: Int) {
    var mm=0
    for (b in 0 until DIM) {
        for (a in 0 until DIM) {
            write(a,b,n)
            println(mm)
            mm++
            bitmap.setPixel(a, b, Color.argb(255, RD, GR, BL))
        }
    }
}
