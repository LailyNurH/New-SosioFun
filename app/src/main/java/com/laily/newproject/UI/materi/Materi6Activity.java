package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi6Activity extends AppCompatActivity {
    private WebView materi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi6);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        WebView materi6 = (WebView) findViewById(R.id.materi6);
        materi6.getSettings().setLoadsImagesAutomatically(true);
        materi6.getSettings().setJavaScriptEnabled(true);
        materi6.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi6.getSettings().setSupportZoom(true);
        materi6.getSettings().setBuiltInZoomControls(true);
        materi6.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi6.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi6.setWebViewClient(new WebViewClient());
        materi6.loadUrl("https://flipbox.000webhostapp.com/materi6/mobile/index.html");
        WebSettings webSettings = materi6.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi6.canGoBack()) {
            materi6.goBack();
        } else {
            super.onBackPressed();
        }
    }
}