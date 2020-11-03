package com.example.connectly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProviderHome extends AppCompatActivity {

    Button PostJobBtn;
    Button ViewRequestsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_home);

        PostJobBtn=(Button) findViewById(R.id.PostJob_providerHome);
        ViewRequestsBtn=(Button) findViewById(R.id.viewRequests_providerHome);



    }

    public void viewRequests_onClick(View view) {
        Intent moveToPostJob = new Intent(this,PostJobActivity.class);
        startActivity(moveToPostJob);


    }

    public void postJob_onClick(View view) {
        Intent moveToViewRequests = new Intent(this,ViewRequsteActivity.class);
        startActivity(moveToViewRequests);
    }
}