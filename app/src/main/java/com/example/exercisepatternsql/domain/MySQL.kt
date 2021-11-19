package com.example.exercisepatternsql.domain

import com.example.exercisepatternsql.IO.ISQL

class MySQL: ISQL {
    override fun open() = "open MySQL"

    override fun close() = "close MySQL"

    override fun dispose()= "dispose MySQL"

    override fun getDataSet() = "getDataSet MySQL"

    override fun executeSQL() = "executeSQL MySQL"
}