package com.example.exercisepatternsql

object SQLFactory {
    fun getSQL(sqlType: SQLType): ISQL{
        return when (sqlType) {
            SQLType.SQLServer -> SQLServer()
            SQLType.Oracle -> Oracle()
            SQLType.PostgreSQL -> PostgreSql()
            SQLType.MySQL -> MySQL()
        }
    }
}