package com.example.alex.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView zoneTexte1 = findViewById(R.id.ZoneTexte1);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button6 = findViewById(R.id.button6);
        final EditText nom = findViewById(R.id.nom);
        final EditText age = findViewById(R.id.age);
        final EditText poids = findViewById(R.id.poids);
        final EditText taille = findViewById(R.id.taille);


        button1.setOnClickListener(new View.OnClickListener() {
            Integer compteur = 0;
            double IMC = 0;
            @Override
            public void onClick(View v) {
                    compteur += 1;
                    IMC = Math.round(Double.parseDouble(poids.getText().toString())/((Double.parseDouble(taille.getText().toString())/100)*(Double.parseDouble(taille.getText().toString())/100)));
                    zoneTexte1.setText("Bonjour "+nom.getText()+" \nvous avez "+age.getText()+" ans \net vous pesez "+poids.getText()+" kg...\n ah ouai quand même !!\n et vous avez cliqué "+compteur+" fois.\n votre IMC est de : "+IMC);

                }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this , DetailsActivity.class);
                intent.putExtra("ref", zoneTexte1.getText());
                startActivity(intent);

            }

        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nom.setText("Nom");
                age.setText("Age");
                poids.setText("poids");
                taille.setText("taille en cm");
            }
        });
        poids.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b==true)
                {

                }
            }
        });

    }
}
