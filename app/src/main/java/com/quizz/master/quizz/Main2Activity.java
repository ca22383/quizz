package com.quizz.master.quizz;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.misPreguntas.Pregunta;


public class Main2Activity extends AppCompatActivity {


    int idResposta;
    int Resultat;
    int numPregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final TextView EnunciadoTextView = (TextView) findViewById(R.id.textView2);
        final RadioButton BotoPregunta1 = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton BotoPregunta2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton BotoPregunta3 = (RadioButton) findViewById(R.id.radioButton3);
        final RadioButton BotoPregunta4 = (RadioButton) findViewById(R.id.radioButton4);
        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);



        Button BotoResposta = (Button) findViewById(R.id.buttonResposta);
        Resultat=0;
        numPregunta=0;
        //Pregunta1.setText("Hola");

        //Jo tinc q saber en quina pregunta estic de un total de 5 preguntes
        //JO tinc q saber sempre les respostes correctes per tant es millor una clase amb els camps id pregunta, string pregunta, id resposta
        //Doncs puc fer un array de num preguntes i un
        //Millor fer una clase question

        final Pregunta layaout1 = new Pregunta("Quien gano el mundial de la FIFA 2014","España","Portugal","Alemania","Brasil",3);
        final Pregunta layaout2 = new Pregunta("Quien gano eurocopa de la FIFA 2016","Inglaterra","Portugal","Francia","Brasil",2);
        final Pregunta layaout3 = new Pregunta("Quien gano el mundial de la FIFA 2010","España","Aargentina","Chile","Brasil",1);
        final Pregunta layaout4 = new Pregunta("Quien tiene mas mundiales","Argentina","Inglaterra","Alemania","Brasil",4);
        final Pregunta layaout5 = new Pregunta("Quien gano champions 2009","Barça","Madrid","Bayern","PSG",1);



        EnunciadoTextView.setText(layaout1.getEnunciado());
        BotoPregunta1.setText(layaout1.getRespuesta1());
        BotoPregunta2.setText(layaout1.getRespuesta2());
        BotoPregunta3.setText(layaout1.getRespuesta3());
        BotoPregunta4.setText(layaout1.getRespuesta4());
        System.out.println("Quin Apreto");

        BotoPregunta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idResposta=1;
                System.out.println("Apreto la 1");

            }
        });

        BotoPregunta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idResposta=2;
                System.out.println("Apreto la 2");
            }
        });

        BotoPregunta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idResposta = 3;
                System.out.println("Apreto la 3");
            }
        });

        BotoPregunta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idResposta=4;
                System.out.println("Apreto la 4");

            }
        });

        BotoResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ara tinc que carregar el seguent layout, o que carregui un o altre segons el id de pregunta...
                //Tinc que mirar tambe si la resposta es la correcta


                if(numPregunta ==0) {
                    miraResposta(layaout1);
                    carregaPregunta(EnunciadoTextView,BotoPregunta1, BotoPregunta2, BotoPregunta3, BotoPregunta4, layaout2 );
                }

                if(numPregunta ==1) {
                    miraResposta(layaout2);
                    carregaPregunta(EnunciadoTextView,BotoPregunta1, BotoPregunta2, BotoPregunta3, BotoPregunta4, layaout3 );
                }

                if(numPregunta ==2) {
                    miraResposta(layaout3);
                    carregaPregunta(EnunciadoTextView,BotoPregunta1, BotoPregunta2, BotoPregunta3, BotoPregunta4, layaout4 );
                }

                if(numPregunta ==3) {
                    miraResposta(layaout4);
                    carregaPregunta(EnunciadoTextView,BotoPregunta1, BotoPregunta2, BotoPregunta3, BotoPregunta4, layaout5 );
                }
                if(numPregunta ==4) {
                    miraResposta(layaout5);
                    Intent intent = new Intent(
                            getApplicationContext(),
                            Main3Activity.class);
                    intent.putExtra("numencerts", Resultat);
                    intent.putExtra("numpreguntes", numPregunta+1);
                    startActivity(intent);
                }

                numPregunta = numPregunta +1;
                radioGroup.clearCheck();
            }
        });



    }

    private void carregaPregunta(TextView EnunciadoTextView,  RadioButton BotoPregunta1, RadioButton BotoPregunta2,  RadioButton BotoPregunta3, RadioButton BotoPregunta4, Pregunta layaout) {

        EnunciadoTextView.setText(layaout.getEnunciado());
        BotoPregunta1.setText(layaout.getRespuesta1());
        BotoPregunta2.setText(layaout.getRespuesta2());
        BotoPregunta3.setText(layaout.getRespuesta3());
        BotoPregunta4.setText(layaout.getRespuesta4());
    }

    private void miraResposta(Pregunta pregunta) {

        if(idResposta == pregunta.getIdRespostaCorrecta()){
            Resultat = Resultat +1;
        }
        System.out.println("Porto aquests encerts: ");
        System.out.println(Resultat);

    }


}
