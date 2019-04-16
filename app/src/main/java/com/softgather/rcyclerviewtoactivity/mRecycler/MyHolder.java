package com.softgather.rcyclerviewtoactivity.mRecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.softgather.rcyclerviewtoactivity.R;

import org.w3c.dom.Text;

public class MyHolder extends ViewHolder implements View.OnClickListener {

    TextView playerName;
    ImageView playerImage;
    TextView playerDetail;

    ItemClickListener itemClickListener;


    public MyHolder(@NonNull View itemView) {
        super(itemView);

        playerName = itemView.findViewById(R.id.textTv);
        playerImage = itemView.findViewById(R.id.imageIv);
        playerDetail = itemView.findViewById(R.id.textTv2 );

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}
