package com.example.exercisepatternsql.IO

interface ISQL {
    fun open(): String
    fun close(): String
    fun dispose(): String
    fun getDataSet(): String
    fun executeSQL(): String
}