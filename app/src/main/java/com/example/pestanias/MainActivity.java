package com.example.pestanias;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.pager);

        tabLayout.setupWithViewPager(viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new BlueFragment(), "HOME");
        viewPagerAdapter.addFragment(new ScheduleFragment(), "SCHEDULE");
        viewPagerAdapter.addFragment(new GalleryFragment(), "GALLERY");
        viewPagerAdapter.addFragment(new SlideshowFragment(), "SLIDESHOW");
        viewPager.setAdapter(viewPagerAdapter);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Uso de tabs");
        toolbar.setTitleTextColor(Color.WHITE);


    }
}