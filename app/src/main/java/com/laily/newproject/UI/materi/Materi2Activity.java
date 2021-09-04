package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi2Activity extends AppCompatActivity {
    private WebView materi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        materi2 = findViewById(R.id.materi2);
        materi2.getSettings().setLoadsImagesAutomatically(true);
        materi2.getSettings().setJavaScriptEnabled(true);
        materi2.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi2.getSettings().setSupportZoom(true);
        materi2.getSettings().setBuiltInZoomControls(true);
        materi2.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi2.setWebViewClient(new WebViewClient());
        materi2.loadUrl("https://hamidahlaily.github.io/materi2/mobile/index.html");
        WebSettings webSettings = materi2.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi2.canGoBack()) {
            materi2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
