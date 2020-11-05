package com.example.connectly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ViewRequsteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_request);

    }

    public void ViewCV_onClick(View view) {
        Intent moveToRequest= new Intent(ViewRequsteActivity.this,Request.class);
        startActivity(moveToRequest);
    }

}