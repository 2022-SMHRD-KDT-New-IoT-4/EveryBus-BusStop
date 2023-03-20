package com.example.ff

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import busmoVO1
import busmoVO2
import com.example.ex20230310.busmoAdapter2

// 일반인 사용자
class MainActivity_User  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainbj)

        val rc1 = findViewById<RecyclerView>(R.id.rc1)

        var busmoList = ArrayList<busmoVO1>()

        busmoList.add(busmoVO1("순한01B"))
        busmoList.add(busmoVO1("지원45"))
        busmoList.add(busmoVO1("금호46"))
        busmoList.add(busmoVO1("송암31"))
        busmoList.add(busmoVO1("첨단20"))
        busmoList.add(busmoVO1("운림50"))
        busmoList.add(busmoVO1("금호46"))
        busmoList.add(busmoVO1("대촌270"))
        busmoList.add(busmoVO1("순한01B"))
        busmoList.add(busmoVO1("지원45"))
        busmoList.add(busmoVO1("송암31"))


        val adapter = busmoAdapter1(applicationContext, busmoList)
        rc1.adapter = adapter
        rc1.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL, false )
/////////////////////////////////////////////

        var rc2 = findViewById<RecyclerView>(R.id.rc2)
        // 승차예약 버스
        var busmoList2 = ArrayList<busmoVO2>()

        busmoList2.add(busmoVO2("지원45"))
        busmoList2.add(busmoVO2("송암32"))

        val adapter2 = busmoAdapter2(applicationContext, busmoList2)
        rc2.adapter = adapter2
        rc2.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)


        ///////////////////////////////////////
        var rcMain = findViewById<RecyclerView>(R.id.rcMain)
        var busmoList3 = ArrayList<busmoVO4>()

        busmoList3.add(busmoVO4("송암32", "곧도착", "매우혼잡", "0"))
        busmoList3.add(busmoVO4("첨단20", "8분", "매우혼잡", "0"))
        busmoList3.add(busmoVO4("매월26", "곧도착", "매우혼잡", "0"))
        busmoList3.add(busmoVO4("대촌270", "15분", "매우혼잡", "0"))


        val adapter4 = busmoAdapter4(applicationContext, busmoList3)
        rcMain.adapter = adapter4
        rcMain.layoutManager = LinearLayoutManager(this)

        ///////////////////////////////////////////
        val btn_move_BJ2 = findViewById<Button>(R.id.btn_move_BJ2)
        btn_move_BJ2.setOnClickListener {
            val intent= Intent(this,MainActivity_NO::class.java)
            startActivity(intent)
        }



        ////////////////////////////////////////////////////



    }
}