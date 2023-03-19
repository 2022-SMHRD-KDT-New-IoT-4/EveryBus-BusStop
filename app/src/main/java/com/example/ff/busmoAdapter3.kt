package com.example.ex20230310


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import busmoVO3
import com.example.ff.R

class busmoAdapter3(val context: Context,val data:ArrayList<busmoVO3>):RecyclerView.Adapter<busmoAdapter3.ViewHolder>(){
    // 1) 뷰홀더 틀 만들기
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        // view : onCreatViewHolder가 inflate해준 뷰 객체
        // 2
        val tvdc1 : TextView
        val tvdc2 : TextView
        val tvdc3 : TextView
        val tvdc4 : TextView
        init{
            // 반드시 한번 실행 되는 곳

            tvdc1 = view.findViewById(R.id.tv_hdc1)
            tvdc2 = view.findViewById(R.id.tv_dc2)
            tvdc3 = view.findViewById(R.id.tv_dc3)
            tvdc4 = view.findViewById(R.id.tv_dc4)



        }
    }


    // 2) implement members
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //1
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.busmo3_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvdc1.text = data[position].dc1
        holder.tvdc2.text = data[position].dc2
        holder.tvdc3.text = data[position].dc3
        holder.tvdc4.text = data[position].dc4
        //ImageView.setImageResource (이미지 아이디)
//        holder.img.setImageResource(data[position].img)



    }




}