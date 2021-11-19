package com.example.exercisepatternsql.domain

import com.example.exercisepatternsql.IO.ISQL

class Oracle: ISQL {
    override fun open() = "open Oracle"

    override fun close() = "close Oracle"

    override fun dispose()= "dispose Oracle"

    override fun getDataSet() = "getDataSet Oracle"

    override fun executeSQL() = "executeSQL Oracle"
}