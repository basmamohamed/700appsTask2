package com.example.egytek.task2.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.egytek.task2.NotificationAdapter;
import com.example.egytek.task2.NotificationModel;
import com.example.egytek.task2.R;

import java.util.ArrayList;
import java.util.List;


public class Notification extends Fragment {
    private RecyclerView.Adapter madapter;
    View v;
    private RecyclerView mRecyclerView;
    private List<NotificationModel> notificationModels = new ArrayList<NotificationModel>();
    private RecyclerView.LayoutManager mLayoutManager;


    public Notification() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_notification, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        madapter = new NotificationAdapter(getContext(),notificationModels);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(madapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notificationModels = new ArrayList<>();
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));
        notificationModels.add(new NotificationModel("2015/12/2","DR.Ahmed wants to access your medical status"));

    }

}