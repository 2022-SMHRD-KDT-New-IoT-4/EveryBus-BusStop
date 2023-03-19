package com.example.ff

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivityBJ  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainbj)




/////////////////////////////////////////////
        val btn_move_BJ2 = findViewById<Button>(R.id.btn_move_BJ2)
        btn_move_BJ2.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }



        ////////////////////////////////////////////////////



    }
}