package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(() -> {
            //habis splash screen lalu pindah ke login
            Intent navigation = new Intent(this, NavigationActivity.class);
            startActivity(navigation);
            finish();
        },1500);

    }
}