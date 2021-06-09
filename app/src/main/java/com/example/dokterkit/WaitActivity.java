package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WaitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        new Handler().postDelayed(() -> {
            //habis splash screen lalu pindah ke login
            Intent nav = new Intent(this, NavigationActivity.class);
            startActivity(nav);
            finish();
        },3000);
    }
}