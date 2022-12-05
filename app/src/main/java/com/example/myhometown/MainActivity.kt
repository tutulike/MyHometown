package com.example.myhometown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //第一个按钮
        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent1=Intent(this,MainActivity3::class.java)
            startActivity(intent1)
        }
        //第二个按钮
        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent(this, MainActivity2::class.java)
            startActivity(intent2)
        }
        //第三个按钮
        val button3=findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent3 = Intent(this, MainActivity4::class.java)
            startActivity(intent3)
        }
    }

}