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
import android.widget.TextView;

import java.io.PipedInputStream;

public class PostJobActivity extends AppCompatActivity {
    //declare the components:
    Button postJobButton;
    Button clearDataButton;
    Button cancelButton;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);

        //define the buttons:
        postJobButton=(Button) findViewById(R.id.postJob);
        clearDataButton=(Button) findViewById(R.id.clearData);
        cancelButton=(Button) findViewById(R.id.cancelPostJob);

        //define the toolbar
        toolbar=findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Post Job");


    }
    //go to View Requests Activity by on click:
    public void postJobHandler(View view) {
        Intent goToViewRequests = new Intent(PostJobActivity.this,ViewRequsteActivity.class);
        startActivity(goToViewRequests);
    }//end of post job handler
    //cancelationHandler
    //go to Provider Home Activity by on click:
    public void cancelationHandler(View view) {
        Intent goToProviderHome = new Intent(PostJobActivity.this,ProviderHome.class);
        startActivity(goToProviderHome);
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
            Intent intent= new Intent(PostJobActivity.this,ProviderHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.Menu2_profile){
            Intent intent= new Intent(PostJobActivity.this,Company_profile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu2_logout){
            Intent intent= new Intent(PostJobActivity.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}