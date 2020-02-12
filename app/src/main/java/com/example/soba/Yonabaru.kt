package com.example.soba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_yonabaru.*

class Yonabaru : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yonabaru)

        //1.画面遷移用ボタンの取得。
        val btnIntent = findViewById<Button>(R.id.button)
        //2.画面遷移用ボタンにリスナを登録。
        btnIntent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                //3.Intentクラスのオブジェクトを生成。
                val intent = Intent(this@Yonabaru, YonabaruStore::class.java)
                //生成したオブジェクトを引数に画面を起動！
                startActivity(intent)
            }
        })
        //1.画面遷移用ボタンの取得。
        val btn2Intent = findViewById<Button>(R.id.button2)
        //2.画面遷移用ボタンにリスナを登録。
        btn2Intent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                //3.Intentクラスのオブジェクトを生成。
                val intent = Intent(this@Yonabaru, ebisusoba::class.java)
                //生成したオブジェクトを引数に画面を起動！
                startActivity(intent)
            }
        })

        //1.画面遷移用ボタンの取得。
        val btn3Intent = findViewById<Button>(R.id.button3)
        //2.画面遷移用ボタンにリスナを登録。
        btn3Intent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                //3.Intentクラスのオブジェクトを生成。
                val intent = Intent(this@Yonabaru, mingei::class.java)
                //生成したオブジェクトを引数に画面を起動！
                startActivity(intent)
            }
        })
    }
}
