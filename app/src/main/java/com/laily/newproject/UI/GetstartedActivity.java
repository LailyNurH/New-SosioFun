package com.laily.newproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import com.laily.newproject.MainActivity;
import com.laily.newproject.R;

public class GetstartedActivity extends AppCompatActivity {
    Button get_next;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        get_next = findViewById(R.id.getstarted_next);
        get_next.setOnClickListener(v -> {
            Intent intent = new Intent(GetstartedActivity.this, MainActivity.class);
            startActivity(intent);

        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }
}