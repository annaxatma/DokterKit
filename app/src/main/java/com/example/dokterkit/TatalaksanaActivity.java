package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class TatalaksanaActivity extends AppCompatActivity {

    private ImageView tatalaksana_imageView_back, ImageView16;
    private TextInputLayout tatalaksana_textInput_tatalaksana;
    private Button tatalaksana_button_save3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatalaksana);

        initView();
        backButton();
    }

    private void backButton() {
        tatalaksana_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView16 = findViewById(R.id.ImageView16);
        tatalaksana_imageView_back = findViewById(R.id.tatalaksana_imageView_back);
        tatalaksana_textInput_tatalaksana = findViewById(R.id.tatalaksana_textInput_tatalaksana);
        tatalaksana_button_save3 = findViewById(R.id.tatalaksana_button_save3);
    }

}