package com.example.ange.edugame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int contador = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
        Info.setText("Numero de intentos Restantes : 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValidarUser(Name.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void ValidarUser(String userName, String PasswordUser){
        if((userName.equals("Admin"))&& (PasswordUser.equals("1234"))){
            Intent intent = new Intent(login.this, home.class);
            startActivity(intent);
        }else{
            contador--;
            Info.setText("Numero de Intentos Restantes: "+ String.valueOf(contador));
            if(contador==0){
                Login.setEnabled(false);
            }
        }
    }
}
