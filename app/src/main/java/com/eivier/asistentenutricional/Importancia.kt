package com.eivier.asistentenutricional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.btn_volver.*

class Importancia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_importancia)

        val webViewComerBien: WebView = findViewById(R.id.webViewComerBien)
        webViewComerBien.settings.javaScriptEnabled = true
        webViewComerBien.loadUrl("https://www.sportaragon.com/la-importancia-comer-bien/")

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
