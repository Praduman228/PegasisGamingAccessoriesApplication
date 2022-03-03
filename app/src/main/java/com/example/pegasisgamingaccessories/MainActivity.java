package com.example.pegasisgamingaccessories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView botnav;
private Fragment home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        botnav=findViewById(R.id.bottomNavigationView);

        botnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedfrag=null;
                switch (item.getItemId()) {
                    case R.id.home2:
                        selectedfrag = new Home();
                        break;

                    case R.id.buyNow:
                        selectedfrag = new BuyNow();
                        break;
                    case R.id.aboutUs:
                        selectedfrag = new AboutUs();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,selectedfrag).commit();
                return true;
                }

        });
;

    }
public void b1(View view){
    Intent intent=new Intent(this,page1.class);
    startActivity(intent);

}
public void b2(View view){
        Intent intent2=new Intent(this,Page2.class);
        startActivity(intent2);
}
public void b4(View view){
        Intent intent4=new Intent(this,page5.class);
        startActivity(intent4);
}
public void b3(View view){
        Intent intent3=new Intent(this,page4.class);
        startActivity(intent3);
}
public void b5(View view){
        Intent intent5=new Intent(this,Page3.class);
        startActivity(intent5);
}
public  void b6(View view){
        Intent intent6=new Intent(this,page6.class);
        startActivity(intent6);
}
public void b7(View view){
        Intent intent7=new Intent(this,page7.class);
        startActivity(intent7);
    }
}