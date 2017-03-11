package com.example.vmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vmovie.R;

/**
 * Created by 毛琦 on 2017/3/10.
 */

public class HomeListAdapter extends RecyclerView.Adapter<ViewHolder>{
    Context context;

    public HomeListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_home_list,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_text.setText(""+position);
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}

class ViewHolder extends RecyclerView.ViewHolder{
    TextView tv_text;
    public ViewHolder(View itemView) {
        super(itemView);
        tv_text = (TextView) itemView.findViewById(R.id.tv_text);
    }
}