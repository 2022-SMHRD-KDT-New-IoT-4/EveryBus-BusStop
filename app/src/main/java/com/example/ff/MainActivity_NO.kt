package com.example.ff
// 참고
// https://furang-note.tistory.com/25



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
// 장애인

class MainActivity_NO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)




/////////////////////// 11111111번 시작 //////////////////


        val rc11 = findViewById<RecyclerView>(R.id.rc1)

        // 1. 화면에서 RecyclerView의 위치 정해주기
        // 2. 한칸에 들어갈 디자인 만들기 (xml)
        // 3. 데이터 만들기
        // 포켓몬 이름, 스킬, 레벨 + 이미지(R.drawable.p1) ---> Int
        // PokeMonVO("피카츄", "백만볼트", "level 3", R.drawable.p1)


        // 곧도착 버스
        var busmoList1 = ArrayList<busmoVO1>()


        busmoList1.add(busmoVO1("순한01B"))
        busmoList1.add(busmoVO1("지원45"))
        busmoList1.add(busmoVO1("금호46"))
        busmoList1.add(busmoVO1("송암31"))
        busmoList1.add(busmoVO1("첨단20"))
        busmoList1.add(busmoVO1("운림50"))
        busmoList1.add(busmoVO1("금호46"))
        busmoList1.add(busmoVO1("대촌270"))
        busmoList1.add(busmoVO1("순한01B"))
        busmoList1.add(busmoVO1("지원45"))
        busmoList1.add(busmoVO1("송암31"))


        // name, skill, lv , img : Int -----> PokeMonVO
        // ArrayList<PokeMonVo>
        // 4. PokeMonAdapter 만들기 ---> RecyclerView.Adapter를 상속
        // 5. adapter 적용시키기
        // - PokeMonAdapter 생성
        val adapter1 = busmoAdapter1(applicationContext, busmoList1)
        rc11.adapter = adapter1
        // ---> LinearLayoutManager로 배치
//         rc11.layoutManager = LinearLayoutManager(this)
        // Grid로 배치하고 싶다면
//         rc11.layoutManager = LinearLayoutManager(this)


        rc11.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)


//////////////////////// 11111111 끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝  ///////////


////////////////////222222222222222 시시시시//////////////////////

        val rc22 = findViewById<RecyclerView>(R.id.rc2)

        // 1. 화면에서 RecyclerView의 위치 정해주기
        // 2. 한칸에 들어갈 디자인 만들기 (xml)
        // 3. 데이터 만들기
        // 포켓몬 이름, 스킬, 레벨 + 이미지(R.drawable.p1) ---> Int
        // PokeMonVO("피카츄", "백만볼트", "level 3", R.drawable.p1)

        // 승차예약 버스
        var busmoList2 = ArrayList<busmoVO2>()

        busmoList2.add(busmoVO2("지원45"))
        busmoList2.add(busmoVO2("송암32"))




        // name, skill, lv , img : Int -----> PokeMonVO
        // ArrayList<PokeMonVo>
        // 4. PokeMonAdapter 만들기 ---> RecyclerView.Adapter를 상속
        // 5. adapter 적용시키기
        // - PokeMonAdapter 생성
        val adapter2 = busmoAdapter2(applicationContext, busmoList2)
        rc22.adapter = adapter2
        // ---> LinearLayoutManager로 배치
//         rc11.layoutManager = LinearLayoutManager(this)
        // Grid로 배치하고 싶다면
//         rc11.layoutManager = LinearLayoutManager(this)


        rc22.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)


////////////////// 222222222 끝끝끝끝끝끝끝끝끝  /////////////////////////////


////////////////////333333333 시시시시시시시시시시 작작작작작작작작 //////////////////////////
        val rc33 = findViewById<RecyclerView>(R.id.rc3)

        // 1. 화면에서 RecyclerView의 위치 정해주기
        // 2. 한칸에 들어갈 디자인 만들기 (xml)
        // 3. 데이터 만들기
        // 포켓몬 이름, 스킬, 레벨 + 이미지(R.drawable.p1) ---> Int
        // PokeMonVO("피카츄", "백만볼트", "level 3", R.drawable.p1)
        var busmoList3 = ArrayList<busmoVO3>()

        busmoList3.add(busmoVO3("송암32", "곧도착", "매우혼잡", "0"))
        busmoList3.add(busmoVO3("첨단20", "8분", "매우혼잡", "0"))
        busmoList3.add(busmoVO3("매월26", "곧도착", "매우혼잡", "0"))

        busmoList3.add(busmoVO3("대촌270", "15분", "매우혼잡", "0"))



        // name, skill, lv , img : Int -----> PokeMonVO
        // ArrayList<PokeMonVo>
        // 4. PokeMonAdapter 만들기 ---> RecyclerView.Adapter를 상속
        // 5. adapter 적용시키기
        // - PokeMonAdapter 생성
        val adapter3 = busmoAdapter3(applicationContext, busmoList3)
        rc33.adapter = adapter3
        // ---> LinearLayoutManager로 배치
        rc33.layoutManager = LinearLayoutManager(this)
        // Grid로 배치하고 싶다면
        // rc2.layoutManager = GridLayoutManager(this,1)


        /////////333333333333333 끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝끝 ///////////////


/////////////// 비장애인 모드로 이동 시작  ///////////////


        val btn_move_BJ = findViewById<Button>(R.id.btn_move_BJ)


//        btn_move_BJ.setOnClickListener {
////
//        val intent= Intent(this,MainActivityBJ::class.java)
//
//        startActivity(intent)
////
//        }


        btn_move_BJ.setOnClickListener {
            val intent=Intent(this,MainActivity_User::class.java)
            startActivity(intent)
        }


/////////////// 비장애인 모드로 이동  끝 ///////////////




    }


}
