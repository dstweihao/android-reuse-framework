package com.zws.android.adapter.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zws.android.R;
import com.zws.android.bean.home.DeviceStatistocsBean;

import java.util.ArrayList;
import java.util.List;

public class DeviceStatisticsAdapter extends RecyclerView.Adapter<DeviceStatisticsAdapter.ViewHolder> {
    private List<DeviceStatistocsBean> deviceStatistocsBeanList = new ArrayList<>();

    public DeviceStatisticsAdapter(List<DeviceStatistocsBean> deviceStatistocsBeanList) {
        this.deviceStatistocsBeanList = deviceStatistocsBeanList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_home_device_statistics_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        DeviceStatistocsBean statistocsBean = deviceStatistocsBeanList.get(i);
        viewHolder.devtypeName.setText(statistocsBean.getDevtypename());
        viewHolder.deviceTotal.setText(statistocsBean.getDeviceTotal());
        viewHolder.deviceOnLine.setText(statistocsBean.getDeviceOnLine());
        viewHolder.deviceOffLine.setText(statistocsBean.getDeviceOffLine());
        viewHolder.deviceError.setText(statistocsBean.getDeviceError());

    }

    @Override
    public int getItemCount() {
        return deviceStatistocsBeanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView devtypeName;
        private TextView deviceTotal;
        private TextView deviceOnLine;
        private TextView deviceOffLine;
        private TextView deviceError;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            devtypeName = itemView.findViewById(R.id.devtype_name);
            deviceTotal = itemView.findViewById(R.id.device_total_num);
            deviceOnLine = itemView.findViewById(R.id.device_online_num);
            deviceOffLine = itemView.findViewById(R.id.device_offline_num);
            deviceError = itemView.findViewById(R.id.device_error_num);
        }
    }
}
