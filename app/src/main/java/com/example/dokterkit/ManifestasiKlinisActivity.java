package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class ManifestasiKlinisActivity extends AppCompatActivity {

    private ImageView mKlinis_imageView_back, ImageView8;
    private TextInputLayout mKlinis_textInput_mKlinis;
    private Button mKlinis_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifestasi_klinis);

        initView();
        backButton();
    }

    private void backButton() {
        mKlinis_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView8 = findViewById(R.id.ImageView8);
        mKlinis_imageView_back = findViewById(R.id.mKlinis_imageView_back);
        mKlinis_textInput_mKlinis = findViewById(R.id.mKlinis_textInput_mKlinis);
        mKlinis_button_save = findViewById(R.id.mKlinis_button_save);
    }

}