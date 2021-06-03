package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class DiagnosisActivity extends AppCompatActivity {

    private ImageView diagnosis_imageView_back, ImageView5;
    private TextInputLayout diagnosis_textInput_diagnosis;
    private Button diagnosis_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        initView();
        backButton();
    }

    private void backButton() {
        diagnosis_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView5 = findViewById(R.id.ImageView5);
        diagnosis_imageView_back = findViewById(R.id.diagnosis_imageView_back);
        diagnosis_textInput_diagnosis = findViewById(R.id.diagnosis_textInput_diagnosis);
        diagnosis_button_save = findViewById(R.id.diagnosis_button_save);
    }

}