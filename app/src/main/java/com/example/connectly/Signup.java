package com.example.connectly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import static com.example.connectly.R.id.spinner;

public class Signup extends AppCompatActivity implements OnItemSelectedListener {
    public Button btn;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Button button = (Button) findViewById(R.id.signup);
        btn=(Button) findViewById(R.id.orlogin) ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });


        spinner.setOnItemSelectedListener(this);

        List<String> type=new ArrayList<>();
        type.add("Seeker");
        type.add("Provider");

        ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,type);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent;
        if (spinner.getSelectedItem().toString().equals("Seeker")) {
             intent = new Intent(Signup.this,SeekerHome.class);
        intent.putExtra("data",String.valueOf(spinner.getSelectedItem()));
        startActivity(intent);}
        else
        {
            intent = new Intent(Signup.this,ProviderHome.class);
            intent.putExtra("data",String.valueOf(spinner.getSelectedItem()));
            startActivity(intent);
        }
    }
});

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    String item= parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}