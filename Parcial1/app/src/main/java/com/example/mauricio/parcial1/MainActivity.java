package com.example.mauricio.parcial1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getChoice();


    }

    public void getChoice(){
        Button rock = (Button) findViewById(R.id.rock);
        Button paper = (Button) findViewById(R.id.paper);
        Button scissors = (Button) findViewById(R.id.scissors);
        Button reset = (Button) findViewById(R.id.resetBtn);


        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();

                TextView selection1 = (TextView) findViewById(R.id.selection1);
                selection1.setText("Rock");

                TextView selection2 = (TextView) findViewById(R.id.selection2);

                Random myRandom = new Random();
                int computerChoice = myRandom.nextInt(3);

                if(computerChoice == 0){
                    selection2.setText("Rock");
                    CharSequence text = "Empate";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else if(computerChoice == 1){
                    selection2.setText("Paper");
                    // MENSAJE DE DERROTA
                    CharSequence text = "Perdiste :(";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    //SUMAS UN PUNTO A LA COMPUTADORA
                    score2 += 1;
                    TextView score2Label = (TextView) findViewById(R.id.score2);
                    score2Label.setText("" + score2);
                }else{
                    selection2.setText("Scissors");
                    // MENSAJE DE VICTORIA
                    CharSequence text = "¡Ganaste! :D";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    //SUMAS UN PUNTO AL USUARIO
                    score1 += 1;
                    TextView score1Label = (TextView) findViewById(R.id.score1);
                    score1Label.setText("" + score1);
                }


            }
        });


        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();

                TextView selection1 = (TextView) findViewById(R.id.selection1);
                selection1.setText("Paper");

                TextView selection2 = (TextView) findViewById(R.id.selection2);

                Random myRandom = new Random();
                int computerChoice = myRandom.nextInt(3);

                if(computerChoice == 0){
                    selection2.setText("Rock");
                    // MENSAJE DE VICTORIA
                    CharSequence text = "¡Ganaste! :D";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    //SUMAS UN PUNTO AL USUARIO
                    score1 += 1;
                    TextView score1Label = (TextView) findViewById(R.id.score1);
                    score1Label.setText("" + score1);
                }else if(computerChoice == 1){
                    selection2.setText("Paper");
                    CharSequence text = "Empate";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else{
                    selection2.setText("Scissors");
                    // MENSAJE DE DERROTA
                    CharSequence text = "Perdiste :(";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    //SUMAS UN PUNTO A LA COMPUTADORA
                    score2 += 1;
                    TextView score2Label = (TextView) findViewById(R.id.score2);
                    score2Label.setText("" + score2);

                }

            }
        });


        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();

                TextView selection1 = (TextView) findViewById(R.id.selection1);
                selection1.setText("Scissors");

                TextView selection2 = (TextView) findViewById(R.id.selection2);

                Random myRandom = new Random();
                int computerChoice = myRandom.nextInt(3);

                if(computerChoice == 0){
                    selection2.setText("Rock");
                    // MENSAJE DE DERROTA
                    CharSequence text = "Perdiste :(";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    //SUMAS UN PUNTO A LA COMPUTADORA
                    score2 += 1;
                    TextView score2Label = (TextView) findViewById(R.id.score2);
                    score2Label.setText("" + score2);
                }else if(computerChoice == 1){
                    selection2.setText("Paper");
                    // MENSAJE DE VICTORIA
                    CharSequence text = "¡Ganaste! :D";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    //SUMAS UN PUNTO AL USUARIO
                    score1 += 1;
                    TextView score1Label = (TextView) findViewById(R.id.score1);
                    score1Label.setText("" + score1);
                }else{
                    selection2.setText("Scissors");
                    CharSequence text = "Empate";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score1 = 0;
                score2 = 0;
                TextView score1Label = (TextView) findViewById(R.id.score1);
                score1Label.setText("" + score1);
                TextView score2Label = (TextView) findViewById(R.id.score2);
                score2Label.setText("" + score2);

            }
        });

    }
}
