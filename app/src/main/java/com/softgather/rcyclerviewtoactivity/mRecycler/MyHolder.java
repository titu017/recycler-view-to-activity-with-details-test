package com.softgather.rcyclerviewtoactivity.mRecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.softgather.rcyclerviewtoactivity.R;

public class MyHolder extends ViewHolder {

    TextView playerName;
    ImageView playerImage;
    public MyHolder(@NonNull View itemView) {
        super(itemView);

        playerName = itemView.findViewById(R.id.textTv);
        playerImage = itemView.findViewById(R.id.imageIv);
    }
}
