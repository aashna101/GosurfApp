package com.aashna.gosurfapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=findViewById(R.id.frame);
getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Dashboard()).commit();

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListner);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragmnet = null;

                    switch(menuItem.getItemId()){
                        case R.id.navigation_dashboard:
                            selectedFragmnet = new Dashboard();
                            break;
                        case R.id.navigation_profile:
                            selectedFragmnet = new Profile();
                            break;
                        case R.id.navigation_messaging:
                            selectedFragmnet = new Messaging();
                            break;

                    }


                    if (selectedFragmnet != null) {
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.frame, selectedFragmnet).commit();
                    }
                    return true;
                }
            };
}
