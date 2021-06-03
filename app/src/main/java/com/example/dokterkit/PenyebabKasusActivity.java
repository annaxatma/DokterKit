package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class PenyebabKasusActivity extends AppCompatActivity {

    private ImageView pKasus_imageView_back, ImageView11;
    private TextInputLayout pKasus_textInput_pKasus;
    private Button pKasus_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyebab_kasus);

        initView();
        backButton();
    }

    private void backButton() {
        pKasus_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView11 = findViewById(R.id.ImageView11);
        pKasus_imageView_back = findViewById(R.id.pKasus_imageView_back);
        pKasus_textInput_pKasus = findViewById(R.id.pKasus_textInput_pKasus);
        pKasus_button_save = findViewById(R.id.pKasus_button_save);
    }

}