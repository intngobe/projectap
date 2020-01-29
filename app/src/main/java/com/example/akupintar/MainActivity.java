package com.example.akupintar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_home :
                        Intent intent = new Intent(MainActivity.this, dashboard.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Profil Anda dapat diakses", Toast.LENGTH_SHORT);
                        break;
                    case R.id.action_diskusi :
                        Intent i = new Intent (MainActivity.this, daftar_kampus.class);
                        startActivity(i);
                        Toast.makeText(MainActivity.this, "Discussion clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_feed:
                        Intent ii = new Intent (MainActivity.this, daftar_kampus.class);
                        startActivity(ii);
                        Toast.makeText(MainActivity.this, "Feed clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_account :
                        Intent iii = new Intent (MainActivity.this, daftar_kampus.class);
                        startActivity(iii);
                        Toast.makeText(MainActivity.this, "Account clicked", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

        super.onCreate(savedInstanceState);

    }
}
