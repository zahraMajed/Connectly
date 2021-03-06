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

public class ProviderHome extends AppCompatActivity {
    //1)Declear the components:
    Button PostJobBtn;
    Button ViewRequestsBtn;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_home);

        //2) Define the bttons:
        PostJobBtn=(Button) findViewById(R.id.PostJob_providerHome);
        ViewRequestsBtn=(Button) findViewById(R.id.viewRequests_providerHome);

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");



    }

    //4) move to View Requests Activity on Click:
    public void viewRequests_onClick(View view) {
        Intent moveToPostJob = new Intent(ProviderHome.this,ViewRequsteActivity.class);
        startActivity(moveToPostJob);
    }

    //5) move to Post Job Activity on click:
    public void postJob_onClick(View view) {
        Intent moveToViewRequests = new Intent(ProviderHome.this,PostJobActivity.class);
        startActivity(moveToViewRequests);
    }
    //Attache menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    //on Click on menu items:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if (id == R.id.menu2_home){
            Intent intent= new Intent(ProviderHome.this,ProviderHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.Menu2_profile){
            Intent intent= new Intent(ProviderHome.this,Company_profile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu2_logout){
            Intent intent= new Intent(ProviderHome.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}