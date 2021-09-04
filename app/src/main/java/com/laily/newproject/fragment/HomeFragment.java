package com.laily.newproject.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.laily.newproject.R;
import com.laily.newproject.UI.materi.Materi10Activity;
import com.laily.newproject.UI.materi.Materi11Activity;
import com.laily.newproject.UI.materi.Materi12Activity;
import com.laily.newproject.UI.materi.Materi13Activity;
import com.laily.newproject.UI.materi.Materi14Activity;
import com.laily.newproject.UI.materi.Materi15Activity;
import com.laily.newproject.UI.materi.Materi16Activity;
import com.laily.newproject.UI.materi.Materi1Activity;
import com.laily.newproject.UI.materi.Materi2Activity;
import com.laily.newproject.UI.materi.Materi3Activity;
import com.laily.newproject.UI.materi.Materi4Activity;
import com.laily.newproject.UI.materi.Materi5Activity;
import com.laily.newproject.UI.materi.Materi6Activity;
import com.laily.newproject.UI.materi.Materi7Activity;
import com.laily.newproject.UI.materi.Materi8Activity;
import com.laily.newproject.UI.materi.Materi9Activity;
import com.laily.newproject.UI.materi.SeeAllMateriActivity;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import org.jetbrains.annotations.NotNull;


public class HomeFragment extends Fragment {
    TextView txSee;
    RelativeLayout ma1, ma2, ma3, ma4, ma5, ma6, ma7, ma8, ma9, ma10, ma11, ma12, ma13, ma14, ma15, ma16;

    CarouselView carouselView;
    int [] sampleImages={R.drawable.ic_c,R.drawable.ic_a,R.drawable.ic_b};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ma1 = view.findViewById(R.id.ma1);
        ma2 = view.findViewById(R.id.ma2);
        ma3 = view.findViewById(R.id.ma3);
        ma4 = view.findViewById(R.id.ma4);
        ma5 = view.findViewById(R.id.ma5);
        ma6 = view.findViewById(R.id.ma6);
        ma7 = view.findViewById(R.id.ma7);
        ma8 = view.findViewById(R.id.ma8);
        ma9 = view.findViewById(R.id.ma9);
        ma10 = view.findViewById(R.id.ma10);
        ma11= view.findViewById(R.id.ma11);
        ma12= view.findViewById(R.id.ma12);
        ma13= view.findViewById(R.id.ma13);
        ma14= view.findViewById(R.id.ma14);
        ma15= view.findViewById(R.id.ma15);
        ma16= view.findViewById(R.id.ma16);
        txSee = view.findViewById(R.id.txsee);
        txSee.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SeeAllMateriActivity.class);
            startActivity(intent);
        });
        ma1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi1Activity.class);
            startActivity(intent);
        });
        ma2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi2Activity.class);
            startActivity(intent);
        });
        ma3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi3Activity.class);
            startActivity(intent);
        });
        ma4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi4Activity.class);
            startActivity(intent);
        });
        ma5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi5Activity.class);
            startActivity(intent);
        });
        ma6.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi6Activity.class);
            startActivity(intent);
        });

        ma7.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi7Activity.class);
            startActivity(intent);
        });
        ma8.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi8Activity.class);
            startActivity(intent);
        });
        ma9.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi9Activity.class);
            startActivity(intent);
        });
        ma10.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi10Activity.class);
            startActivity(intent);
        });
        ma11.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi11Activity.class);
            startActivity(intent);
        });
        ma12.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi12Activity.class);
            startActivity(intent);
        });
        ma13.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi13Activity.class);
            startActivity(intent);
        });
        ma14.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi14Activity.class);
            startActivity(intent);
        });
        ma15.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi15Activity.class);
            startActivity(intent);
        });
        ma16.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Materi16Activity.class);
            startActivity(intent);
        });
        carouselView = view.findViewById(R.id.carouselView);
        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(sampleImages.length);

    }
    ImageListener imageListener = (position, imageView) -> imageView.setImageResource(sampleImages[position]);
}