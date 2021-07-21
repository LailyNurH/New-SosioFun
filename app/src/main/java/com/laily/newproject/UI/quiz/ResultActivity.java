package com.laily.newproject.UI.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.laily.newproject.MainActivity;
import com.laily.newproject.R;

public class ResultActivity extends AppCompatActivity {
    TextView txtHighScore;
    TextView txtTotalQuizQues,txtCorrectQues,txtWrongQues;

    Button btStartQuiz;
    Button btMainMenu;

    private long backPressedTime;
    String CategoryAgainValue="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        btMainMenu = findViewById(R.id.result_bt_mainmenu);
        btStartQuiz = findViewById(R.id.result_bt_playAgain);
        txtHighScore = findViewById(R.id.result_text_High_Score);
        txtTotalQuizQues = findViewById(R.id.result_total_Ques);
        txtCorrectQues = findViewById(R.id.result_Correct_Ques);
        txtWrongQues = findViewById(R.id.result_Wrong_Ques);

        btMainMenu.setOnClickListener(v -> {

            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);

        });

        btStartQuiz.setOnClickListener(v -> {

            Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
            intent.putExtra("Category",CategoryAgainValue);
            startActivity(intent);
        });
        Intent intent = getIntent();

        int score = intent.getIntExtra("UserScore",0);
        int totalQuestion = intent.getIntExtra("TotalQuestion",0);
        int correctQues = intent.getIntExtra("CorrectQues",0);
        int wrongQues = intent.getIntExtra("WrongQues",0);

        CategoryAgainValue =  intent.getStringExtra("Category");


        txtTotalQuizQues.setText("Total Question: " +"\n"+ String.valueOf(totalQuestion));
        txtCorrectQues.setText("Correct: " + "\n"+String.valueOf(correctQues));
        txtWrongQues.setText("Wrong: " + "\n"+String.valueOf(wrongQues));
        txtHighScore.setText("Score" + "\n"+String.valueOf(score));
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Press Again to Exit", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}