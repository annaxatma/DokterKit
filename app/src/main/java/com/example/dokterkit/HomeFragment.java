package com.example.dokterkit;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {

    private static final String TAG = "ADD DATA";
    private ImageButton home_imageButton_add;
    private TextView textView3, textView4, textView5;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        initView();
        addButton();



        return view;
    }

    private void addButton() {
        home_imageButton_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "successfuly opened");
                Intent add = new Intent(getActivity(), AddActivity.class);
                startActivity(add);
            }
        });
    }

    private void initView() {
        home_imageButton_add = view.findViewById(R.id.home_imageButton_add);
        textView3 = view.findViewById(R.id.textView3);
        textView4 = view.findViewById(R.id.textView4);
        textView5 = view.findViewById(R.id.textView5);
    }
}