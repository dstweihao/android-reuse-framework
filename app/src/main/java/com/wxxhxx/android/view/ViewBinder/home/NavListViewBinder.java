package com.wxxhxx.android.view.ViewBinder.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wxxhxx.android.R;
import com.wxxhxx.android.bean.home.NavBean;
import com.wxxhxx.android.bean.home.NavListBean;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;
import me.drakeet.multitype.MultiTypeAdapter;

public class NavListViewBinder extends ItemViewBinder<NavListBean, NavListViewBinder.NavListHolder> {
    private MultiTypeAdapter adapter;

    @NonNull
    @Override
    protected NavListHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.item_recyclerview, parent, false);
        return new NavListHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull NavListHolder holder, @NonNull NavListBean item) {
        adapter.setItems(item.getNavBeanList());
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
            adapter.register(NavBean.class, new NavViewBinder());

        }
    }


}
