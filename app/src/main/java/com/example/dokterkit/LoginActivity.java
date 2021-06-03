package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    FirebaseAuth fAuth;
    private TextInputLayout textinput_login_email, textinput_login_password;
    private Button button_login;
    private TextView textview_sini;
    private Boolean validateEmail, validatePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textinput_login_email = findViewById(R.id.textInput_login_email);
        textinput_login_password = findViewById(R.id.textInput_login_password);
        button_login = findViewById(R.id.button_login);
        textview_sini = findViewById(R.id.textview_sini);
        fAuth = FirebaseAuth.getInstance();
        validateEmail = false;
        validatePass = false;

//        apabila text disini diklik, pindah ke register
        textview_sini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = textinput_login_email.getEditText().getText().toString().trim();
                String password = textinput_login_password.getEditText().getText().toString().trim();

                if (email.isEmpty()){
                    textinput_login_email.setError("Silahkan isi kolom email");
                }else {
                    textinput_login_email.setError("");
                }

                Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9!@#$]{0,20}");

                if (password.isEmpty()){
                    textinput_login_password.setError("Silahkan isi kolom password");
                }else {
                    if (password.length() < 8 || password.length() > 20) {
                        textinput_login_password.setError("Kata sandi harus terdiri dari 8 sampai 20 karakter");
                        validatePass = false;
                    } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
                        textinput_login_password.setError("Can only contain a - z, A - Z, 0 - 9, !, @, #, $");
                        validatePass = false;
                    } else {
                        textinput_login_password.setError("");
                        validatePass = true;
                    }
                }

//                authenticate the user
                fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Logged in Successfull.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        }else {
                            Toast.makeText(LoginActivity.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }

                    }
                });

            }
        });
    }
}


