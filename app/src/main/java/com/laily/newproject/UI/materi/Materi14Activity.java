package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi14Activity extends AppCompatActivity {
    private WebView materi14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi14);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


    materi14 = findViewById(R.id.materi14);
        materi14.getSettings().setLoadsImagesAutomatically(true);
        materi14.getSettings().setJavaScriptEnabled(true);
        materi14.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi14.getSettings().setSupportZoom(true);
        materi14.getSettings().setBuiltInZoomControls(true);
        materi14.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi14.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi14.setWebViewClient(new WebViewClient());
        materi14.loadUrl("https://flipbox.000webhostapp.com/materi14/mobile/index.html");
        WebSettings webSettings = materi14.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi14.canGoBack()) {
            materi14.goBack();
        } else {
            super.onBackPressed();
        }
    }
}