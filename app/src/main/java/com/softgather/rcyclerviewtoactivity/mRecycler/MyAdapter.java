package com.softgather.rcyclerviewtoactivity.mRecycler;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softgather.rcyclerviewtoactivity.R;
import com.softgather.rcyclerviewtoactivity.mData.BdPlayer;
import com.softgather.rcyclerviewtoactivity.mDetail.ActivityDetails;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context context;
    List<BdPlayer> bdPlayers;

    public MyAdapter(Context context, List<BdPlayer> bdPlayers) {
        this.context = context;
        this.bdPlayers = bdPlayers;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.model,null);

        MyHolder myHolder = new MyHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {
        final String name = bdPlayers.get(position).getPlayerName();
        final int image = bdPlayers.get(position).getPlayerImage();

        //Bind Data

        myHolder.playerName.setText(name);
        myHolder.playerImage.setImageResource(image);

        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailsActivity(name,image);

            }
        });

    }

    @Override
    public int getItemCount() {
        return bdPlayers.size();
    }

    private void openDetailsActivity(String name, int image){
        Intent intent = new Intent(context,ActivityDetails.class);

        //Pack Data to Send

        intent.putExtra("NAME_KEY", name);
        intent.putExtra("IMAGE_KEY", image);

        //Open Activity

        context.startActivity(intent);
    }
}
