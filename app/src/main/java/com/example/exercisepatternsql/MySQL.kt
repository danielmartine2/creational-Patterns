package com.example.exercisepatternsql

class MySQL: ISQL {
    override fun open() = "open"

    override fun close() = "close"

    override fun dispose()= "dispose"

    override fun getDataSet() = "getDataSet"

    override fun executeSQL() = "executeSQL"
}