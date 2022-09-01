package com.example.finalproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.adapter.holder.AuthorViewHolder
import com.example.finalproject.BookAuthor
import com.example.finalproject.databinding.ItemAutorBinding

class AuthorAdapter(private val users: MutableList<BookAuthor>) : RecyclerView.Adapter<AuthorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {
        val itemBinding = ItemAutorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AuthorViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AuthorViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int = users.size

}
