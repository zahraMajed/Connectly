package com.example.connectly;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class ViewRequsteActivity extends AppCompatActivity {
    private Toolbar toolbar;
    public Button viewBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_request);
        viewBtn=(Button) findViewById(R.id.viewId);
        //Attaching AppBar code
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("View Requests");

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragments
        adapter.AddFragment(new viewRequestsFragment(), "Requests");

    }

    public void ViewCV_onClick(View view) {
        Intent moveToRequest= new Intent(ViewRequsteActivity.this,Request.class);
        startActivity(moveToRequest);
    }
    //Attache menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if (id == R.id.menu2_home){
            Intent intent= new Intent(ViewRequsteActivity.this,ProviderHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.Menu2_profile){
            Intent intent= new Intent(ViewRequsteActivity.this,Company_profile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu2_logout){
            Intent intent= new Intent(ViewRequsteActivity.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}