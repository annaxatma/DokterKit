package com.example.dokterkit;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.concurrent.Executor;

public class ProfileActivity extends Fragment {

    public static final String TAG = "ProfileActivity";

    private int position;

    // You can add other parameters here
    public static ProfileActivity newInstance(int position) {
        Bundle args = new Bundle();
        // Pass all the parameters to your bundle
        args.putInt("pos", position);
        ProfileActivity fragment = new ProfileActivity();
        fragment.setArguments(args);
        return fragment;
    }

    private View view;
    private TextView textview_profile_nama, textview_profile_rumahsakit, textview_profile_notelp, textview_profile_ahli;
    private Button button_edit_profile;
    private ImageView imageview_foroprofile, button_logout;
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


        // nampilkan nama
        DocumentReference documentReference = fStore.collection("profile").document(userID);
        documentReference.addSnapshotListener((Executor) this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable  DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                textview_profile_nama.setText(documentSnapshot.getString("nama"));
            }
        });

        //logout
        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
//                gak tau betul atau enggak didepan getApplicationContext dan finish ditambahi getActivity()
                startActivity(new Intent(getActivity().getApplicationContext(), LoginActivity.class));
                getActivity().finish();
            }
        });

        //ke halaman edit profile
        button_edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), EditProfileActivity.class));
            }
        });



        return view;



    }

}