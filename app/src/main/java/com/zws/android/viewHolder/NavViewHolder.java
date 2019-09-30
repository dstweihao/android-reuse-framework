package com.zws.android.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zws.android.R;

public class NavViewHolder extends RecyclerView.ViewHolder {


    public final RecyclerView recyclerView;

    public NavViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.fruit_image_recyclerview);

    }
}
