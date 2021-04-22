package com.rivaldofez.roomapp.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rivaldofez.roomapp.R
import com.rivaldofez.roomapp.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return  MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.tv_id.text = currentItem.id.toString()
        holder.itemView.tv_firstname.text = currentItem.firstName
        holder.itemView.tv_lastname.text = currentItem.lastName
        holder.itemView.tv_age.text = currentItem.age.toString()

    }

    fun setData(user : List<User>){
        this.userList = user
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
       return userList.size
    }


}