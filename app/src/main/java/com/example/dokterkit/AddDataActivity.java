package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
        click();
        backButton();

    }

    private void backButton() {addData_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void click() {
        addData_cardView_dataPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(getBaseContext(), DataPasienActivity.class);
                startActivity(dp);
            }
        });

        addData_cardView_anamnesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anam = new Intent(getBaseContext(), AnamnesisActivity.class);
                startActivity(anam);
            }
        });

        addData_cardView_penyebabKasus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pk = new Intent(getBaseContext(), PenyebabKasusActivity.class);
                startActivity(pk);
            }
        });

        addData_cardView_pFisik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pf = new Intent(getBaseContext(), PemeriksaanFisikActivity.class);
                startActivity(pf);
            }
        });

        addData_cardView_pLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pl = new Intent(getBaseContext(), PemeriksaanLabActivity.class);
                startActivity(pl);
            }
        });

        addData_cardView_prognosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prog = new Intent(getBaseContext(), PrognosisActivity.class);
                startActivity(prog);
            }
        });

        addData_cardView_diagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diag = new Intent(getBaseContext(), DiagnosisActivity.class);
                startActivity(diag);
            }
        });

        addData_cardView_komplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent komp = new Intent(getBaseContext(), KomplikasiActivity.class);
                startActivity(komp);
            }
        });

        addData_cardView_mKlinis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mk = new Intent(getBaseContext(), ManifestasiKlinisActivity.class);
                startActivity(mk);
            }
        });

        addData_cardView_tatalaksana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tata = new Intent(getBaseContext(), TatalaksanaActivity.class);
                startActivity(tata);
            }
        });
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