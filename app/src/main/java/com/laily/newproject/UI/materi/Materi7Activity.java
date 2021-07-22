package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi7Activity extends AppCompatActivity {
    private WebView materi7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi7);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        materi7 = findViewById(R.id.materi7);
        materi7.getSettings().setLoadsImagesAutomatically(true);
        materi7.getSettings().setJavaScriptEnabled(true);
        materi7.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi7.getSettings().setSupportZoom(true);
        materi7.getSettings().setBuiltInZoomControls(true);
        materi7.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi7.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi7.setWebViewClient(new WebViewClient());
        materi7.loadUrl("https://flipbox.000webhostapp.com/materi7/mobile/index.html");
        WebSettings webSettings = materi7.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi7.canGoBack()) {
            materi7.goBack();
        } else {
            super.onBackPressed();
        }
    }
}