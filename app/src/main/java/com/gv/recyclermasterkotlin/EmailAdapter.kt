package com.gv.recyclermasterkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gv.recyclermasterkotlin.model.Email

class EmailAdapter(val emails: MutableList<Email>): RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){
    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(email: Email) {

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item,parent,false)
        return EmailViewHolder(view)
    }


    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
  holder.bind(emails[position])
    }


    override fun getItemCount(): Int = emails.size
}