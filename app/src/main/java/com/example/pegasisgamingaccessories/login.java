package com.example.pegasisgamingaccessories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button button;
    private EditText e1,e2,e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void submit(View view){
        e1=findViewById(R.id.editTextTextPersonName);
        String name=e1.getText().toString();
        e2=findViewById(R.id.editTextPhone);
        String num=e2.getText().toString();
        e3=findViewById(R.id.editTextTextEmailAddress);
        String mail=e3.getText().toString();
        e4=findViewById(R.id.editTextPhone2);
        String phnno=e4.getText().toString();
        e5=findViewById(R.id.editTextTextMultiLine);
        String add=e5.getText().toString();
        if (name.isEmpty() || num.isEmpty() || mail.isEmpty() || phnno.isEmpty() || add.isEmpty()){
            Toast.makeText(this, "Enter Complete Details", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent=new Intent(this,SubmitPage.class);
            startActivity(intent);
        }
    }
}