package com.example.dokterkit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class EditProfileActivity extends AppCompatActivity {

    private ImageView imageview_addphoto, imageview_fotoprofile;
    private TextInputLayout textinput_namaRS, textinput_noID, textinput_profesi;
    private Button button_save;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        imageview_addphoto = findViewById(R.id.imageview_addphoto);
        imageview_fotoprofile = findViewById(R.id.imageview_foroprofile);
        textinput_namaRS = findViewById(R.id.textInput_namaRS);
        textinput_noID = findViewById(R.id.textInput_noID);
        textinput_profesi = findViewById(R.id.textInput_profesi);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();


    }
}