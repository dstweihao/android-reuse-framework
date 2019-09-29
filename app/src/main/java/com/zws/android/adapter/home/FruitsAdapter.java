package com.zws.android.adapter.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zws.android.R;
import com.zws.android.bean.home.Fruits;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.ViewHolder> {


    private List<Fruits> mFruits = new ArrayList<>();


    public FruitsAdapter(List<Fruits> fruits) {
        mFruits = fruits;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Fruits fruit = mFruits.get(i);
        viewHolder.imageView.setImageResource(fruit.getFruitsImage());
        viewHolder.textView.setText(fruit.getFruitsName());
    }

    @Override
    public int getItemCount() {
        return mFruits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.fruit_image);
            textView = itemView.findViewById(R.id.fruit_name);

        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
