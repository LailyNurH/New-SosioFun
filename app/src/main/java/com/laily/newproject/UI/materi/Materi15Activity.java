package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi15Activity extends AppCompatActivity {
    private WebView materi15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi15);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        WebView materi15 = (WebView) findViewById(R.id.materi15);
        materi15.getSettings().setLoadsImagesAutomatically(true);
        materi15.getSettings().setJavaScriptEnabled(true);
        materi15.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi15.getSettings().setSupportZoom(true);
        materi15.getSettings().setBuiltInZoomControls(true);
        materi15.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi15.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi15.setWebViewClient(new WebViewClient());
        materi15.loadUrl("https://flipbox.000webhostapp.com/materi15/mobile/index.html");
        WebSettings webSettings = materi15.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi15.canGoBack()) {
            materi15.goBack();
        } else {
            super.onBackPressed();
        }
    }
}