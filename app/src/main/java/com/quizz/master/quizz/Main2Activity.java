package com.quizz.master.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RadioButton Pregunta1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton Pregunta2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton Pregunta3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton Pregunta4 = (RadioButton) findViewById(R.id.radioButton4);

        //Pregunta1.setText("Hola");

        //Jo tinc q saber en quina pregunta estic de un total de 5 preguntes
        //JO tinc q saber sempre les respostes correctes per tant es millor una clase amb els camps id pregunta, string pregunta, id resposta
        //Doncs puc fer un array de num preguntes i un
        //Millor fer una clase question

        Pregunta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        Pregunta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        Pregunta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        Pregunta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



    }




}
