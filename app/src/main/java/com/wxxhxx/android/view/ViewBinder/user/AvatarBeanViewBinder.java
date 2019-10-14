package com.wxxhxx.android.view.ViewBinder.user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.wxxhxx.android.R;
import com.wxxhxx.android.bean.user.AvatarBean;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import me.drakeet.multitype.ItemViewBinder;


public class AvatarBeanViewBinder extends ItemViewBinder<AvatarBean, AvatarBeanViewBinder.AvatarBeanHolder> {

    private Context context;


    @NonNull
    @Override
    protected AvatarBeanViewBinder.AvatarBeanHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.user_item_avatar, parent, false);
        return new AvatarBeanHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull AvatarBeanViewBinder.AvatarBeanHolder holder, @NonNull AvatarBean item) {

        Glide.with(context).load(item.getAvatar()).placeholder(R.mipmap.default_head_icon).into(holder.iv_avatar);
        holder.tv_nickname.setText(item.getNickname());
        holder.tv_username.setText(item.getUsername());
    }

    public class AvatarBeanHolder extends RecyclerView.ViewHolder {

        public ConstraintLayout cl_avatar;
        public ImageView iv_avatar;
        public TextView tv_nickname;
        public TextView tv_username;

        public AvatarBeanHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            cl_avatar = itemView.findViewById(R.id.cl_avatar);
            iv_avatar = itemView.findViewById(R.id.iv_avatar);
            tv_nickname = itemView.findViewById(R.id.tv_nickname);
            tv_username = itemView.findViewById(R.id.tv_username);

            cl_avatar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "跳转至个人信息", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
