package com.example.add_item_in_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saveBtn=findViewById<Button>(R.id.save)
        val inputText=findViewById<EditText>(R.id.text)
        val listView=findViewById<ListView>(R.id.listView)

        val data= ArrayList<String>()

        val adapter= ArrayAdapter<String>(this@MainActivity,R.layout.layout, data)

        listView.adapter=adapter

        saveBtn.setOnClickListener {
            val item = inputText.text.toString()
            if (item.isNotEmpty()) {
                data.add(item)
                adapter.notifyDataSetChanged()
            }
        }
    }
}