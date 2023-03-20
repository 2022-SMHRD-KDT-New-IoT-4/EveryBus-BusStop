package com.example.ff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import busmoVO1
import busmoVO2
import busmoVO3
import com.example.ex20230310.busmoAdapter2
import com.example.ex20230310.busmoAdapter3

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction()
            .replace(R.id.view, OneFragment())
            .commit()



    //


        val btn1 = findViewById<Button>(R.id.btn1)

        val btn2 = findViewById<Button>(R.id.btn2)

//        val btn3 = findViewById<Button>(R.id.btn3)



        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, OneFragment())
                .commit()
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, TwoFragment())
                .commit()
        }








    }
}

