package com.example.vmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.vmovie.R;
import com.example.vmovie.bean.HomeCardBean;
import com.example.vmovie.util.Utils;

import java.util.List;


/**
 * Created by 毛琦 on 2017/3/10.
 */

public class HomeListAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    List<HomeCardBean.DataBean> dataList;

    public HomeListAdapter(Context context, List<HomeCardBean.DataBean> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.item_home_list, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (position==0){

        }else {
            Utils.adjustContrast(holder.iv_item,-40);
            Glide.with(context).load(dataList.get(position).getImage()).into(holder.iv_item);
            holder.tv_title.setText(dataList.get(position).getWx_small_app_title());
            holder.tv_cate.setText(dataList.get(position).getCates().get(0).getCatename()+" / "+Utils.formatVideoDuration(dataList.get(position).getDuration()));
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    TextView tv_cate;
    TextView tv_title;
    ImageView iv_item;

    public ViewHolder(View itemView) {
        super(itemView);
        tv_cate = (TextView) itemView.findViewById(R.id.tv_cate);
        tv_title = (TextView) itemView.findViewById(R.id.tv_title);
        iv_item = (ImageView) itemView.findViewById(R.id.iv_iv_item);
    }
}