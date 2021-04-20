package com.example.MyApplication2.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.MyApplication2.R
import com.example.MyApplication2.data.model.User
import com.example.MyApplication2.databinding.ItemLayoutBinding

/**
 *  author : 黄灿
 *  data : 2021/4/20 23:49
 *  description :
 */
class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var binding:ItemLayoutBinding
        fun bind(user: User) {
            binding = ItemLayoutBinding.bind(itemView)
            itemView.apply {
                binding.textViewUserName.text = user.name
                binding.textViewUserEmail.text = user.email
                Glide.with(binding.imageViewAvatar.context)
                    .load(user.avatar)
                    .into(binding.imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}