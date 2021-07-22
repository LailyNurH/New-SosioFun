package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi1Activity extends AppCompatActivity {
    private WebView materi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        materi1 = findViewById(R.id.materi1);
        materi1.getSettings().setLoadsImagesAutomatically(true);
        materi1.getSettings().setJavaScriptEnabled(true);
        materi1.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi1.getSettings().setSupportZoom(true);
        materi1.getSettings().setBuiltInZoomControls(true);
        materi1.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi1.setWebViewClient(new WebViewClient());
        materi1.loadUrl("https://flipbox.000webhostapp.com/materi1/mobile/index.html");
        WebSettings webSettings = materi1.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi1.canGoBack()) {
            materi1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
