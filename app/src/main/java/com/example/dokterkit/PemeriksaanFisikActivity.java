package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class PemeriksaanFisikActivity extends AppCompatActivity {

    private ImageView pFisik_imageView_back, ImageView9;
    private TextView textView22, textView23, textView21;
    private TextInputLayout pFisik_textInput_nadi, pFisik_textInput_tinggi, pFisik_textInput_berat, pFisik_textInput_lingkarPerut, pFisik_textInput_fisikMata;
    private Button pFisik_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemeriksaan_fisik);

        initView();
        backButton();
    }

    private void backButton() {
        pFisik_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView9 = findViewById(R.id.ImageView9);
        pFisik_imageView_back = findViewById(R.id.pFisik_imageView_back);
        pFisik_textInput_nadi = findViewById(R.id.pFisik_textInput_nadi);
        pFisik_textInput_tinggi = findViewById(R.id.pFisik_textInput_tinggi);
        pFisik_textInput_berat = findViewById(R.id.pFisik_textInput_berat);
        pFisik_textInput_lingkarPerut = findViewById(R.id.pFisik_textInput_lingkarPerut);
        pFisik_textInput_fisikMata = findViewById(R.id.pFisik_textInput_fisikMata);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView21 = findViewById(R.id.textView21);
        pFisik_button_save = findViewById(R.id.pFisik_button_save);
    }

}