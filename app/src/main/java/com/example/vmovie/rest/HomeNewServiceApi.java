package com.example.vmovie.rest;

import com.example.vmovie.bean.HomeCardBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 毛琦 on 2017/3/11.
 */

public interface HomeNewServiceApi {
    @GET("post/getPostByTab")
    Call<HomeCardBean> getHomeNew();
}
