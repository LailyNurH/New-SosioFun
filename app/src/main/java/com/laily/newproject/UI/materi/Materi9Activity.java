package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi9Activity extends AppCompatActivity {
    private WebView materi9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi9);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        WebView materi9 = (WebView) findViewById(R.id.materi9);
        materi9.getSettings().setLoadsImagesAutomatically(true);
        materi9.getSettings().setJavaScriptEnabled(true);
        materi9.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi9.getSettings().setSupportZoom(true);
        materi9.getSettings().setBuiltInZoomControls(true);
        materi9.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi9.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi9.setWebViewClient(new WebViewClient());
        materi9.loadUrl("https://flipbox.000webhostapp.com/materi9/mobile/index.html");
        WebSettings webSettings = materi9.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi9.canGoBack()) {
            materi9.goBack();
        } else {
            super.onBackPressed();
        }
    }
}