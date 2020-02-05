package com.example.soba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.画面遷移用ボタンの取得。
        val btnIntent = findViewById<Button>(R.id.btn_intent)
        //2.画面遷移用ボタンにリスナを登録。
        btnIntent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                //3.Intentクラスのオブジェクトを生成。
                val intent = Intent(this@MainActivity, Yonabaru::class.java)
                //生成したオブジェクトを引数に画面を起動！
                startActivity(intent)
            }
        })
    }
}