package com.jone232323.tetrisgame.helpers

import org.junit.Assert.*

import org.junit.Test

class HelperFunctionalsKtTest {

    @Test
    fun helperFunctionals() {

        val actual: Array<ByteArray> = HelperFunctionals(2,2)
        val expected: Array<ByteArray> = arrayOf(byteArrayOf(0,0),byteArrayOf(0,0))

        assertArrayEquals(expected,actual)
    }
}