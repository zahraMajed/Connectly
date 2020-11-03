package com.example.connectly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PostJobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);

        TextView textView = findViewById(R.id.txt_title);
        textView.setText("Post Job");
        findViewById(R.id.postJob).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PostJobActivity.this,ViewRequsteActivity.class));
            }
        });
    }
}