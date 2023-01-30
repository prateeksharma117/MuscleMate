package com.example.musclemate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.example.musclemate.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        toolbar = findViewById(R.id.toolBar);
        drawerLayout = findViewById(R.id.drawer_Layout);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();
        binding.navigationDrawer.setItemIconTintList(null);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);


        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id =item.getItemId();

                if (id==R.id.diet)
                {
                    loadFragment(new DietFragment(),false);
                }
                else if (id==R.id.yoga)
                {
                    loadFragment(new YogaFragment(),false);
                }
                else if (id==R.id.gym)
                {
                    loadFragment(new TranningFragment(),false);
                }
                else if (id==R.id.progress)
                {
                    loadFragment(new ProgressFragment(),false);
                }
                else
                {
                    loadFragment(new UserFragnmet(),false);
                }

                return true;
            }
        });
        binding.bottomNavigation.setSelectedItemId(R.id.gym);

    }
    public void loadFragment(Fragment fragment,boolean Flag)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if (Flag)
        ft.add(R.id.frameLayout,fragment);
        else
            ft.replace(R.id.frameLayout,fragment);
        ft.commit();
    }


}