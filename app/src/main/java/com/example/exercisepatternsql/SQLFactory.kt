package com.example.exercisepatternsql

import com.example.exercisepatternsql.IO.ISQL
import com.example.exercisepatternsql.domain.*
import com.example.exercisepatternsql.domain.enums.SQLType

object SQLFactory {
    fun getSQL(sqlType: SQLType): ISQL {
        return when (sqlType) {
            SQLType.SQLServer -> SQLServer()
            SQLType.Oracle -> Oracle()
            SQLType.PostgreSQL -> PostgreSql()
            SQLType.MySQL -> MySQL()
        }
    }
}