package com.example.vmovie.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vmovie.R;
import com.example.vmovie.adapter.HomeListAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by 毛琦 on 2017/3/10.
 */

@EFragment(R.layout.fragment_home)
public class HomeFragment extends Fragment {
    @ViewById
    RecyclerView rv_list;
    @ViewById
    SwipeRefreshLayout srl_refresh;

    @AfterViews
    void initView(){
        rv_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_list.setAdapter(new HomeListAdapter(getActivity()));
    }
}
