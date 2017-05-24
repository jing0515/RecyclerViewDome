package com.bawei.lvwenjing.recyclerviewdome;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by lenovo-pc on 2017/5/23.
 */

public class Adapters extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Beans> list;


    public Adapters(Context context, List<Beans> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        //根据viewType生成viewHolder
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horde, null);
                viewHolder = new VRescyView(view);
                break;
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_two_horde, null);
                viewHolder = new CRescyView(view);
                break;

        }
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //根据条目的类型给holder中的控件填充数据
        int itemViewType = getItemViewType(position);
        switch (itemViewType) {
            case 0:
                VRescyView vholder = (VRescyView) holder;
                vholder.title.setText(list.get(position).getTitle());
                vholder.infor.setText(list.get(position).getDate());
                Glide.with(context).load(list.get(position).getPic()).into(vholder.iv);
                break;
            case 1:
                CRescyView choadr = (CRescyView) holder;
                String s = list.get(position).getPic();
                String[] split = s.split("\\|");
                Glide.with(context).load(split[0]).into(choadr.iv1);
                Glide.with(context).load(split[1]).into(choadr.iv2);
                choadr.tv.setText(list.get(position).getTitle());
                break;

        }

    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position).getType() == 1) {
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class VRescyView extends RecyclerView.ViewHolder {

        TextView title;
        TextView infor;
        ImageView iv;

        public VRescyView(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.one_title);
            infor = (TextView) itemView.findViewById(R.id.one_infor);
            iv = (ImageView) itemView.findViewById(R.id.imager_one);
        }
    }

    class CRescyView extends RecyclerView.ViewHolder {


        ImageView iv1;
        ImageView iv2;
        TextView tv;


        public CRescyView(View itemView) {
            super(itemView);
            iv1 = (ImageView) itemView.findViewById(R.id.iv1);
            iv2 = (ImageView) itemView.findViewById(R.id.iv2);

            tv = (TextView) itemView.findViewById(R.id.two_infor);
        }
    }

    interface OnItemClickListener {

        void onItemClickListener(int position, View view);

        void onItemLongClickListener(int position, View view);
    }


    public OnItemClickListener listener;


    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

}
