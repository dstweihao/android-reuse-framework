package com.wxxhxx.android.bean.user;

public class AvatarBean {
    private String avatar;
    private String nickname;
    private String username;

    public AvatarBean(String avatar, String nickname, String username) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.username = username;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


