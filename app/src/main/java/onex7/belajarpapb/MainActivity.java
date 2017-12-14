package onex7.belajarpapb;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bab1) {
            FragmentManager fragmentManager = getFragmentManager();
            bab1 bab1 = new bab1();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab1).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab2) {
            FragmentManager fragmentManager = getFragmentManager();
            bab2 bab2 = new bab2();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab2).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab3) {
            FragmentManager fragmentManager = getFragmentManager();
            bab3 bab3 = new bab3();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab3).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab4) {
            FragmentManager fragmentManager = getFragmentManager();
            bab4 bab4 = new bab4();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab4).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab5) {
            FragmentManager fragmentManager = getFragmentManager();
            bab5 bab5 = new bab5();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab5).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab6) {
            FragmentManager fragmentManager = getFragmentManager();
            bab6 bab6 = new bab6();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab6).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab7) {
            FragmentManager fragmentManager = getFragmentManager();
            bab7 bab7 = new bab7();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab7).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab8) {
            FragmentManager fragmentManager = getFragmentManager();
            bab8 bab8 = new bab8();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab8).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab9) {
            FragmentManager fragmentManager = getFragmentManager();
            bab9 bab9 = new bab9();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab9).addToBackStack("");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_bab10) {
            FragmentManager fragmentManager = getFragmentManager();
            bab10 bab10 = new bab10();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.contain_fragment, bab10).addToBackStack("");
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
