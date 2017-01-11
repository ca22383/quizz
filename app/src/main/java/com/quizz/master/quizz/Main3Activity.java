package com.quizz.master.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private int numencerts;
    private int numpreguntes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extras = getIntent().getExtras();
        numencerts = extras.getInt("numencerts");
        numpreguntes = extras.getInt("numpreguntes");

        System.out.println(numencerts);
        System.out.println(numpreguntes);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);


        textView4.setText("El numero total de encerts es: " + String.valueOf(numencerts));
        textView3.setText("El numero total de preguntes: " + String.valueOf(numpreguntes));
        textView5.setText("El numero total de errors es: " + String.valueOf(numpreguntes - numencerts));


    }
}
