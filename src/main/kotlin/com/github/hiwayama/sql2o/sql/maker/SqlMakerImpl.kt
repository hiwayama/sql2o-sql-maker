package com.github.hiwayama.sql2o.sql.maker

internal class SqlMakerImpl : SqlMaker {
    override fun selectAs(tableName: String, columnTokens: List<ColumnToken>, whereToken: WhereToken, opts: QueryOption): String {
        return buildSelectQuery(
                tableName,
                columnTokens.map{c -> {c.toQueryToken()}}.joinToString(),
                if ( whereToken != null ) {
                    whereToken.toQueryToken()
                } else {
                    ""
                },
                "" // TODO
        )
    }

    override fun select(tableName: String, columnNames: List<String>, whereToken: WhereToken, opts: QueryOption): String {
        return buildSelectQuery(
                tableName,
                columnNames.joinToString(),
                if ( whereToken != null ) {
                    whereToken.toQueryToken()
                } else {
                    ""
                },
                "" // TODO
        )
    }

    override fun insert(tableName: String, valuesToken: ValuesToken): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(tableName: String, whereToken: WhereToken): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun buildSelectQuery(tableName: String, columnString: String, whereString: String, optsString: String): String {
        return "SELECT %s FROM %s %s %s;".format(columnString, tableName, whereString, optsString)
    }
}