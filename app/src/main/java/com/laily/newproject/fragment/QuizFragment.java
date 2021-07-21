package com.laily.newproject.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.laily.newproject.R;
import com.laily.newproject.UI.quiz.QuizActivity;
import com.laily.newproject.quiz_utills.Constants;

import org.jetbrains.annotations.NotNull;


public class QuizFragment extends Fragment implements  View.OnClickListener {
    ImageView q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        q1 = view.findViewById(R.id.q1);
        q2 = view.findViewById(R.id.q2);
        q3 = view.findViewById(R.id.q3);
        q4 = view.findViewById(R.id.q4);
        q5 = view.findViewById(R.id.q5);
        q6 = view.findViewById(R.id.q6);
        q7 = view.findViewById(R.id.q7);
        q8 = view.findViewById(R.id.q8);
        q9 = view.findViewById(R.id.q9);
        q10 = view.findViewById(R.id.q10);

        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
        q9.setOnClickListener(this);
        q10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.q1:

                final Dialog dialog1 = new Dialog(getActivity());
                dialog1.setContentView(R.layout.start_dialog);
                Button btnstart1 = dialog1.findViewById(R.id.btnstart);
                btnstart1.setOnClickListener(v -> {
                    Intent q1Intent = new Intent(getActivity(), QuizActivity.class);
                    q1Intent.putExtra("Category", Constants.QUIZ1);
                    startActivity(q1Intent);
                });
                dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog1.show();


                break;

            case R.id.q2:

                final Dialog dialog2 = new Dialog(getActivity());
                dialog2.setContentView(R.layout.start_dialog);
                Button btnstart2 = dialog2.findViewById(R.id.btnstart);
                btnstart2.setOnClickListener(v -> {
                    Intent q1Intent = new Intent(getActivity(), QuizActivity.class);
                    q1Intent.putExtra("Category", Constants.QUIZ2);
                    startActivity(q1Intent);
                });
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2.show();


                break;

            case R.id.q3:
                final Dialog dialog3 = new Dialog(getActivity());
                dialog3.setContentView(R.layout.start_dialog);
                Button btnstart3 = dialog3.findViewById(R.id.btnstart);
                btnstart3.setOnClickListener(v -> {
                    Intent q3Intent = new Intent(getActivity(), QuizActivity.class);
                    q3Intent.putExtra("Category", Constants.QUIZ3);
                    startActivity(q3Intent);
                });
                dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog3.show();
                break;

            case R.id.q4:
                final Dialog dialog4 = new Dialog(getActivity());
                dialog4.setContentView(R.layout.start_dialog);
                Button btnstart4 = dialog4.findViewById(R.id.btnstart);
                btnstart4.setOnClickListener(v -> {
                    Intent q4Intent = new Intent(getActivity(), QuizActivity.class);
                    q4Intent.putExtra("Category", Constants.QUIZ4);
                    startActivity(q4Intent);
                });
                dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog4.show();
                break;

            case R.id.q5:
                final Dialog dialog5 = new Dialog(getActivity());
                dialog5.setContentView(R.layout.start_dialog);
                Button btnstart5 = dialog5.findViewById(R.id.btnstart);
                btnstart5.setOnClickListener(v -> {
                    Intent q5Intent = new Intent(getActivity(), QuizActivity.class);
                    q5Intent.putExtra("Category", Constants.QUIZ5);

                    startActivity(q5Intent);
                });
                dialog5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog5.show();
                break;
            case R.id.q6:
                final Dialog dialog6 = new Dialog(getActivity());
                dialog6.setContentView(R.layout.start_dialog);
                Button btnstart6 = dialog6.findViewById(R.id.btnstart);
                btnstart6.setOnClickListener(v -> {
                    Intent q6Intent = new Intent(getActivity(), QuizActivity.class);
                    q6Intent.putExtra("Category", Constants.QUIZ6);

                    startActivity(q6Intent);
                });
                dialog6.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog6.show();
                break;
            case R.id.q7:
                final Dialog dialog7 = new Dialog(getActivity());
                dialog7.setContentView(R.layout.start_dialog);
                Button btnstart7 = dialog7.findViewById(R.id.btnstart);
                btnstart7.setOnClickListener(v -> {
                    Intent q7Intent = new Intent(getActivity(), QuizActivity.class);
                    q7Intent.putExtra("Category", Constants.QUIZ7);

                    startActivity(q7Intent);
                });
                dialog7.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog7.show();
                break;
            case R.id.q8:
                final Dialog dialog8 = new Dialog(getActivity());
                dialog8.setContentView(R.layout.start_dialog);
                Button btnstart8 = dialog8.findViewById(R.id.btnstart);
                btnstart8.setOnClickListener(v -> {
                    Intent q8Intent = new Intent(getActivity(), QuizActivity.class);
                    q8Intent.putExtra("Category", Constants.QUIZ8);

                    startActivity(q8Intent);
                });
                dialog8.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog8.show();
                break;
            case R.id.q9:
                final Dialog dialog9 = new Dialog(getActivity());
                dialog9.setContentView(R.layout.start_dialog);
                Button btnstart9 = dialog9.findViewById(R.id.btnstart);
                btnstart9.setOnClickListener(v -> {
                    Intent q9Intent = new Intent(getActivity(), QuizActivity.class);
                    q9Intent.putExtra("Category", Constants.QUIZ9);

                    startActivity(q9Intent);
                });
                dialog9.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog9.show();
                break;
            case R.id.q10:
                final Dialog dialog10 = new Dialog(getActivity());
                dialog10.setContentView(R.layout.start_dialog);
                Button btnstart10 = dialog10.findViewById(R.id.btnstart);
                btnstart10.setOnClickListener(v -> {
                    Intent q10Intent = new Intent(getActivity(), QuizActivity.class);
                    q10Intent.putExtra("Category", Constants.QUIZ10);

                    startActivity(q10Intent);
                });
                dialog10.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog10.show();
                break;

        }
    }
}