package com.choongang.frombirthwebview

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WebView 초기화
        val webView = findViewById<WebView>(R.id.webView)

        // 외부 브라우저가 아닌 WebView 안에서 페이지를 열리게 설정
        webView.webViewClient = WebViewClient()

        // JavaScript를 사용할 수 있게 설정
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // 웹 페이지 로드
        // 안드로이드 에뮬레이터에서 localhost대신 10.0.2.2으로 해야함
        webView.loadUrl("http://10.0.2.2:8181/common/login")
    }
}