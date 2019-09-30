package com.zws.android.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.zws.android.R;

public class DeviceStatisticsViewHolder extends RecyclerView.ViewHolder {

    public final TextView devtypeName;
    public final TextView deviceTotal;
    public final TextView deviceOnLine;
    public final TextView deviceOffLine;
    public final TextView deviceError;


    public DeviceStatisticsViewHolder(@NonNull View itemView) {
        super(itemView);
        devtypeName = itemView.findViewById(R.id.devtype_name);
        deviceTotal = itemView.findViewById(R.id.device_total_num);
        deviceOnLine = itemView.findViewById(R.id.device_online_num);
        deviceOffLine = itemView.findViewById(R.id.device_offline_num);
        deviceError = itemView.findViewById(R.id.device_error_num);
    }
}
