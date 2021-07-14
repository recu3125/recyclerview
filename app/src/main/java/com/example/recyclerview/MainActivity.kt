package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler1 = findViewById<RecyclerView>(R.id.recycler1)
        val profileList = arrayListOf(
            item("리", "1"),
            item("사", "2"),
            item("이", "3"),
            item("클", "4"),
            item("러", "5"),
            item("뷰", "6"),
            item("어", "7"),
            item("려", "8"),
            item("움", "9")
        )

        recycler1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler1.setHasFixedSize(true)

        recycler1.adapter = Adapter(profileList)
    }
}