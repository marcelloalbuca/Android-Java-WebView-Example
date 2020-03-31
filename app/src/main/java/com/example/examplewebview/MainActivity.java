package com.example.examplewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String website = "http://aftersound.belweb.com.br/";
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl(website);

    }
}
