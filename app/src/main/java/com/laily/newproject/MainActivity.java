package com.laily.newproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.laily.newproject.fragment.EbookFragment;
import com.laily.newproject.fragment.HomeFragment;
import com.laily.newproject.fragment.ProfileFragment;
import com.laily.newproject.fragment.QuizFragment;
import com.laily.newproject.fragment.VideoFragment;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    ChipNavigationBar BottomNav;
    private long backPressTime;
    private Fragment fragment = null;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        BottomNav = findViewById(R.id.bottomBar);
        if (savedInstanceState == null) {
            BottomNav.setItemSelected(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, homeFragment)
                    .commit();
        }
        BottomNav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;

                switch (i) {
                    case R.id.item1:
                        fragment = new HomeFragment();
                        break;

                    case R.id.item2:
                        fragment = new EbookFragment();
                        break;
                    case R.id.item3:
                        fragment = new QuizFragment();
                        break;
                    case R.id.item4:
                        fragment = new VideoFragment();
                        break;
                    case R.id.item5:
                        fragment = new ProfileFragment();
                        break;
                }
                if (fragment != null) {
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.container, fragment)
                            .commit();

                } else {
                    Log.e(TAG, "Error in creating fragment");
                }

            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity(); // or finish();
    }


}