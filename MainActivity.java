/**
* Developed by FatihHAS
**/
package com.example.fathasss;

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
        webview.loadUrl("https://www.examplewebpage.com");
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
