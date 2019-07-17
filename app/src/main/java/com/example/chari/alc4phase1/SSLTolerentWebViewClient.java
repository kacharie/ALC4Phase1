package com.example.chari.alc4phase1;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

interface SSLTolerentWebViewClient {
    void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError error);

    void onBackPressed();
}
