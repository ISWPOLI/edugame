package com.example.tomas.botones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MyActivity extends AppCompatActivity implements Button.OnClickListener {

    private ImageView fondo;
    private Button nivel2,nivel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        fondo=(ImageView)findViewById(R.id.fondo);
        nivel2=(Button) findViewById(R.id.nivel2);

        nivel3=(Button) findViewById(R.id.nivel3);
        nivel3.setOnClickListener(this);
        nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fondo.setImageResource(R.drawable.pregunta1);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    public void mieventoclick(View view)
    {
        int resId = getResources().getIdentifier("pregunta2", "drawable", getPackageName());
        fondo.setImageResource(resId);
        //fondo.setImageResource(R.drawable.acdc);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        fondo.setImageResource(R.drawable.pregunta3);
    }
}
