package com.example.dokterkit;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class GiziFragment extends Fragment {
    private CardView cardView_karbohidrat, cardView_protein, cardView_lemak, cardView_vitamin, cardView_imt, cardView_manifestasi_klinis, cardView_bmi;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_gizi, container, false);

        cardView_karbohidrat = view.findViewById(R.id.CardView_karbohidrat);
        cardView_protein = view.findViewById(R.id.CardView_protein);
        cardView_lemak = view.findViewById(R.id.CardView_lemak);
        cardView_vitamin = view.findViewById(R.id.CardView_vitamin);
        cardView_imt = view.findViewById(R.id.CardView_imt);
        cardView_manifestasi_klinis = view.findViewById(R.id.CardView_manifestasi_klinis);
        cardView_bmi = view.findViewById(R.id.CardView_bmi);


        cardView_karbohidrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), karbohidrat.class));
            }
        });

        cardView_protein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), protein.class));
            }
        });

        cardView_lemak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), lemak.class));
            }
        });

        cardView_vitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), vitamin.class));
            }
        });

        cardView_imt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), imt.class));
            }
        });

        cardView_manifestasi_klinis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), manifestasi_klinis.class));
            }
        });

        cardView_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), bmi.class));
            }
        });

        return view;

    }
}