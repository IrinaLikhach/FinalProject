package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.adapter.AuthorAdapter
import com.example.finalproject.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var authorlist: MutableList<BookAuthor> = mutableListOf()
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvList.adapter = AuthorAdapter (getAuthors())
    }

    fun getAuthors() = mutableListOf<BookAuthor>(
        BookAuthor("Olga", "Petrova", 24, "https://static8.tgstat.ru/channels/_0/26/2647150c2f9771a41145032b86b6c8a4.jpg"),
        BookAuthor("Sergey", "Ivanov", 28, "https://klike.net/uploads/posts/2019-06/1560664251_3.jpg"),
        BookAuthor("Ivan", "Smirnov", 22, "https://i.pinimg.com/originals/67/6a/57/676a57623559bcc564c19e64747cdcc0.jpg"),
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}