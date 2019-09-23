package com.zws.android.ui;

import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.zws.android.R;
import com.zws.android.ui.activity.BaseActivity;
import com.zws.android.ui.activity.MainActivity;

import butterknife.BindView;

public class SplashActivity extends BaseActivity {


    @BindView(R.id.iv_splash)
    ImageView mIvSplash;

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        ImageView imageView =(ImageView) findViewById(R.id.iv_splash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                //动画开始时执行
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //动画结束时执行
                //跳转时，true表示执行finish()方法
                startActivity(MainActivity.class, true);
                //跳转时显示的动画效果，渐进渐出
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                //动画重复执行时回调
            }
        });
        Log.d("mIvSplash", String.valueOf(mIvSplash));
        //执行动画
//        imageView.startAnimation(animation);
        mIvSplash.startAnimation(animation);
    }

    @Override
    protected void initDate() {

    }

}

