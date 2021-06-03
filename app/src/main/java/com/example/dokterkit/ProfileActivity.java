package com.example.dokterkit;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.concurrent.Executor;

public class ProfileActivity extends Fragment {

    private View view;
    private TextView textview_profile_nama, textview_profile_rumahsakit, textview_profile_notelp, textview_profile_ahli;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile_, container, false);

        textview_profile_nama = view.findViewById(R.id.textview_profile_nama);
        textview_profile_rumahsakit = view.findViewById(R.id.textview_profile_rumahsakit);
        textview_profile_notelp = view.findViewById(R.id.textview_profile_notelp);
        textview_profile_ahli = view.findViewById(R.id.textview_profile_ahli);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        userID = fAuth.getCurrentUser().getUid();

        DocumentReference documentReference = fStore.collection("profile").document(userID);
        documentReference.addSnapshotListener((Executor) this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable  DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                textview_profile_nama.setText(documentSnapshot.getString("nama"));
            }
        });

        return view;






























































    }
}