package com.zws.android.view.ViewBinder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zws.android.R;
import com.zws.android.bean.home.Nav;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;

public class NavViewBinder extends ItemViewBinder<Nav,NavViewBinder.NavHolder> {
    @NonNull
    @Override
    protected NavHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.home_nav_item, parent, false);
        return new NavHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull NavHolder holder, @NonNull Nav item) {
        holder.iv_image.setImageResource(item.getImage());
        holder.tv_num.setText(item.getNum());
        holder.tv_name.setText(item.getName());
    }
    public class NavHolder extends RecyclerView.ViewHolder {
        private ImageView iv_image;
        private TextView tv_num;
        private TextView tv_name;
        public NavHolder(@NonNull View itemView) {
            super(itemView);
            iv_image = itemView.findViewById(R.id.home_nav_image);
            tv_num = itemView.findViewById(R.id.home_nav_num);
            tv_name = itemView.findViewById(R.id.home_nav_name);
        }
    }
}
