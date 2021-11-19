package com.example.exercisepatternsql.domain

import com.example.exercisepatternsql.IO.ISQL

class PostgreSql: ISQL {
    override fun open() = "open PostgreSql"

    override fun close() = "close PostgreSql"

    override fun dispose()= "dispose PostgreSql"

    override fun getDataSet() = "getDataSet PostgreSql"

    override fun executeSQL() = "executeSQL PostgreSql"
}