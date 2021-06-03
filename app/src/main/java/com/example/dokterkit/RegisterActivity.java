package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
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
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

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
    private Boolean validateEmail, validatePass;

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

        validateEmail = false;
        validatePass = false;

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

//        Tombol back ke login
        imageview_register_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        Untuk mengecek apakah didatabase sudah ada user atau tidak
//        if (fAuth.getCurrentUser() != null){
//            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
//            finish();
//        }


        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = textinput_register_nama.getEditText().getText().toString().trim();
                String username = textinput_register_username.getEditText().getText().toString().trim();
                String email = textinput_register_email.getEditText().getText().toString().trim();
                String password = textinput_register_password.getEditText().getText().toString().trim();

                if (nama.isEmpty()){
                    textinput_register_nama.setError("Silahkan isi kolom nama");
                }else {
                    textinput_register_nama.setError("");
                }

                if (username.isEmpty()){
                    textinput_register_username.setError("Silahkan isi kolom username");
                }else {
                    textinput_register_username.setError("");
                }

                if (email.isEmpty()){
                    textinput_register_email.setError("Silahkan isi kolom email");
                }else {
                    textinput_register_email.setError("");
                }

                Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9!@#$]{0,20}");

                if (password.isEmpty()){
                    textinput_register_password.setError("Silahkan isi kolom password");
                }else {
                    if (password.length() < 8 || password.length() > 20){
                        textinput_register_password.setError("Kata sandi harus terdiri dari 8 sampai 20 karakter");
                        validatePass = false;
                    }else if (!PASSWORD_PATTERN.matcher(password).matches()){
                        textinput_register_password.setError("Can only contain a - z, A - Z, 0 - 9, !, @, #, $");
                        validatePass = false;
                    }else{
                        textinput_register_password.setError("");
                        validatePass = true;
                    }
                }


//                Register user to firebase

//                Untuk mengecek register sukses atau tidak
                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "User created.", Toast.LENGTH_SHORT).show();

//                            membuat koleksi di table database
//                            userID = fAuth.getCurrentUser().getUid();
//                            DocumentReference documentReference = fStore.collection("User").document(userID);
//                            Map<String, Object> user = new HashMap<>();
//                            user.put("nama", nama);
//                            user.put("username", username);
//                            user.put("email", email);
//
//                            documentReference.set(user).addOnSuccessListener((OnSuccessListener) (avoid) -> {
//                                Log.d(TAG, "onSucces: user Profile is created for" + userID);
//
//                            }).addOnFailureListener(new OnFailureListener() {
//                                @Override
//                                public void onFailure(@NonNull Exception e) {
//                                    Log.d(TAG, "onFailure: "+ e.toString());
//                                }
//                            });
                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));

                        }else {
                            Toast.makeText(RegisterActivity.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }

                    }
                });



            }
        });

    }
}