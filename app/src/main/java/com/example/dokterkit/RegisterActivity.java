package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;
    private TextInputLayout textinput_register_nama, textinput_register_username, textinput_register_email, textinput_register_password;
    private ImageView imageview_register_back;
    private Button button_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textinput_register_nama = findViewById(R.id.textInput_register_nama);
        textinput_register_username = findViewById(R.id.textInput_register_username);
        textinput_register_email = findViewById(R.id.textInput_register_email);
        textinput_register_password = findViewById(R.id.textInput_register_password);
        button_register = findViewById(R.id.button_register);
        imageview_register_back = findViewById(R.id.imageview_register_back);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        imageview_register_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = textinput_register_nama.getEditText().getText().toString().trim();
                String username = textinput_register_username.getEditText().getText().toString().trim();
                String email = textinput_register_email.getEditText().getText().toString().trim();
                String password = textinput_register_password.getEditText().getText().toString().trim();

                if (nama.isEmpty()){
                    textinput_register_nama.setError("Silahkan isi kolom nama");
                    return;
                }else {
                    textinput_register_nama.setError("");
                }

                if (username.isEmpty()){
                    textinput_register_username.setError("Silahkan isi kolom username");
                    return;
                }else {
                    textinput_register_username.setError("");
                }

                if (email.isEmpty()){
                    textinput_register_email.setError("Silahkan isi kolom email");
                    return;
                }else {
                    textinput_register_email.setError("");
                }


                if (password.isEmpty()){
                    textinput_register_password.setError("Silahkan isi kolom password");
                    return;
                }else {
                    if (password.length() < 8 || password.length() > 20){
                        textinput_register_password.setError("Kata sandi harus terdiri dari 8 sampai 20 karakter");
                    }else{
                        textinput_register_password.setError("");
                    }
                }


                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "User Created!", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(getBaseContext(), WaitActivity.class);
                            startActivity(intent);
                            finish();

                        }else {
                            Toast.makeText(RegisterActivity.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}