package com.example.exercisepatternsql

import android.widget.Toast

class SQLServer: ISQL {

    override fun open() = "open"

    override fun close() = "close"

    override fun dispose()= "dispose"

    override fun getDataSet() = "getDataSet"

    override fun executeSQL() = "executeSQL"
}