package com.example.finalproject

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun Addition() {


        val calculate: MainActivity = MainActivity()

        var firstValue: Double = 1.0
        var secondValue: Double = 2.0
        var expectedValue: Double = 3.0
        assertEquals("Result of Addition is ", expectedValue, firstValue + secondValue, 0.0)

    }
    @Test
    fun Subtract() {


        val calculate: MainActivity = MainActivity()

        var firstValue: Double = 2.0
        var secondValue: Double = 1.0
        var expectedValue: Double = 1.0
        assertEquals("Result of Subtract is ", expectedValue, firstValue + secondValue, 0.0)

    }
    @Test
    fun Multiplication() {


        val calculate: MainActivity = MainActivity()

        var firstValue: Double = 3.0
        var secondValue: Double = 2.0
        var expectedValue: Double = 6.0
        assertEquals("Result of Multiplication is ", expectedValue, firstValue + secondValue, 0.0)

    }
}