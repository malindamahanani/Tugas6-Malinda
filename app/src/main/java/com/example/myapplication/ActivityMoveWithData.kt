package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity




class ActivityMoveWithData : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnkembali: Button
    private lateinit var tvDataRecaived: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDataRecaived = findViewById(R.id.tv_data_recaived)
        DataRecaived()

        btnkembali = findViewById(R.id.kembali)
        btnkembali.setOnClickListener(this)
    }

    private fun DataRecaived(){
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Alamat")

        tvDataRecaived.text = nama + " " + alamat
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.kembali -> run{
                    val intentKembali = Intent(this@ActivityMoveWithData, MainActivity::class.java)
                    startActivity(intentKembali)
                }
        }
    }

}
}