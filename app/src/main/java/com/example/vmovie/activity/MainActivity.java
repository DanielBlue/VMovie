package com.example.vmovie.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.vmovie.R;
import com.example.vmovie.adapter.HomePagerAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById
    Toolbar toolbar;
    @ViewById
    BottomNavigationBar bnb_bottom;
    @ViewById
    ViewPager vp_pager;
    @ViewById
    TabLayout tl_tab;
    @ViewById
    FloatingActionButton fab_search;

    @AfterViews
    void initView() {
        initToolBar();
        initViewPagers();
        initBottomBar();
    }

    private void initViewPagers() {
        vp_pager.setAdapter(new HomePagerAdapter(getSupportFragmentManager()));
        tl_tab.setupWithViewPager(vp_pager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    private void initBottomBar() {
        bnb_bottom.setAutoHideEnabled(true);
        bnb_bottom.setMode(BottomNavigationBar.MODE_FIXED);
        bnb_bottom.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bnb_bottom.addItem(new BottomNavigationItem(R.drawable.ic_home_white_24dp, R.string.home))
                .addItem(new BottomNavigationItem(R.drawable.ic_library_books_white_24dp, R.string.series))
                .addItem(new BottomNavigationItem(R.drawable.ic_local_movies_white_24dp, R.string.backstage))
                .addItem(new BottomNavigationItem(R.drawable.ic_face_white_24dp, R.string.user))
                .initialise();
    }

    private void initToolBar() {
        setSupportActionBar(toolbar);
    }
}
