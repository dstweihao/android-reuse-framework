package com.zws.android.view.ViewBinder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zws.android.R;
import com.zws.android.bean.home.Nav;
import com.zws.android.bean.home.NavList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;
import me.drakeet.multitype.MultiTypeAdapter;

public class NavListViewBinder extends ItemViewBinder<NavList, NavListViewBinder.NavListHolder> {
    private MultiTypeAdapter adapter;

    @NonNull
    @Override
    protected NavListHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_recyclerview, parent, false);
        return new NavListHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull NavListHolder holder, @NonNull NavList item) {
        adapter.setItems(item.getNavList());
        adapter.notifyDataSetChanged();
        holder.recyclerView.setAdapter(adapter);
    }

    public class NavListHolder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;

        public NavListHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.item_recyclerview);
            GridLayoutManager manager = new GridLayoutManager(itemView.getContext(), 4);
            recyclerView.setLayoutManager(manager);
            adapter = new MultiTypeAdapter();
            adapter.register(Nav.class, new NavViewBinder());

        }
    }


}
