package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi3Activity extends AppCompatActivity {
    private WebView materi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        WebView materi3 = (WebView) findViewById(R.id.materi3);
        materi3.getSettings().setLoadsImagesAutomatically(true);
        materi3.getSettings().setJavaScriptEnabled(true);
        materi3.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi3.getSettings().setSupportZoom(true);
        materi3.getSettings().setBuiltInZoomControls(true);
        materi3.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi3.setWebViewClient(new WebViewClient());
        materi3.loadUrl("https://flipbox.000webhostapp.com/materi3/mobile/index.html");
        WebSettings webSettings = materi3.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi3.canGoBack()) {
            materi3.goBack();
        } else {
            super.onBackPressed();
        }
    }
}