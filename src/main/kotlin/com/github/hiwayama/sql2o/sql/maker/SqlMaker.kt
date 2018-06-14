package com.github.hiwayama.sql2o.sql.maker

/**
 * builder method
 */
fun buildSqlMaker() : SqlMaker {
    return SqlMakerImpl()
}

interface SqlMaker {
    fun selectAs(tableName: String, columnTokens: List<ColumnToken>, whereToken: WhereToken, opt: QueryOption) : String
    fun select(tableName: String, columnNames: List<String>, whereToken: WhereToken, opt: QueryOption) : String
    fun insert(tableName: String, valuesToken: ValuesToken) : String
    fun delete(tableName: String, whereToken: WhereToken): String
}