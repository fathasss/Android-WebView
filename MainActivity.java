/**
* Copyright 2021 Gungor Agri
* Developed by FatihHAS
* Licence Yukay Agriculture Machine Industry and Trade Limited Company
* Version Number : 1.1
* Location : Tekirdağ / Turkey
* https://gungoragri.com/gizlilik-politikasi/
* Licence API Key : Sorry I can't share this information!
* Android APK for build.gradle { relase type update }
* Android APK for work in Android Version 12,11,10,9,8,7,6,5,4
* All rights reserved
* See you Again :)
* */
package com.yukay.gngragri;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //WebView with website for android application started
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webview.getSettings().setSupportZoom(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl("https://www.gungoragri.com");
        webview.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        //onBackPressed with while in web browser
        if(webview.canGoBack()){
            webview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
