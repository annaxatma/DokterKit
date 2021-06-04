package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class EditProfileActivity extends AppCompatActivity {

    private ImageView imageview_addphoto, imageview_fotoprofile, imageview_edit_profile_back;
    private TextInputLayout textinput_namaRS, textinput_noID, textinput_profesi;
    private Button button_save;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        imageview_edit_profile_back = findViewById(R.id.imageview_edit_profile_back);
        imageview_addphoto = findViewById(R.id.imageview_addphoto);
        imageview_fotoprofile = findViewById(R.id.imageview_foroprofile);
        textinput_namaRS = findViewById(R.id.textInput_namaRS);
        textinput_noID = findViewById(R.id.textInput_noID);
        textinput_profesi = findViewById(R.id.textInput_profesi);
        button_save = findViewById(R.id.button_save);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        //        Tombol back ke login
        imageview_edit_profile_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaRS = textinput_namaRS.getEditText().getText().toString().trim();
                String noID = textinput_noID.getEditText().getText().toString().trim();
                String profesi = textinput_profesi.getEditText().getText().toString().trim();

                if (namaRS.isEmpty()){
                    textinput_namaRS.setError("Silahkan isi kolom nama");
                }else {
                    textinput_namaRS.setError("");
                }

                if (noID.isEmpty()){
                    textinput_noID.setError("Silahkan isi kolom username");
                }else {
                    textinput_noID.setError("");
                }

                if (profesi.isEmpty()){
                    textinput_profesi.setError("Silahkan isi kolom email");
                }else {
                    textinput_profesi.setError("");
                }



            }
        });

    }
}