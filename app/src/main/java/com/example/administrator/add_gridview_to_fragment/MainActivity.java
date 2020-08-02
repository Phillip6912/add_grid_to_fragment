package com.example.administrator.add_gridview_to_fragment;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import layout.testFragment;
import layout.testFragment2;
import layout.testFragment3;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager = null;
    List<Fragment> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewpager);

        testFragment  fg1 = new testFragment();
        testFragment2 fg2 = new testFragment2();
        testFragment3 fg3 = new testFragment3();
        list.add(fg1);
        list.add(fg2);
        list.add(fg3);
        viewPager.setAdapter(new MyFragmentStateAdapter(getSupportFragmentManager(),list));

    }
}
