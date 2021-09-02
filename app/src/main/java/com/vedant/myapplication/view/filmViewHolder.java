package com.vedant.myapplication.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.vedant.myapplication.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class filmViewHolder extends RecyclerView.ViewHolder {


    private TextView questiontxt;
    private ImageButton imageButtontrue;
    private ImageButton imageButtonfalse;


    public TextView getQuestiontxt() {
        return questiontxt;
    }

    public void setQuestiontxt(TextView questiontxt) {
        this.questiontxt = questiontxt;
    }

    public ImageButton getImageButtontrue() {
        return imageButtontrue;
    }

    public void setImageButtontrue(ImageButton imageButtontrue) {
        this.imageButtontrue = imageButtontrue;
    }

    public ImageButton getImageButtonfalse() {
        return imageButtonfalse;
    }

    public void setImageButtonfalse(ImageButton imageButtonfalse) {
        this.imageButtonfalse = imageButtonfalse;
    }

    public filmViewHolder(@NonNull View itemView) {
        super(itemView);

        questiontxt = itemView.findViewById(R.id.question_text);
        imageButtontrue = itemView.findViewById(R.id.trueButton);
        imageButtonfalse = itemView.findViewById(R.id.falseButton);



    }
}


