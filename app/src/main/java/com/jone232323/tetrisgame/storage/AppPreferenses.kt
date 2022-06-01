package com.jone232323.tetrisgame.storage

import android.content.Context
import android.content.SharedPreferences

class AppPreferenses(ctx:Context) {
    var data:SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES",Context.MODE_PRIVATE)

    fun saveHightScore(hightScore:Int){
        data.edit().putInt("HIGHT_SCORE",hightScore).apply()
    }

    fun getHigtScore():Int{
        return data.getInt("HIGHT_SCORE",0)
    }

    fun resetHightScore(){
        data.edit().putInt("HIGHT_SCORE",0).apply()
    }

}