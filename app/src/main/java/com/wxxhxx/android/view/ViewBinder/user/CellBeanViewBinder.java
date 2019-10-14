package com.wxxhxx.android.view.ViewBinder.user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wxxhxx.android.R;
import com.wxxhxx.android.bean.user.CellBean;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;

public class CellBeanViewBinder extends ItemViewBinder<CellBean, CellBeanViewBinder.CellBeanHolder> {
    @NonNull
    @Override
    protected CellBeanHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.user_item_cell, parent, false);
        return new CellBeanHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull CellBeanHolder holder, @NonNull CellBean item) {
        holder.iv_icon.setImageResource(item.getIcon());
        holder.tv_text.setText(item.getText());
    }

    public class CellBeanHolder extends RecyclerView.ViewHolder {

        private ImageView iv_icon;
        private TextView tv_text;

        public CellBeanHolder(@NonNull View itemView) {
            super(itemView);
            iv_icon = itemView.findViewById(R.id.iv_icon);
            tv_text = itemView.findViewById(R.id.tv_text);

        }
    }
}
