package com.lpzoutreach.livingpraiseofzion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.lpzoutreach.livingpraiseofzion.fragments.BibleVerseFragment;
import com.lpzoutreach.livingpraiseofzion.fragments.DailyDevotionalPrayerFragment;
import com.lpzoutreach.livingpraiseofzion.fragments.HomeFragment;
import com.lpzoutreach.livingpraiseofzion.fragments.MusicFragment;
import com.lpzoutreach.livingpraiseofzion.fragments.SettingsFragment;
import com.lpzoutreach.livingpraiseofzion.fragments.TrainingsFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                setTitle(R.string.left_menu_home);
                break;
            case R.id.nav_daily_devotional_prayer:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DailyDevotionalPrayerFragment()).commit();
                setTitle(R.string.left_menu_daily_devotional_prayer);
                break;
            case R.id.nav_bible_verse:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BibleVerseFragment()).commit();
                setTitle(R.string.left_menu_bible_verse);
                break;
            case R.id.nav_music:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MusicFragment()).commit();
                setTitle(R.string.left_menu_music);
                break;
            case R.id.nav_trainings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TrainingsFragment()).commit();
                setTitle(R.string.left_menu_trainings);
                break;
            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingsFragment()).commit();
                setTitle(R.string.left_menu_settings);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);


        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }

    }
}