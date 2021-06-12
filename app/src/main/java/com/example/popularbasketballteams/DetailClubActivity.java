package com.example.popularbasketballteams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailClubActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club);

        ImageView imgClub = findViewById(R.id.imgClub);
        TextView tvClubName = findViewById(R.id.tvClubName);
        TextView tvClubDescription = findViewById(R.id.tvClubDescription);

        Club club = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(club != null){
            Glide.with(this)
                    .load(club.getPhoto())
                    .into(imgClub);
            tvClubName.setText(club.getName());
            tvClubDescription.setText(club.getDescription());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Description Club");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}