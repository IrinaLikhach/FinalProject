package com.example.finalproject.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalproject.R
import com.example.finalproject.BookAuthor
import com.example.finalproject.databinding.ItemAutorBinding

class AuthorViewHolder (private val itemBinding : ItemAutorBinding): RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(user : BookAuthor){
        with(itemBinding){
            tvName.text = user.name
            tvSecondName.text = user.secondName
            tvAge.text = user.age.toString()
            Glide.with(itemView.context)
                .load(user.photo)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivPhoto)

        }
    }
}