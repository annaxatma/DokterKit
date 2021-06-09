package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DataPasienActivity extends AppCompatActivity {

    private ImageView dataPasien_imageView_back, ImageView4;
    private TextInputLayout dataPasien_textInput_namaPasien, dataPasien_textInput_umur, dataPasien_textInput_noTelp, dataPasien_textInput_alamat, dataPasien_textInput_noTelpKeluarga;
    private Button dataPasien_button_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pasien);

        initView();

        backButton();
    }

    private void backButton() {
        dataPasien_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView(){
        ImageView4 = findViewById(R.id.ImageView4);
        dataPasien_imageView_back = findViewById(R.id.dataPasien_imageView_back);
        dataPasien_textInput_namaPasien = findViewById(R.id.dataPasien_textInput_namaPasien);

        //radio grouppp

        dataPasien_textInput_umur = findViewById(R.id.dataPasien_textInput_umur);
        dataPasien_textInput_noTelp = findViewById(R.id.dataPasien_textInput_noTelp);
        dataPasien_textInput_alamat = findViewById(R.id.dataPasien_textInput_alamat);
        dataPasien_textInput_noTelpKeluarga = findViewById(R.id.dataPasien_textInput_noTelpKeluarga);
        dataPasien_button_save = findViewById(R.id.dataPasien_button_save);
    }

}