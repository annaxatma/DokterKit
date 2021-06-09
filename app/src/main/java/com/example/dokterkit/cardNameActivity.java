package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cardNameActivity extends AppCompatActivity {

    private CardView card_cardView;
    private TextView card_textView_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_name);

        card_cardView = findViewById(R.id.card_cardView);
        card_textView_name = findViewById(R.id.card_textView_name);

        card_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent see = new Intent(getBaseContext(), SeeDataActivity.class);
                startActivity(see);
            }
        });

        card_textView_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent see = new Intent(getBaseContext(), SeeDataActivity.class);
                startActivity(see);
            }
        });
    }
}