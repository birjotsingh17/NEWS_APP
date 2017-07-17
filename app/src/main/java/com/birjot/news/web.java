package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {

    WebView webView;
    //String url = "http://timesofindia.indiatimes.com/";

    void initWeb(){

        webView = (WebView)findViewById(R.id.webview);

        // Load URL in WebView
        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl(url); // This needs internet connectivity. You must grant permission in the Manifest File
    }

   /* void ht() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("HT");
        webView.loadUrl ( url);
    }

    void tri() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("TRI");
        webView.loadUrl ( url);
    }

    void toi() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("TOI");
        webView.loadUrl ( url);
    }



    void jb() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("JB");
        webView.loadUrl ( url);
    }
    void pk() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("PK");
        webView.loadUrl ( url);
    }
    void pt() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("PT");
        webView.loadUrl ( url);
    }
*/

    void at() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("AT");
        webView.loadUrl ( url);
    }
    void au() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("AU");
        webView.loadUrl ( url);
    }
    void dj() {
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("DJ");
        webView.loadUrl ( url);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        initWeb();
        /*ht();
        tri();
        toi();
        pk();pt();jb();*/

        at();au();dj();



    }
}
