package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi10Activity extends AppCompatActivity {
    private WebView materi10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi10);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


      materi10 = findViewById(R.id.materi10);
        materi10.getSettings().setLoadsImagesAutomatically(true);
        materi10.getSettings().setJavaScriptEnabled(true);
        materi10.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi10.getSettings().setSupportZoom(true);
        materi10.getSettings().setBuiltInZoomControls(true);
        materi10.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi10.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi10.setWebViewClient(new WebViewClient());
        materi10.loadUrl("https://flipbox.000webhostapp.com/materi10/mobile/index.html");
        WebSettings webSettings = materi10.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi10.canGoBack()) {
            materi10.goBack();
        } else {
            super.onBackPressed();
        }
    }
}