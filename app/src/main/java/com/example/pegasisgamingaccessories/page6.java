package com.example.pegasisgamingaccessories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
    }
    public void buy(View view){
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }
}