package com.example.exercisepatternsql

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner: Spinner = findViewById(R.id.sql_spinner)
        spinner.onItemSelectedListener = this

        val button: Button = findViewById(R.id.btn_continue)

        ArrayAdapter.createFromResource(
            this,
            R.array.SQL_array,
            android.R.layout.simple_spinner_item
        ).also {  adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        button.setOnClickListener {
            val intent = Intent(this, SQLActivity::class.java)
            val a  =spinner.selectedItem.toString()
            intent.putExtra("DB", spinner.selectedItem.toString())
            startActivity(intent)
        }

    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        parent.getItemAtPosition(pos).toString()

    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}