package com.example.exercisepatternsql

interface ISQL {
    fun open(): String
    fun close(): String
    fun dispose(): String
    fun getDataSet(): String
    fun executeSQL(): String
}