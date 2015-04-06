package com.novoda.landingstrip;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.novoda.landing_strip.R;
import com.novoda.landingstrip.setup.DemoPagerAdapter;

public class SimpleTextTabActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_usage);

        LandingStrip landingStrip = (LandingStrip) findViewById(R.id.landing_strip);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new DemoPagerAdapter(getSupportFragmentManager()));

        landingStrip.setViewPager(viewPager, viewPager.getAdapter());
    }

}
