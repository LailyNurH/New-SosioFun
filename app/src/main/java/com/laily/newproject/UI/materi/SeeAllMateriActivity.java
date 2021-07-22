package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.laily.newproject.MainActivity;
import com.laily.newproject.R;

public class SeeAllMateriActivity extends AppCompatActivity {
    ImageView d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16,arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all_materi);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        arrow = findViewById(R.id.arrow);
        arrow.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);
        d12 = findViewById(R.id.d12);
        d13 = findViewById(R.id.d13);
        d14 = findViewById(R.id.d14);
        d15 = findViewById(R.id.d15);
        d16 = findViewById(R.id.d16);
        d1.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi1Activity.class);
            startActivity(intent);
        });
        d2.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi2Activity.class);
            startActivity(intent);
        });
        d3.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi3Activity.class);
            startActivity(intent);
        });
        d4.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi4Activity.class);
            startActivity(intent);
        });
        d5.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi5Activity.class);
            startActivity(intent);
        });
        d6.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi6Activity.class);
            startActivity(intent);
        });
        d7.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi7Activity.class);
            startActivity(intent);
        });
        d8.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi8Activity.class);
            startActivity(intent);
        });

        d9.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi9Activity.class);
            startActivity(intent);
        });
        d10.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi10Activity.class);
            startActivity(intent);
        });
        d11.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi11Activity.class);
            startActivity(intent);
        });
        d12.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi12Activity.class);
            startActivity(intent);
        });
        d13.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi13Activity.class);
            startActivity(intent);
        });
        d14.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi14Activity.class);
            startActivity(intent);
        });
        d15.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi15Activity.class);
            startActivity(intent);
        });
        d16.setOnClickListener(v -> {
            Intent intent = new Intent(this, Materi16Activity.class);
            startActivity(intent);
        });
    }
}