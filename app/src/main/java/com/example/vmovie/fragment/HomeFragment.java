package com.example.vmovie.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.vmovie.BuildConfig;
import com.example.vmovie.R;
import com.example.vmovie.adapter.HomeListAdapter;
import com.example.vmovie.bean.HomeCardBean;
import com.example.vmovie.rest.HomeNewServiceApi;
import com.example.vmovie.util.Constant;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        getData();
        rv_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_list.setAdapter(new HomeListAdapter(getActivity()));
    }

    private void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        Call<HomeCardBean> call = retrofit.create(HomeNewServiceApi.class).getHomeNew();
        call.enqueue(new Callback<HomeCardBean>() {
            @Override
            public void onResponse(Call<HomeCardBean> call, Response<HomeCardBean> response) {
                if (BuildConfig.DEBUG) Log.d("HomeFragment", "response.body():" + response.body());
            }

            @Override
            public void onFailure(Call<HomeCardBean> call, Throwable t) {
                Log.d("HomeFragment", "失败");
            }
        });
    }


}
