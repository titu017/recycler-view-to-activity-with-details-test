package com.softgather.rcyclerviewtoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.softgather.rcyclerviewtoactivity.mData.BdPlayerCollection;
import com.softgather.rcyclerviewtoactivity.mRecycler.MyAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter = new MyAdapter(this,BdPlayerCollection.getBdPlayers());
        recyclerView.setAdapter(myAdapter);
    }
}
