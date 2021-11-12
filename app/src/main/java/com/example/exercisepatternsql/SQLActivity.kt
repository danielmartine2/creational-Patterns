package com.example.exercisepatternsql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast




class SQLActivity : AppCompatActivity() {

    var connectSQL: ISQL? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlactivity)

        val db = intent.extras?.getString("DB") ?: "No database for connection"

        connectSQL = when (db) {
            SQLType.PostgreSQL.name -> SQLFactory.getSQL(SQLType.PostgreSQL)
            SQLType.MySQL.name -> SQLFactory.getSQL(SQLType.MySQL)
            SQLType.PostgreSQL.name -> SQLFactory.getSQL(SQLType.PostgreSQL)
            SQLType.Oracle.name -> SQLFactory.getSQL(SQLType.Oracle)
            else -> null
        }

        if (connectSQL == null){
            showToast(db)
            return
        }

        onListeners()

    }

    private fun onListeners(){
        findViewById<Button>(R.id.btn_open).also {
            it.setOnClickListener {
                connectSQL?.let { connect -> showToast(connect.open()) }
            }
        }
        findViewById<Button>(R.id.btn_close).also {
            it.setOnClickListener {
                connectSQL?.let { connect -> showToast(connect.close()) }
            }
        }
        findViewById<Button>(R.id.btn_executeSQL).also {
            it.setOnClickListener {
                connectSQL?.let { connect -> showToast(connect.executeSQL()) }
            }
        }


    }

    private fun showToast(message: String){
        Toast.makeText(
            applicationContext,
            message, Toast.LENGTH_SHORT
        ).show()
    }
}