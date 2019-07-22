package br.com.philippesis.testespringhsqldb.utils

import java.io.BufferedReader
import java.io.InputStreamReader
import javax.validation.constraints.NotNull

object KUtils {

    fun commandShell(@NotNull command: String): Boolean {

        var status = false;

        if (command.isNotEmpty()) {

            val bufferedReader: BufferedReader
            val commandList = mutableListOf<String>()

            commandList.add("/bin/bash")
            commandList.add("-c")
            commandList.add(command)

            try {

                val processBuilder = ProcessBuilder(commandList)
                val process = processBuilder.start()
                val inputStream = process.inputStream
                val inputStreamReader = InputStreamReader(inputStream)
                bufferedReader = BufferedReader(inputStreamReader)
                while ( bufferedReader.readLine() != null) {
                    println(bufferedReader.readLine())
                }


            } catch (ex: Exception) {}

        }

        return status
    }

}