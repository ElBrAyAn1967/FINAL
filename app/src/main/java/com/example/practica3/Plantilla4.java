package com.example.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Plantilla4 extends AppCompatActivity {
    RadioButton RB01,RB02,RB03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla4);
        RB01= findViewById(R.id.RADI01);
        RB02= findViewById(R.id.RADI02);
        RB03= findViewById(R.id.RADI03);
    }
    public void Botoon(View view){
        if(RB02.isChecked()){
            Toast.makeText(this, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Plantilla5.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "RESPUESTA INCORRECTA", Toast.LENGTH_SHORT).show();

        }


    }
}