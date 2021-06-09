package com.example.dokterkit;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import model.patient;

public class FilesFragment extends Fragment {

    private View view;
    private FirebaseFirestore firebaseFirestore;
    private RecyclerView files_recycleView;
    //private FirestoreRecyclerAdapter adapter;
    private ArrayList<patient> patient;
    private FirebaseFirestore db;
    private myAdapter adapter1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_files, container, false);

        initView();

        return view;
    }

    private void initView() {
        firebaseFirestore = FirebaseFirestore.getInstance();
        files_recycleView = view.findViewById(R.id.files_recycleView);

//        Query query = firebaseFirestore.collection("Patients");
//        FirestoreRecyclerOptions<patient> options = new FirestoreRecyclerOptions.Builder<patient>().setQuery(query, patient.class).build();
//        adapter = new FirestoreRecyclerAdapter<patient, patienViewHolder>(options) {
//            @NonNull
//            @Override
//            public patienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_name, parent, false);
//                return new patienViewHolder(view);
//            }
//
//            @Override
//            protected void onBindViewHolder(@NonNull FilesFragment.patienViewHolder holder, int position, @NonNull patient model) {
//                holder.card_textView_name.setText(model.getNama());
//            }
//        };
//        files_recycleView.setHasFixedSize(true);
        files_recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        patient = new ArrayList<>();
        adapter1 = new myAdapter(patient);
//      files_recycleView.setAdapter(adapter);
        files_recycleView.setAdapter(adapter1);

        db = FirebaseFirestore.getInstance();
        db.collection("patients").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                List<DocumentSnapshot> list = (ArrayList<DocumentSnapshot>) queryDocumentSnapshots.getDocuments();
                for (DocumentSnapshot d:list){
                    patient obj = d.toObject(patient.class);
                    patient.add(obj);
                }
                adapter1.notifyDataSetChanged();
            }
        });
    }

    private class patienViewHolder extends RecyclerView.ViewHolder{

        private TextView card_textView_name;

        public patienViewHolder(@NonNull View itemView) {
            super(itemView);

            card_textView_name = itemView.findViewById(R.id.card_textView_name);

        }
    }

//    @Override
//    public void onStop() {
//        super.onStop();
//        adapter.stopListening();
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        adapter.startListening();
//    }
}