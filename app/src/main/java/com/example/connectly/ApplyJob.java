package com.example.connectly;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ApplyJob extends AppCompatActivity {
    public Button button;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_job);

        //Attaching AppBar code
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Apply Job");


        button = (Button) findViewById(R.id.Apply);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Applied successfully", Toast.LENGTH_LONG).show();
            }


        });
    }
    //Attache menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //on Click on menu items:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if (id == R.id.menu1_home){
            Intent intent= new Intent(ApplyJob.this,SeekerHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu1_profile){
            Intent intent= new Intent(ApplyJob.this,SeekerProfile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu1_logout){
            Intent intent= new Intent(ApplyJob.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}