package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi8Activity extends AppCompatActivity {

    private WebView materi8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi8);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        WebView materi8 = (WebView) findViewById(R.id.materi8);
        materi8.getSettings().setLoadsImagesAutomatically(true);
        materi8.getSettings().setJavaScriptEnabled(true);
        materi8.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi8.getSettings().setSupportZoom(true);
        materi8.getSettings().setBuiltInZoomControls(true);
        materi8.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi8.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi8.setWebViewClient(new WebViewClient());
        materi8.loadUrl("https://flipbox.000webhostapp.com/materi8/mobile/index.html");
        WebSettings webSettings = materi8.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi8.canGoBack()) {
            materi8.goBack();
        } else {
            super.onBackPressed();
        }
    }
}