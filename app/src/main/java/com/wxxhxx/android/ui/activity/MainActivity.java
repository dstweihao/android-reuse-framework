package com.wxxhxx.android.ui.activity;

import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wxxhxx.android.R;
import com.wxxhxx.android.adapter.FragmentBottonNavAdapter;
import com.wxxhxx.android.ui.fragment.DataFragment;
import com.wxxhxx.android.ui.fragment.DeviceFragment;
import com.wxxhxx.android.ui.fragment.HomeFragment;
import com.wxxhxx.android.ui.fragment.UserFragment;
import com.wxxhxx.android.ui.fragment.UserInfoFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;


public class MainActivity extends BaseActivity {

    @BindView(R.id.viewpaper)
    public ViewPager viewPager;

    @BindView(R.id.bottomNavigationView)
    public BottomNavigationView bottomNavigationView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDate() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new DeviceFragment());
        fragments.add(new DataFragment());
        fragments.add(new UserFragment());
        fragments.add(new UserInfoFragment());
        FragmentBottonNavAdapter fragmentBottonNavAdapter = new FragmentBottonNavAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(fragmentBottonNavAdapter);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_bottom_1:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.item_bottom_2:
                        viewPager.setCurrentItem(1);
                        return true;

                    case R.id.item_bottom_3:
                        viewPager.setCurrentItem(2);
                        return true;
                    case R.id.item_bottom_4:
                        viewPager.setCurrentItem(3);
                        return true;
                    default:
                        break;

                }
                return false;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            private MenuItem menuItem;

            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
//                如果是底部菜单fragment，支持底部实时切换。
                if (position < 4) {
                    if (menuItem != null) {
                        menuItem.setCheckable(false);
                    } else {
                        menuItem = bottomNavigationView.getMenu().getItem(position);
                        menuItem.setCheckable(true);
                    }
                    menuItem = bottomNavigationView.getMenu().getItem(position);
                    menuItem.setCheckable(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    @Override
    protected void initListener() {

    }
}
