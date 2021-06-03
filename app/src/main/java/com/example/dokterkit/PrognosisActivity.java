package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class PrognosisActivity extends AppCompatActivity {

    private ImageView prognosis_imageView_back, ImageView13;
    private TextInputLayout prognosis_textInput_prognosis;
    private Button prognosis_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prognosis);

        initView();
        backButton();
    }

    private void backButton() {
        prognosis_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView13 = findViewById(R.id.ImageView13);
        prognosis_imageView_back = findViewById(R.id.prognosis_imageView_back);
        prognosis_textInput_prognosis = findViewById(R.id.prognosis_textInput_prognosis);
        prognosis_button_save = findViewById(R.id.prognosis_button_save);
    }

}