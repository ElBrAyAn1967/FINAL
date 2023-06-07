package com.example.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Plantilla3 extends AppCompatActivity {
    RadioButton RB1,RB2,RB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla3);
        RB1= findViewById(R.id.RADI1);
        RB2= findViewById(R.id.RADI2);
        RB3= findViewById(R.id.REDI3);
    }
    public void BOTON(View view){
     if(RB1.isChecked()){
         Toast.makeText(this, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(this,Plantilla4.class);
         startActivity(intent);
         finish();
     }else{
         Toast.makeText(this, "RESPUESTA INCORRECTA", Toast.LENGTH_SHORT).show();

     }
    }
}