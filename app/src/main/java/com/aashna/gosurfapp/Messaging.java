package com.aashna.gosurfapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Messaging extends Fragment {


    public Messaging() {
    }

    MsgAdapter msgAdapter;
    RecyclerView msgRecyclerView;
    ArrayList<Dataset> msgDatalist= new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment\
        View view=inflater.inflate(R.layout.fragment_messaging, container, false);
        msgRecyclerView=view.findViewById(R.id.msgRV);

        msgRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        msgRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(),
                DividerItemDecoration.VERTICAL));

        Dataset one=new Dataset(R.drawable.msgpic,"message1");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message2");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message3");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message4");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message5");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message6");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message7");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message8");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message9");
        msgDatalist.add(one);

        one=new Dataset(R.drawable.msgpic,"message10");
        msgDatalist.add(one);

        msgAdapter= new MsgAdapter(getActivity().getApplicationContext(),msgDatalist);

        msgRecyclerView.setAdapter(msgAdapter);

        return view;
    }


}
