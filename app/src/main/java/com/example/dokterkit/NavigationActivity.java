package com.example.dokterkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationActivity extends AppCompatActivity {

    private BottomNavigationView navigation_navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        initView();
        setNavBar();
    }

    private void setNavBar() {
        navigation_navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                if(item.getItemId() == R.id.file_menu){
                    selectedFragment = new FilesFragment();
                }else if(item.getItemId() == R.id.home_menu){
                    selectedFragment = new HomeFragment();
                }else if(item.getItemId() == R.id.gizi_menu){
                    //selectedFragment = new GiziActivity();
                }else if(item.getItemId() == R.id.profile_menu){
                    //selectedFragment = new ProfileActivity();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.navigation_frameLayout, selectedFragment).commit();

                return false;
            }
        });
    }

    private void initView() {
        navigation_navigationView = findViewById(R.id.navigation_navigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.navigation_frameLayout, new HomeFragment()).commit();
    }
}