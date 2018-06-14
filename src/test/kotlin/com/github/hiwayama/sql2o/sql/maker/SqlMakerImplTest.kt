package com.github.hiwayama.sql2o.sql.maker

import org.junit.Assert
import org.junit.Test

class SqlMakerImplTest {
    private val sqlMaker = SqlMakerImpl()

    @Test
    fun select_Test() {
        Assert.assertEquals("SELECT a, b, c FROM t  ;", sqlMaker.select("t", listOf("a", "b", "c"), WhereToken(), QueryOption()).trim())
    }

    fun selectAs_Test() {
        // TODO
    }
}