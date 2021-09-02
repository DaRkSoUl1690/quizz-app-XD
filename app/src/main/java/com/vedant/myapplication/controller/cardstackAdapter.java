package com.vedant.myapplication.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vedant.myapplication.R;
import com.vedant.myapplication.model.QuizQuestion;
import com.vedant.myapplication.view.filmViewHolder;
import com.yuyakaido.android.cardstackview.CardStackView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class cardstackAdapter extends RecyclerView.Adapter<filmViewHolder> {

    private Context mContext;
    private List<QuizQuestion> mFilmQuestions;
    private LayoutInflater mLayoutInflater;

    public cardstackAdapter(Context context, List<QuizQuestion> filmQuestions) {

        mContext = context;
        mFilmQuestions = filmQuestions;
        mLayoutInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public filmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflater.inflate(R.layout.gk_view, parent, false);


        return new filmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull filmViewHolder holder, int position) {

        holder.getQuestiontxt().setText(mFilmQuestions.get(position).getQuestionText());

        holder.getImageButtontrue().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mFilmQuestions.get(position).isTrueAnswer()) {

                    Toast.makeText(mContext, "You have answered correctly. Congratulation!", Toast.LENGTH_SHORT).show();



                } else {

                    Toast.makeText(mContext, "Sorry. you were wrong. Try again!!!", Toast.LENGTH_SHORT).show();


                }

            }
        });

        holder.getImageButtonfalse().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mFilmQuestions.get(position).isTrueAnswer()) {

                    Toast.makeText(mContext, "Sorry. you were wrong. Try again!!!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(mContext, "You have answered correctly. Congratulation!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return mFilmQuestions.size();
    }
}
