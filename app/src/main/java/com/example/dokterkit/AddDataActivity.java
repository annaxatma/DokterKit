package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class AddDataActivity extends AppCompatActivity {

    private ImageView addData_imageView_back, ImageView2;
    private CardView addData_cardView_dataPasien, addData_cardView_anamnesis, addData_cardView_penyebabKasus, addData_cardView_pFisik, addData_cardView_pLab, addData_cardView_prognosis, addData_cardView_diagnosis, addData_cardView_komplikasi, addData_cardView_mKlinis, addData_cardView_tatalaksana;
    private Button addData_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        initView();

    }

    private void initView(){
        ImageView2 = findViewById(R.id.addData_imageView_back);
        addData_imageView_back = findViewById(R.id.addData_imageView_back);
        addData_cardView_dataPasien = findViewById(R.id.addData_cardView_dataPasien);
        addData_cardView_anamnesis = findViewById(R.id.addData_cardView_anamnesis);
        addData_cardView_penyebabKasus = findViewById(R.id.addData_cardView_penyebabKasus);
        addData_cardView_pFisik = findViewById(R.id.addData_cardView_pFisik);
        addData_cardView_pLab = findViewById(R.id.addData_cardView_pLab);
        addData_cardView_prognosis = findViewById(R.id.addData_cardView_prognosis);
        addData_cardView_diagnosis = findViewById(R.id.addData_cardView_diagnosis);
        addData_cardView_komplikasi = findViewById(R.id.addData_cardView_komplikasi);
        addData_cardView_mKlinis = findViewById(R.id.addData_cardView_mKlinis);
        addData_cardView_tatalaksana = findViewById(R.id.addData_cardView_tatalaksana);
        addData_button_save = findViewById(R.id.addData_button_save);
    }

}