package com.example.painter

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainavtivity)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button6=findViewById(R.id.button6)
        button1.setOnClickListener{
            painter(1)
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        button2.setOnClickListener{
            painter(2)
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        button3.setOnClickListener{
            painter(3)
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        button4.setOnClickListener{
            painter(4)
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        button5.setOnClickListener{
            painter(5)
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        button6.setOnClickListener{
            painter(6)
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}