package com.example.ff


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import busmoVO1
import com.example.ff.R


class busmoAdapter1(val context: Context,val data:ArrayList<busmoVO1>):RecyclerView.Adapter<busmoAdapter1.ViewHolder>(){
    // 1) 뷰홀더 틀 만들기
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        // view : onCreatViewHolder가 inflate해준 뷰 객체
        // 2
        val tvhdc1 : TextView

        init{
            // 반드시 한번 실행 되는 곳

            tvhdc1 = view.findViewById(R.id.tv_hdc1)


        }
    }


    // 2) implement members
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //1
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.busmo1_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvhdc1.text = data[position].hdc1


        //ImageView.setImageResource (이미지 아이디)
//        holder.img.setImageResource(data[position].img)

    }



}