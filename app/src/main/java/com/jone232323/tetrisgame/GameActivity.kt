package com.jone232323.tetrisgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.jone232323.tetrisgame.storage.AppPreferenses

class GameActivity : AppCompatActivity() {
    var tvCarrentScore:TextView?= null
    var tvHightScore:TextView?= null
    var appPreferenses:AppPreferenses? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        supportActionBar?.hide()

        tvCarrentScore = findViewById(R.id.tv_carrent_score)
        tvHightScore = findViewById(R.id.tv_hight_score)

        val btnRestart = findViewById<Button>(R.id.btn_restart)
        btnRestart.setOnClickListener(this::OnBtnRestartClick)

        appPreferenses = AppPreferenses(this)

        updateCarrentScore()
        updateHightScore()

    }

    fun OnBtnRestartClick(view:View){
        Toast.makeText(this,"Restart game",Toast.LENGTH_LONG).show()
    }

    fun updateCarrentScore(){
        tvCarrentScore?.text = "0"
    }
    fun updateHightScore(){
        tvHightScore?.text = "${appPreferenses?.getHigtScore()}"
    }
}