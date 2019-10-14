package com.wxxhxx.android.view.ViewBinder.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wxxhxx.android.R;
import com.wxxhxx.android.bean.home.DevStatusBean;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;

public class DevStatusViewBinder extends ItemViewBinder<DevStatusBean, DevStatusViewBinder.DevStatusHolder> {
    @NonNull
    @Override
    protected DevStatusHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.home_devstatus_item, parent, false);
        return new DevStatusHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull DevStatusHolder holder, @NonNull DevStatusBean item) {
        holder.tv_devtype.setText(item.getDevtype());
        holder.tv_total.setText(item.getTotal());
        holder.tv_online.setText(item.getOnLine());
        holder.tv_offline.setText(item.getOffLine());
        holder.tv_error.setText(item.getError());

    }

    public class DevStatusHolder extends RecyclerView.ViewHolder {
        private TextView tv_devtype;
        private TextView tv_total;
        private TextView tv_online;
        private TextView tv_offline;
        private TextView tv_error;

        public DevStatusHolder(@NonNull View itemView) {
            super(itemView);
            tv_devtype = itemView.findViewById(R.id.tv_detype);
            tv_total = itemView.findViewById(R.id.tv_total);
            tv_online = itemView.findViewById(R.id.tv_online);
            tv_offline = itemView.findViewById(R.id.tv_offline);
            tv_error = itemView.findViewById(R.id.tv_error);
        }
    }
}
