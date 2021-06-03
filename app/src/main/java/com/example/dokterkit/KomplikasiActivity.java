package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class KomplikasiActivity extends AppCompatActivity {

    private ImageView komplikasi_imageView_back, ImageView7;
    private TextInputLayout komplikasi_textInput_komplikasi;
    private Button komplikasi_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komplikasi);

        initView();
        backButton();
    }

    private void backButton() {
        komplikasi_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView7 = findViewById(R.id.ImageView7);
        komplikasi_imageView_back = findViewById(R.id.komplikasi_imageView_back);
        komplikasi_textInput_komplikasi = findViewById(R.id.komplikasi_textInput_komplikasi);
        komplikasi_button_save = findViewById(R.id.komplikasi_button_save);
    }

}