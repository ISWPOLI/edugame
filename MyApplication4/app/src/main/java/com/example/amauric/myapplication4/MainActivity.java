package com.example.amauric.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView fondo;
    private Button nivel1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo= (ImageView)findViewById(R.id.fondo);
    }

    public void eventoclick(View view){
        //fondo.setImageResource(R.nivel1);
        nivel1 (Button)=findViewById(R.id.nivel1);
        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setImageResource(R.drawable.nivel1);
            }
        });


    }
}
