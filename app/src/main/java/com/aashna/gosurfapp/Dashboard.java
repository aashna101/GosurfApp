package com.aashna.gosurfapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Dashboard extends Fragment {

    public Dashboard() {
        // Required empty public constructor
    }


    MyAdapter myAdapter, coachAdapter;
    RecyclerView coachRecyclerView, campsRecyclerView;
    ArrayList<Dataset> datasetArrayList= new ArrayList<>();
    ArrayList<Dataset> coachdatasetArrayList= new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_dashboard, container, false);

        campsRecyclerView=view.findViewById(R.id.camps_recycler_view);
        coachRecyclerView=view.findViewById(R.id.coaches_recycler_view);

        campsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false));
        coachRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false));

        campsRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(),
                DividerItemDecoration.HORIZONTAL));

        coachRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(),
                DividerItemDecoration.HORIZONTAL));

// this data will replaced by actual data
        Dataset one=new Dataset(R.drawable.camps,"camp1");
        datasetArrayList.add(one);

         one=new Dataset(R.drawable.camps,"camp2");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp3");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp4");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp5");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp6");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp7");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp8");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp9");
        datasetArrayList.add(one);

        one=new Dataset(R.drawable.camps,"camp10");
        datasetArrayList.add(one);

        myAdapter= new MyAdapter(getActivity().getApplicationContext(),datasetArrayList);

        campsRecyclerView.setAdapter(myAdapter);


        one=new Dataset(R.drawable.lklklklk,"coach1");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach2");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach3");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach4");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach5");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach6");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach7");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach8");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach9");
        coachdatasetArrayList.add(one);

        one=new Dataset(R.drawable.lklklklk,"coach10");
        coachdatasetArrayList.add(one);
        coachAdapter=new MyAdapter(getActivity().getApplicationContext(),coachdatasetArrayList);

        coachRecyclerView.setAdapter(coachAdapter);

        return view;
    }

}
