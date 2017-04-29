package com.importre.example

import com.xenomachina.argparser.ArgParser
import com.xenomachina.argparser.ShowHelpException
import com.xenomachina.argparser.default
import java.io.StringWriter
import java.lang.System.err

fun main(args: Array<String>) {
    val parser = ArgParser(args)
    val name by parser
        .storing("-n", "--name", help = "name")
        .default("Kotlin")
    val version by parser
        .flagging("-v", "--version", help = "cli version")

    try {
        println(if (version) {
            BuildConfig.VERSION
        } else {
            Hello.greeting(name)
        })
    } catch (e: ShowHelpException) {
        StringWriter()
            .apply { e.printUserMessage(this, BuildConfig.NAME, 80) }
            .apply { err.println(this) }
    } catch (e: Throwable) {
        println(e.message)
    }
}
