package com.example.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Plantilla5 extends AppCompatActivity {
    RadioButton RB001,RB002,RB003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla5);
        RB001= findViewById(R.id.RABI001);
        RB002= findViewById(R.id.RADI002);
        RB003= findViewById(R.id.RADI003);
    }
    public void BOTOOON(View view){
        if(RB003.isChecked()){
            Toast.makeText(this, "RESPUESTA CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Plantilla6.class);
            startActivity(intent);
            finish();

        }else{
            Toast.makeText(this, "RESPUESTA INCORRECTA", Toast.LENGTH_SHORT).show();

        }

    }
}