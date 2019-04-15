package com.softgather.rcyclerviewtoactivity.mDetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.softgather.rcyclerviewtoactivity.R;

public class ActivityDetails extends AppCompatActivity {
    TextView playerName;
    ImageView playerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Initialize View

        playerName = findViewById(R.id.playerNameTv);
        playerImage = findViewById(R.id.playerImageIv);

        //Receiving Data

        Intent intent = this.getIntent();
        String name = intent.getExtras().getString("NAME_KEY");
        int image = intent.getExtras().getInt("IMAGE_KEY");

        //Bind Data

        playerName.setText(name);
        playerImage.setImageResource(image);
    }
}
