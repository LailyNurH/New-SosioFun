package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi12Activity extends AppCompatActivity {
    private WebView materi12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi12);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        WebView materi12 = (WebView) findViewById(R.id.materi12);
        materi12.getSettings().setLoadsImagesAutomatically(true);
        materi12.getSettings().setJavaScriptEnabled(true);
        materi12.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi12.getSettings().setSupportZoom(true);
        materi12.getSettings().setBuiltInZoomControls(true);
        materi12.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi12.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi12.setWebViewClient(new WebViewClient());
        materi12.loadUrl("https://flipbox.000webhostapp.com/materi12/mobile/index.html");
        WebSettings webSettings = materi12.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi12.canGoBack()) {
            materi12.goBack();
        } else {
            super.onBackPressed();
        }
    }
}