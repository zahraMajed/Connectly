package com.example.connectly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Request extends AppCompatActivity {

    //1)Declear the components:
    private PDFView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        //2) load the cv pdf file:
        cv= (PDFView) findViewById(R.id.pdfCv);
        cv.fromAsset("resume_tamplet.pdf").load();

    }
}