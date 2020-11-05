package com.example.connectly;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import android.content.Intent;



public class SeekerHome extends AppCompatActivity {
    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    ListView listView;
    String mTitle[] = {"Testing", "IOs", "Android and Java developer", "Web developer"};
    String mDescription[] = {"SS&co", "Adc","eco", "cmp"};

    public Button apply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker_home);

        //Attaching AppBar code
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");

        //TabLayout code
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragments
        adapter.AddFragment(new FragmentMatched(), "Matched");
        adapter.AddFragment(new FragmentRecommended(), "Recommended");
        //Adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    //move to Apply job on Click Apply Button:
    public void ApplyOnClick(View view) {
        Intent moveToApplyJob= new Intent(SeekerHome.this,ApplyJob.class);
        startActivity(moveToApplyJob);
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
            Intent intent= new Intent(SeekerHome.this,SeekerHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu1_profile){
            Intent intent= new Intent(SeekerHome.this,SeekerProfile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu1_logout){
            Intent intent= new Intent(SeekerHome.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

