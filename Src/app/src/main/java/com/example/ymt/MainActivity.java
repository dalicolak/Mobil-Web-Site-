package com.example.ymt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bagla();
        yukle();

        webView.setWebViewClient(new WebViewClient());
    }

    public void bagla(){
        webView = findViewById(R.id.web);
    }

    public void yukle(){
        webView.loadUrl("https://www.01gsm.com");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
