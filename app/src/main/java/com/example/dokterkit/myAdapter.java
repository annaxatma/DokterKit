package com.example.dokterkit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import model.patient;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myviewHolder>{

    ArrayList<model.patient> patient;



    public myAdapter(ArrayList<model.patient> patient) {
        this.patient = patient;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_name, parent, false);
        myviewHolder vHolder = new myviewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.myviewHolder holder, int position) {
        holder.nama_pasien.setText(patient.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return patient.size();
    }

    class myviewHolder extends RecyclerView.ViewHolder{


        TextView nama_pasien, jenisK, umur, no_tlpn, alamat, no_tlpn_kel,
                riwayat1, riwayat2, obat, alergi1, alergi2, tekanan, gula,
                penyebab, nadi, tinggi, berat, perut, mata, hemo, eri, leuko,
                trombo, prognosis, diagnosis, kompli, klinis, tatalaksana;

        public myviewHolder(@NonNull View itemView) {
            super(itemView);
            nama_pasien = itemView.findViewById(R.id.nama_pasien);
//            jenisK = itemView.findViewById(R.id.jenisK);
//            umur = itemView.findViewById(R.id.umur);
//            no_tlpn = itemView.findViewById(R.id.no_tlpn);
//            alamat  = itemView.findViewById(R.id.alamat);
//            no_tlpn_kel = itemView.findViewById(R.id.no_tlpn_kel);
//            riwayat1 = itemView.findViewById(R.id.riwayat1);
//            riwayat2 = itemView.findViewById(R.id.riwayat2);
//            obat = itemView.findViewById(R.id.obat);
//            alergi1 = itemView.findViewById(R.id.alergi1);
//            alergi2 = itemView.findViewById(R.id.alergi2);
//            tekanan = itemView.findViewById(R.id.tekanan);
//            gula = itemView.findViewById(R.id.gula);
//            penyebab = itemView.findViewById(R.id.penyebab);
//            nadi = itemView.findViewById(R.id.nadi);
//            tinggi = itemView.findViewById(R.id.tinggi);
//            berat = itemView.findViewById(R.id.berat);
//            perut = itemView.findViewById(R.id.perut);
//            mata = itemView.findViewById(R.id.mata);
//            hemo = itemView.findViewById(R.id.hemo);
//            eri = itemView.findViewById(R.id.eri);
//            leuko = itemView.findViewById(R.id.leuko);
//            trombo = itemView.findViewById(R.id.trombo);
//            prognosis = itemView.findViewById(R.id.prognosis);
//            diagnosis = itemView.findViewById(R.id.diagnosis);
//            kompli = itemView.findViewById(R.id.kompli);
//            klinis = itemView.findViewById(R.id.klinis);
//            tatalaksana = itemView.findViewById(R.id.tatalaksana);
        }

    }
}
