package com.fatima_almomen.milestone2_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewRequsteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_request);

        TextView textView = findViewById(R.id.txt_title);
        textView.setText("View Requsts");
    }
}