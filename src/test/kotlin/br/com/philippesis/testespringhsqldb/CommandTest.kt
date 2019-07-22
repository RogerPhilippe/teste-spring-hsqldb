package br.com.philippesis.testespringhsqldb

import br.com.philippesis.testespringhsqldb.utils.KUtils
import org.junit.Test

class CommandTest {

    @Test
    fun contextLoads() {
    }

    @Test
    fun commandTest() {
        KUtils.commandShell("ls")
    }

}