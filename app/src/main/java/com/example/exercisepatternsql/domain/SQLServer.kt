package com.example.exercisepatternsql.domain

import com.example.exercisepatternsql.IO.ISQL

class SQLServer: ISQL {

    override fun open() = "open SQLServer"

    override fun close() = "close SQLServer"

    override fun dispose()= "dispose SQLServer"

    override fun getDataSet() = "getDataSet SQLServer"

    override fun executeSQL() = "executeSQL SQLServer"
}