package com.example.chari.alc4phase1;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.MenuItem;
import android.app.ActionBar;
import android.app.Activity;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
//Action bar title
        getSupportActionBar().setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//load the url

        final WebView webView = findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setLoadsImagesAutomatically(true);
        webView.loadUrl("http://andela.com/alc/");

         //class SSLTolerentWebViewClient extends WebViewClient implements com.example.chari.alc4phase1.SSLTolerentWebViewClient {
            //@Override
        //public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError error) {
           // handler.proceed(); // Ignore SSL certificate errors
        }

           // @Override
           // public void onBackPressed(){
                //if (webView != null && webView.canGoBack()){
                   // webView.goBack();
               // }
               // else {
                  //  finish();
               // }
            //}
    }







