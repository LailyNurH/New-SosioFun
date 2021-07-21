package com.laily.newproject.UI.quiz;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;

import com.laily.newproject.R;
import com.laily.newproject.fragment.QuizFragment;

public class StartDialog {
    private Context mContext;
    private Dialog startDialog;

    public StartDialog(Context mContext, Dialog startDialog) {
        this.mContext = mContext;
        this.startDialog = startDialog;
    }
    public StartDialog(QuizFragment quizFragment) {

    }
    public void startDialog(final QuizFragment quizFragment){
        startDialog = new Dialog(mContext);
        startDialog.setContentView(R.layout.start_dialog);

        Button startbtn = (Button) startDialog.findViewById(R.id.btnstart);

        startDialog.show();
        startDialog.setCancelable(false);
        startDialog.setCanceledOnTouchOutside(false);

        startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
