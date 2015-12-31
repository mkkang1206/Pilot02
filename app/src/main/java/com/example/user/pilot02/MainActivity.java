/*

package com.example.user.pilot02;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //---------최용---------//
    private ImageView mimageView = null;
    //---------------------//

    //---------강민경---------//
    ViewPager pager;
    ViewPagerAdapter adapter;
    Button quickButton;
    Button menualButton;
    //---------------------//
    ListView listview01;

    View viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------최용---------//
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mimageView = (ImageView) findViewById(R.id.imageView);


        Glide.with(this).load("http://cfile10.uf.tistory.com/image/24593B3555FC33A01D06E8").into(mimageView);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //---------------------//

        //---------강민경---------//
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(this);
        pager.setAdapter(adapter);
        pager.beginFakeDrag();

        quickButton = (Button) findViewById(R.id.quickBtn);
        menualButton = (Button) findViewById(R.id.menuBtn);

        quickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(0);
            }
        });

        menualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(1);
            }
        });
        //---------------------//

    }

    //---------강민경---------//
    public class ViewPagerAdapter extends PagerAdapter {

        private String[] urlInput = {"http://asdev.hanssem.com/admin/board/doSearch.as?CONTEXT_TYPE=FAQ&PARAM_CONTEXT_TYPE=FAQ&VIEW_COUNT=40",
                "http://asdev.hanssem.com/admin/board/doSearch.as?CONTEXT_TYPE=MAN&PARAM_CONTEXT_TYPE=MAN&VIEW_COUNT=40"};

        private Context mContext;

        public ViewPagerAdapter( Context context ) {
            mContext = context;
        }

        public int getCount() {
            return 3;
        }

        public LinearLayout instantiateItem(ViewGroup container, int position) {
            Log.d("case test", Integer.toString(position));
            switch (position) {

                case 0:
                    Log.d("case 0", Integer.toString(position));
                    ListViewLayout listViewLayout01 = new ListViewLayout(mContext);
                    listViewLayout01.seturlInput(urlInput[position]);
                    container.addView(listViewLayout01, position);

                    return listViewLayout01;
                case 1:
                    Log.d("case 1", Integer.toString(position));
                    ListViewLayout listViewLayout02 = new ListViewLayout(mContext);
                    listViewLayout02.seturlInput(urlInput[position]);
                    container.addView(listViewLayout02, position);

                    return listViewLayout02;
                case 2:
                    Log.d("case 2", Integer.toString(position));
                    DetailView detailView = new DetailView(mContext);
                    container.addView(detailView, position);

                    return detailView;
                default:return null;
            }
        }

        public void destroyItem(ViewGroup container, int position, Object view) {
            container.removeView((View)view);
        }

        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }
    //---------------------//

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
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        //---------최용---------//
        Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show();
        //---------------------//

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
*/
package com.example.user.pilot02;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //---------최용---------//
    private ImageView mimageView = null;
    //---------------------//

    //---------강민경---------//
    static ViewPager pager;
    static DetailView detailView;
    ViewPagerAdapter adapter;
    Button quickButton;
    Button menualButton;
    //---------------------//

    int menuNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------최용---------//
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mimageView = (ImageView) findViewById(R.id.imageView);


        Glide.with(this).load("http://cfile10.uf.tistory.com/image/24593B3555FC33A01D06E8").into(mimageView);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //---------------------//

        //---------강민경---------//
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(this);
        pager.setAdapter(adapter);
        //pager.beginFakeDrag();

        quickButton = (Button) findViewById(R.id.quickBtn);
        menualButton = (Button) findViewById(R.id.menuBtn);

        quickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(0);
                menuNum = 0;
            }
        });

        menualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(1);
                menuNum = 1;
            }
        });
        //---------------------//
        detailView = new DetailView(getApplicationContext());
    }

    //---------강민경---------//
    public class ViewPagerAdapter extends PagerAdapter {

        private String[] urlInput = {"http://asdev.hanssem.com/admin/board/doSearch.as?CONTEXT_TYPE=FAQ&PARAM_CONTEXT_TYPE=FAQ&VIEW_COUNT=40",
                "http://asdev.hanssem.com/admin/board/doSearch.as?CONTEXT_TYPE=MAN&PARAM_CONTEXT_TYPE=MAN&VIEW_COUNT=40"};


        private Context mContext;

        public ViewPagerAdapter( Context context ) {
            mContext = context;
        }

        public int getCount() {
            return 3;
        }

        public Object instantiateItem(ViewGroup container, int position) {
            Log.d("case test", Integer.toString(position));

            switch (position) {

                case 0:
                    Log.d("case 0", Integer.toString(position));

                    ListViewLayout listViewLayout01 = new ListViewLayout(mContext);
                    listViewLayout01.seturlInput(urlInput[position]);
                    container.addView(listViewLayout01, position);

                    return listViewLayout01;

                case 1:
                    Log.d("case 1", Integer.toString(position));

                    ListViewLayout listViewLayout02 = new ListViewLayout(mContext);
                    listViewLayout02.seturlInput(urlInput[position]);
                    container.addView(listViewLayout02, position);

                    return listViewLayout02;

                case 2:
                    Log.d("case 2", Integer.toString(position));

                    container.addView(detailView, position);
                    return detailView;

                default:return null;
            }
        }

        public void destroyItem(ViewGroup container, int position, Object view) {
            container.removeView((View)view);
        }

        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }
    //---------------------//

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if(pager.getCurrentItem()==1)
            {
                pager.setCurrentItem(0);
            }else if(pager.getCurrentItem()==2&&menuNum == 0)
            {
                pager.setCurrentItem(0);
            }else if(pager.getCurrentItem()==2&&menuNum == 1)
            {
                pager.setCurrentItem(1);
            }else {
                super.onBackPressed();
            }
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
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        //---------최용---------//
        Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show();
        //---------------------//

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
