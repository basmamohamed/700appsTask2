package com.example.egytek.task2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationHolder>{
    private List<NotificationModel> notificationModels;
    private Context context;


    public NotificationAdapter( Context ctx , List<NotificationModel> notificationModels) {
        this.notificationModels = notificationModels;
        this.context = ctx;

    }

    @NonNull
    @Override
    public NotificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_row, parent, false);
        NotificationHolder holder = new NotificationHolder(row);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final NotificationHolder holder, int position) {
        final NotificationModel notificationModel = notificationModels.get(position);
        //holder._garageName.setText(garage.getName());
        holder.notificationDate.setText(notificationModel.getNotificationDate());
        holder.notificationMsg.setText(notificationModel.getNotificationMsg());
        }

    @Override
    public int getItemCount() {
        return notificationModels.size();
    }


    class NotificationHolder extends RecyclerView.ViewHolder {
        TextView notificationDate,notificationMsg;
        public NotificationHolder(View itemView) {
            super(itemView);
            notificationDate = itemView.findViewById(R.id.notification_date);
            notificationMsg = itemView.findViewById(R.id.notification_msg);

        }
    }



}

