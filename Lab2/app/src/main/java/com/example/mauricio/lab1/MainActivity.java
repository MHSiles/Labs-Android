package com.example.mauricio.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizonalView();
        getText();
        changeText();
    }

    private void horizonalView(){
        Button button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               startActivity(new Intent(MainActivity.this, Actividad1.class));
           }
        });
    }

    public void getText(){
        Button button2 = (Button) findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText mensaje = (EditText) findViewById(R.id.mensaje);

                Intent intent = new Intent(getBaseContext(), Actividad2.class);
                intent.putExtra("Nombre", mensaje.getText().toString());
                startActivity(intent);



                /*TextView display = (TextView) findViewById(R.id.mensaje_impreso);

                String str = mensaje.getText().toString();

                if(str.equals("")){
                    display.setText("¿No tienes nombre?");
                }else {
                    display.setText("¡Hola, " + str + "!");
                }*/
            }
        });

    }

    public void changeText(){
        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView titulo = (TextView) findViewById(R.id.textView);

                if (count == 1){
                    titulo.setText("Click");
                }else{
                    titulo.setText("Click x" + count);
                }

                count++;

            }
        });


    }
}
