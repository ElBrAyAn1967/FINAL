package com.example.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Plantilla2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla2);

    }
    public void Cambio2(View view){
        Intent intent = new Intent(this,Plantilla3.class);
        startActivity(intent);

    }
}