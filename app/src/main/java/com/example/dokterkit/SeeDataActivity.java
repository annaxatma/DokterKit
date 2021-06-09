package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
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

public class SeeDataActivity extends AppCompatActivity {

    private int id;
    private CardView cardView_seeData;
    TextView nama_pasien, jenisK, umur, no_tlpn, alamat, no_tlpn_kel,
            riwayat1, riwayat2, obat, alergi1, alergi2, tekanan, gula,
            penyebab, nadi, tinggi, berat, perut, mata, hemo, eri, leuko,
            trombo, prognosis, diagnosis, kompli, klinis, tatalaksana;
    private FirebaseFirestore db;
    private FirestoreRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_data);

            nama_pasien = findViewById(R.id.nama_pasien);
            jenisK = findViewById(R.id.jenisK);
            umur = findViewById(R.id.umur);
            no_tlpn = findViewById(R.id.no_tlpn);
            alamat  = findViewById(R.id.alamat);
            no_tlpn_kel = findViewById(R.id.no_tlpn_kel);
            riwayat1 = findViewById(R.id.riwayat1);
            riwayat2 = findViewById(R.id.riwayat2);
            obat = findViewById(R.id.obat);
            alergi1 = findViewById(R.id.alergi1);
            alergi2 = findViewById(R.id.alergi2);
            tekanan = findViewById(R.id.tekanan);
            gula = findViewById(R.id.gula);
            penyebab = findViewById(R.id.penyebab);
            nadi = findViewById(R.id.nadi);
            tinggi = findViewById(R.id.tinggi);
            berat = findViewById(R.id.berat);
            perut = findViewById(R.id.perut);
            mata = findViewById(R.id.mata);
            hemo = findViewById(R.id.hemo);
            eri = findViewById(R.id.eri);
            leuko = findViewById(R.id.leuko);
            trombo = findViewById(R.id.trombo);
            prognosis = findViewById(R.id.prognosis);
            diagnosis = findViewById(R.id.diagnosis);
            kompli = findViewById(R.id.kompli);
            klinis = findViewById(R.id.klinis);
            tatalaksana = findViewById(R.id.tatalaksana);
            cardView_seeData = findViewById(R.id.cardView_seeData);

            Intent intent = getIntent();
            id = intent.getIntExtra("id", 0);

        db = FirebaseFirestore.getInstance();
        db.collection("patients").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                nama_pasien.setText(patient.getNama());
                umur.setText(patient.getUmur());
                jenisK.setText(patient.getJenisKelamin());
                no_tlpn.setText(patient.getNoTelp());
                alamat.setText(patient.getAlamat());
                no_tlpn_kel.setText(patient.getNoTelpKel());
                riwayat1.setText(patient.getRiwayatP());
                riwayat2.setText(patient.getRiwayatKP());
                obat.setText(patient.getObat());
                alergi1.setText(patient.getAlergiO());
                alergi2.setText(patient.getAlergiM());
                tekanan.setText(patient.getTekananD());
                gula.setText(patient.getGulaD());
                penyebab.setText(patient.getPenyebab());
                nadi.setText(patient.getNadi());
                tinggi.setText(patient.getTinggi());
                berat.setText(patient.getBerat());
                perut.setText(patient.getLingkarP());
                mata.setText(patient.getFisikM());
                hemo.setText(patient.getHemo());
                eri.setText(patient.getErit());
                leuko.setText(patient.getLeuko());
                trombo.setText(patient.getTrombo());
                prognosis.setText(patient.getPrognosis());
                diagnosis.setText(patient.getDiagnosis());
                kompli.setText(patient.getKomplikasi());
                klinis.setText(patient.getmKlinis());
                tatalaksana.setText(patient.getTata());
            }
        });

        Query query = db.collection("Patients");
        FirestoreRecyclerOptions<patient> options = new FirestoreRecyclerOptions.Builder<patient>().setQuery(query, patient.class).build();
        adapter = new FirestoreRecyclerAdapter<patient, patienViewHolder>(options) {
            @NonNull
            @Override
            public patienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_name,parent, false);
                return new patienViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull SeeDataActivity.patienViewHolder holder, int position, @NonNull patient model) {
                //holder.nama_pasien.setText(model.getNama());
            }
        };
    }

    private class patienViewHolder extends RecyclerView.ViewHolder{
        public patienViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_pasien = itemView.findViewById(R.id.nama_pasien);
            jenisK = itemView.findViewById(R.id.jenisK);
            umur = itemView.findViewById(R.id.umur);
            no_tlpn = itemView.findViewById(R.id.no_tlpn);
            alamat  = itemView.findViewById(R.id.alamat);
            no_tlpn_kel = itemView.findViewById(R.id.no_tlpn_kel);
            riwayat1 = itemView.findViewById(R.id.riwayat1);
            riwayat2 = itemView.findViewById(R.id.riwayat2);
            obat = itemView.findViewById(R.id.obat);
            alergi1 = itemView.findViewById(R.id.alergi1);
            alergi2 = itemView.findViewById(R.id.alergi2);
            tekanan = itemView.findViewById(R.id.tekanan);
            gula = itemView.findViewById(R.id.gula);
            penyebab = itemView.findViewById(R.id.penyebab);
            nadi = itemView.findViewById(R.id.nadi);
            tinggi = itemView.findViewById(R.id.tinggi);
            berat = itemView.findViewById(R.id.berat);
            perut = itemView.findViewById(R.id.perut);
            mata = itemView.findViewById(R.id.mata);
            hemo = itemView.findViewById(R.id.hemo);
            eri = itemView.findViewById(R.id.eri);
            leuko = itemView.findViewById(R.id.leuko);
            trombo = itemView.findViewById(R.id.trombo);
            prognosis = itemView.findViewById(R.id.prognosis);
            diagnosis = itemView.findViewById(R.id.diagnosis);
            kompli = itemView.findViewById(R.id.kompli);
            klinis = itemView.findViewById(R.id.klinis);
            tatalaksana = itemView.findViewById(R.id.tatalaksana);
        }
    }
}