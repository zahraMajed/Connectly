package com.example.connectly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
public Button button;
private EditText pass;
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.login);
        btn=(Button) findViewById(R.id.button4) ;
        pass= (EditText) findViewById(R.id.editTextNumberPassword1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check2();
                check1();

            }


        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Login.this,Signup.class);
                startActivity(intent);
            }
        });
    }
    public void check1() {
        Intent intent;
        if (!pass.getText().toString().equals("123")) {
            intent = new Intent(Login.this, SeekerHome.class);
            startActivity(intent);
        }
    }

    public void check2(){
        Intent intent;
        if(pass.getText().toString().equals("123"))
        {intent = new Intent (Login.this, ProviderHome.class);
            startActivity(intent);}
    }



    }

