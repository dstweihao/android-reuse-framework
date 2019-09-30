package com.zws.android.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.zws.android.R;

public class TitleViewHolder extends RecyclerView.ViewHolder {



    private final TextView textView;

    public TitleViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.cell_title);
    }
}
