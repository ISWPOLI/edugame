package com.example.ange.edugame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {
    private ImageButton bttHome;
    private ImageButton bttCerrar;
    private Button nivel1;
    private Button nivel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bttHome = (ImageButton)findViewById(R.id.bttHome);
        bttCerrar = (ImageButton)findViewById(R.id.bttCerrar);

        nivel1 = (Button)findViewById(R.id.nivel1);
        nivel2 = (Button)findViewById(R.id.nivel2);

        bttHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, home.class);
                startActivity(intent);
            }
        });
        bttCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, login.class);
                startActivity(intent);
            }
        });


        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, nivel1.class);
                startActivity(intent);
            }
        });

        nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, nivel2.class);
                startActivity(intent);
            }
        });

    }
}
