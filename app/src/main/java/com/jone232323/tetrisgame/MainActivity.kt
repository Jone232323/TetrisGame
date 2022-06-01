package com.jone232323.tetrisgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.jone232323.tetrisgame.storage.AppPreferenses

class MainActivity : AppCompatActivity() {
    var tvHightScore:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnNewGame = findViewById<Button>(R.id.btn_newgame)
        val btnResetScore = findViewById<Button>(R.id.btn_reset_score)
        val btnExit = findViewById<Button>(R.id.btn_exit)
        tvHightScore = findViewById(R.id.tv_hight_score_default)

        btnNewGame.setOnClickListener(this::onBtnNewGameClick)
        btnResetScore.setOnClickListener(this::onBtnResetScoreClick)
        btnExit.setOnClickListener(this::onBtnExitClick)
    }

    fun onBtnNewGameClick(view:View){
        val intent:Intent = Intent(this,GameActivity::class.java)
        startActivity(intent)

    }
    fun onBtnResetScoreClick(view:View){

        var preferenses:AppPreferenses

    }
    fun onBtnExitClick(view:View){
        System.exit(0)
    }
}