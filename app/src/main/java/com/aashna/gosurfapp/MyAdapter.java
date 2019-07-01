package com.aashna.gosurfapp;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
Context context;
    ArrayList<Dataset> datasets;

    public MyAdapter() {
    }




    public MyAdapter(Context context, ArrayList<Dataset> datasets) {
        this.context = context;
        this.datasets = datasets;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.camps_view_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
       // Uri uri=
        Picasso.get()
                .load(datasets.get(i).getImg())
                .error(R.drawable.ic_launcher_background)
                .into(myViewHolder.imageView);
        myViewHolder.textView.setText(datasets.get(i).name);


    }

    @Override
    public int getItemCount() {
        return datasets.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

         MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img1);
            textView=itemView.findViewById(R.id.txt1);

        }
    }
}
