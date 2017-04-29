package com.importre.example

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun testGreeting() {
        assertEquals("Hello, World!", Hello.greeting("World"))
        assertEquals("Hello, Kotlin!", Hello.greeting())
    }
}
