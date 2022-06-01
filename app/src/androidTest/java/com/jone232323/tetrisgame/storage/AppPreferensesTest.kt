package com.jone232323.tetrisgame.storage

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppPreferensesTest {
    val appContext = InstrumentationRegistry.getInstrumentation().targetContext

    @Test
    fun getHigtScore() {


        var actual:Int = 3
        var expected: Int = 45

        val preferenses:AppPreferenses = AppPreferenses(appContext)

        preferenses.saveHightScore(45)
        actual = preferenses.getHigtScore()
        assertEquals(expected,actual)
    }

    @Test
    fun resetHigtScore() {

        var actual:Int = 3
        var expected: Int = 0

        val preferenses:AppPreferenses = AppPreferenses(appContext)

        preferenses.saveHightScore(45)
        preferenses.resetHightScore()
        actual = preferenses.getHigtScore()
        assertEquals(expected,actual)
    }
}