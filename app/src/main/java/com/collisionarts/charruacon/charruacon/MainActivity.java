package com.collisionarts.charruacon.charruacon;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
            //hide layouts
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.map_layput);
        rl.setVisibility(View.GONE);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //listview
        ArrayList<Talk> talks = new ArrayList<Talk>();
        Talk test1 = new  Talk();
        test1.setDescription("this is the description of the item");
        test1.setTittle("Exploiting 101");
        test1.setCountry("UY");
        test1.setName("Mateo Martinez");
        Drawable res = getResources().getDrawable(R.drawable.mateo_martinez_foto);
        test1.setImagen(res);
        test1.setTalkId("1");
        test1.setLocation("Auditorio principal");
        test1.setTime("9:30");
        Talk test2 = new  Talk();
        test2.setName("Mateo Martinez");
        test2.setCountry("AR");
        test2.setDescription("this is the description of the item");
        test2.setTittle("Exploiting 101");
        test2.setLocation("Auditorio principal");
        test2.setTime("9:30");
        Drawable res2 = getResources().getDrawable(R.drawable.mateo_martinez_foto);
        test2.setImagen(res);
        test2.setTalkId("1");
        Talk test3 = new  Talk();
        test3.setName("Mateo Martinez");
        test3.setDescription("This class is targeted for those looking to move beyond “Hacking Exposed” level skills to the next level. This class starts off slow by providing a foundation of programming survival skills of C and assembly. Next, the course moves to processor and memory structure before moving into Linux exploits and Windows Exploits. Finally, automated tools are introduced to speed up the exploit development process.");
        test3.setTittle("Exploiting 101");
        Drawable res3 = getResources().getDrawable(R.drawable.mateo_martinez_foto);
        test3.setImagen(res);
        test3.setTalkId("1");
        test3.setCountry("ES");
        test3.setLocation("Auditorio principal");
        test3.setTime("9:30");
        talks.add(test1);
        talks.add(test2);
        talks.add(test3);
        ListView lv = (ListView) findViewById(R.id.ListViewTalk);

        AdapterTalk adapter = new AdapterTalk(this, talks);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;
                //CODIGO AQUI

            }
        });
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.map_layput);
        rl.setVisibility(View.GONE);
        ListView Schedue = (ListView) findViewById(R.id.ListViewTalk);




        int id = item.getItemId();

        if (id == R.id.nav_map) {
            Schedue.setVisibility(View.GONE);
            rl.setVisibility(View.VISIBLE);

        } else if (id == R.id.nav_schedule) {
            rl.setVisibility(View.GONE);
            Schedue.setVisibility(View.VISIBLE);
        } else if (id == R.id.nav_vendors) {

        } else if (id == R.id.nav_settings) {


        } else if (id == R.id.nav_info) {




        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
