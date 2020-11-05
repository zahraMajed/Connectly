package com.example.connectly;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class Request extends AppCompatActivity {

    //1)Declear the components:
    private PDFView cv;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        //2) Set the toolbar title:
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Request");

        //3) load the cv pdf file:
        cv= (PDFView) findViewById(R.id.pdfCv);
        cv.fromAsset("resume_tamplet.pdf").load();

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
            Intent intent= new Intent(Request.this,ProviderHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.Menu2_profile){
            Intent intent= new Intent(Request.this,Company_profile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu2_logout){
            Intent intent= new Intent(Request.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}