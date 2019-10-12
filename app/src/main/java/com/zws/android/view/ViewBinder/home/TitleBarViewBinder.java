package com.zws.android.view.ViewBinder.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zws.android.R;
import com.zws.android.bean.home.TitleBarBean;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;

public class TitleBarViewBinder extends ItemViewBinder<TitleBarBean,TitleBarViewBinder.TitleBarHolder> {
    @NonNull
    @Override
    protected TitleBarHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.title_bar, parent, false);
        return new TitleBarHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull TitleBarHolder holder, @NonNull TitleBarBean item) {
        holder.tv_title_bar.setText(item.getTitleBarName());
    }
    public class TitleBarHolder extends RecyclerView.ViewHolder {
        private TextView tv_title_bar;
        public TitleBarHolder(@NonNull View itemView) {
            super(itemView);
            tv_title_bar = itemView.findViewById(R.id.title_bar);
        }
    }
}
