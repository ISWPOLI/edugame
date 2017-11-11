package com.example.ange.edugame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ange on 6/11/2017.
 */

public class nivel1 extends AppCompatActivity {

    int intentos = 4;
    int puntos = 0;
    int wordalength;
    String worda, CATEGORY, LEVEL="FÁCIL";
    private ImageButton bttHome;
    private ImageButton bttCerrar;
    private LinearLayout letra, teclado;
    private TextView txtPuntos, txtIntentos, mensaje;
    private ImageView img;
    ArrayList<View> btns;
    MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);

        bttHome = (ImageButton)findViewById(R.id.bttHome);
        bttCerrar = (ImageButton)findViewById(R.id.bttCerrar);
        letra = (LinearLayout)findViewById(R.id.word);
        teclado = (LinearLayout)findViewById(R.id.footer);
        txtPuntos = (TextView)findViewById(R.id.puntaje);
        txtIntentos = (TextView)findViewById(R.id.txtIntentos);
        img = (ImageView)findViewById(R.id.img);
        btns = teclado.getTouchables();
        Construye();
        mensaje = (TextView)findViewById(R.id.mensaje);

        mensaje.setText( "Es el deterioro del ambiente como consecuencia de la presencia de sustancias perjudiciales o del aumento exagerado de algunas sustancias que forman parte del medio");


        bttHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nivel1.this, home.class);
                startActivity(intent);
            }
        });
        bttCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nivel1.this, login.class);
                startActivity(intent);
            }
        });
    }

    public void Verificar(View v)
    {
        Button b = (Button)v;
        String str = b.getText().toString();
        b.setEnabled(false);
        if(worda.contains(str))
        {
            for (int i = -1; (i = worda.indexOf(str, i + 1)) != -1; )
            {
                TextView txt = (TextView) findViewById(i);
                txt.setText(str);
                wordalength--;
            }
            if(wordalength == 0)
            {
                Toast.makeText(this,"ganaste",Toast.LENGTH_LONG).show();
                img.setBackgroundResource(R.drawable.ima7);
                onPause();
                onStart();
                Construye();
                puntos++;
                txtPuntos.setText(String.valueOf(puntos));
            }
        }
        else
        {
            intentos--;
            txtIntentos.setText(String.valueOf(intentos));

            if(LEVEL.equals("FÁCIL"))
            {
                switch (intentos)
                {
                    case 5:
                        img.setBackgroundResource(R.drawable.ima2);
                        break;
                    case 4:
                        img.setBackgroundResource(R.drawable.ima3);
                        break;
                    case 3:
                        img.setBackgroundResource(R.drawable.ima4);
                        break;
                    case 2:
                        img.setBackgroundResource(R.drawable.ima4);
                        break;
                    case 1:
                        img.setBackgroundResource(R.drawable.ima5);
                        break;
                    case 0:
                        img.setBackgroundResource(R.drawable.ima6);
                        Toast.makeText(this,"La palabra era: " + worda,Toast.LENGTH_LONG).show();
                        Construye();
                        break;
                }
            }
            else
            {
                switch (intentos)
                {
                    case 3:
                        img.setBackgroundResource(R.drawable.ima2);
                        break;
                    case 2:
                        img.setBackgroundResource(R.drawable.ima3);
                        break;
                    case 1:
                        img.setBackgroundResource(R.drawable.ima4);
                        break;
                    case 0:
                        img.setBackgroundResource(R.drawable.ima5);
                        Toast.makeText(this,"La palabra era: " + worda,Toast.LENGTH_LONG).show();
                        Construye();
                        break;
                }
            }
        }
    }

    void Construye()
    {
        if(LEVEL.equals("FÁCIL"))
        {
            intentos = 6;
            txtIntentos.setText("6");
        }
        else
        {
            intentos = 4;
            txtIntentos.setText("4");
        }

        letra.removeAllViews();
        img.setImageDrawable(null);
        img.setBackgroundResource(R.drawable.ima1);
        for(View touchable : btns)
        {
            if( touchable instanceof Button )
            {
                touchable.setEnabled(true);
            }
        }

        worda = "CONTAMINACION";
        wordalength = worda.length();
        for(int i = 0; i < wordalength; i++)
        {
            TextView row = new TextView(this);
            row.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            row.setId(i);
            row.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            row.setPadding(0, 0, 15, 0);
            row.setWidth(45);
            letra.addView(row);
        }
    }
}
