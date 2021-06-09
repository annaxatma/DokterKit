package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class PemeriksaanLabActivity extends AppCompatActivity {

    private ImageView pLab_imageView_back, plab_imageView_info, ImageView10;
    private TextInputLayout pLab_textInput_hemoglobin, pLab_textInput_eritrosit, pLab_textInput_leukosit, pLab_textInput_trombosit;
    private Button pLab_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemeriksaan_lab);

        initView();
        backButton();
    }

    private void backButton() {
        pLab_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView10 = findViewById(R.id.ImageView10);
        pLab_imageView_back = findViewById(R.id.addPatient_imageView_back);
        plab_imageView_info = findViewById(R.id.addPatient_imageView_info);
        pLab_textInput_hemoglobin = findViewById(R.id.pLab_textInput_hemoglobin);
        pLab_textInput_eritrosit = findViewById(R.id.pLab_textInput_eritrosit);
        pLab_textInput_leukosit = findViewById(R.id.pLab_textInput_leukosit);
        pLab_textInput_trombosit = findViewById(R.id.pLab_textInput_trombosit);
        pLab_button_save = findViewById(R.id.addPatient_button_save);
    }

}