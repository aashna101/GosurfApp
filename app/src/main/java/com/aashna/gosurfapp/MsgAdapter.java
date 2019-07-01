package com.aashna.gosurfapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.msgViewHolder> {

    Context context;
    ArrayList<Dataset> datasets;

    public MsgAdapter() {
    }

    public MsgAdapter(Context context, ArrayList<Dataset> datasets) {
        this.context = context;
        this.datasets = datasets;
    }

    @NonNull
    @Override
    public msgViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.msg_view_item, viewGroup, false);
        return new msgViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull msgViewHolder msgViewHolder, int i) {
        Picasso.get()
                .load(datasets.get(i).getImg())
                .into(msgViewHolder.imageView);
        msgViewHolder.textView.setText(datasets.get(i).name);

    }

    @Override
    public int getItemCount() {
        return datasets.size();
    }

    class msgViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        Button btn;

        msgViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.msgImg);
            textView=itemView.findViewById(R.id.msgTxt);
            btn=itemView.findViewById(R.id.msgBtn);

        }
    }
}
