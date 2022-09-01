package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment())
            .addToBackStack("Start Fragment")
            .commit()
    }
//    private lateinit var database : DatabaseReference
//    private val TAG = "Сказки"
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        database = FirebaseDatabase.getInstance().getReference("Сутеев")
//        val skazkiAvtor
//        database.child("Мешок яблок").setValue(skazkiAvtor).addOnSuccessListener()
//        readDataBaseLisener(database)
//    }
//    private fun readDataBaseLisener(read : DatabaseReference){
//        val readDatabase = object : ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//                TODO("Not yet implemented")
//
//            }
//        }
//    }
}