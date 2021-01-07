package com.gv.recyclermasterkotlin

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gv.recyclermasterkotlin.model.Email

class EmailAdapter(val emails: MutableList<Email>): RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){
    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        TODO("Not yet implemented")
    }


    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

   
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}