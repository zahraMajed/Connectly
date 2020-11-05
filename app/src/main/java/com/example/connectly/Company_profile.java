package com.example.connectly;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Company_profile extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_profile);

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profile");

        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem tabInfoC = findViewById(R.id.tabInfoCom);
        TabItem tabEinfoC = findViewById(R.id.tabEditInfoCom);
        final ViewPager viewPagerPC = findViewById(R.id.viewPager);

        CompanyPagerAdapter pagerAdapter=new CompanyPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPagerPC.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerPC.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }});
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
            Intent intent= new Intent(Company_profile.this,ProviderHome.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.Menu2_profile){
            Intent intent= new Intent(Company_profile.this,Company_profile.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu2_logout){
            Intent intent= new Intent(Company_profile.this,Login.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
