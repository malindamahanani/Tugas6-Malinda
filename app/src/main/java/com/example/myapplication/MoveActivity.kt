package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnkembali: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnkembali = findViewById(R.id.kembali)
        btnkembali.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.kembali -> run{
                    val intentKembali = Intent(this@MoveActivity, MainActivity::class.java)
                    startActivity(intentKembali)
                }
            }
        }

    }
}