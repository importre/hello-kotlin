package com.importre.example

/**
 * Hello Object
 */
object Hello {

    /**
     * Returns "Hello $name"
     *
     * @param name name [String]
     * @return "Hello $name"
     */
    @JvmStatic
    @JvmOverloads
    fun greeting(name: String = "Kotlin") = "Hello, $name!"
}
