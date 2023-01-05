package com.example.painter

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    private lateinit var save: Button
    private lateinit var exit: Button
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picture)
        save=findViewById(R.id.save)
        exit=findViewById(R.id.exit)
        imageView=findViewById(R.id.imageView)
        init()
        save.setOnClickListener{
            MediaStore.Images.Media.insertImage(contentResolver, bitmap, "picture_name", "demo_saveImage")
            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show()
        }
        exit.setOnClickListener{
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun init(){
        k1=0.0
        k2=0.0
        k3=0.0
        imageView.setImageBitmap(bitmap)
    }
}