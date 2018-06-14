package com.github.hiwayama.sql2o.sql.maker

interface IQueryToken {
    fun toQueryToken() : String
}