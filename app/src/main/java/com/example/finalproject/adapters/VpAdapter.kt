package com.example.finalproject.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VpAdapter (fa: FragmentActivity, private val list: List<Fragment>) : FragmentStateAdapter(fa) {
    //получаем количество элементов, которые есть (у нас их 2)
    override fun getItemCount(): Int {
        return list.size
    }

    //берем по позиции нужный фрагмент (Days or Hours) и запускаем его
    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}