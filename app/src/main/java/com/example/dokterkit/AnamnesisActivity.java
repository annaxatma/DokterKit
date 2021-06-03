package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AnamnesisActivity extends AppCompatActivity {

    private ImageView anamnesis_imageView_back, ImageView3;
    private TextInputLayout anamnesis_textInput_riwayatPenyakitPsien, anamnesis_textInput_riwayatPenyakitKeluagaPasien, anamnesis_textInput_obatKonsumsi, anamnesis_textInput_alergiObat, anamnesis_textInput_alergiMakanan, anamnesis_textInput_tekananDarah, anamnesis_textInput_gulaDarah;
    private Button anamnesis_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anamnesis);

        initView();
        backButton();
    }

    private void backButton() {
        anamnesis_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView3  = findViewById(R.id.ImageView3);
        anamnesis_imageView_back = findViewById(R.id.anamnesis_imageView_back);
        anamnesis_textInput_riwayatPenyakitPsien = findViewById(R.id.anamnesis_textInput_riwayatPenyakitPsien);
        anamnesis_textInput_riwayatPenyakitKeluagaPasien = findViewById(R.id.anamnesis_textInput_riwayatPenyakitKeluagaPasien);
        anamnesis_textInput_obatKonsumsi = findViewById(R.id.anamnesis_textInput_obatKonsumsi);
        anamnesis_textInput_alergiObat = findViewById(R.id.anamnesis_textInput_alergiObat);
        anamnesis_textInput_alergiMakanan = findViewById(R.id.anamnesis_textInput_alergiMakanan);
        anamnesis_textInput_tekananDarah = findViewById(R.id.anamnesis_textInput_tekananDarah);
        anamnesis_textInput_gulaDarah = findViewById(R.id.anamnesis_textInput_gulaDarah);
        anamnesis_button_save = findViewById(R.id.anamnesis_button_save);
    }

}