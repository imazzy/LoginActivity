package com.example.loginactivity;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title=null;
//        if(position==0)
//        {
//            title="User";
//        }
//        if(position==1)
//        {
//            title="Worker";
//        }
//        return title;
//    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment=new LoginTabFragment();
                return loginTabFragment;
            case 1:
                LoginTabFragment1 loginTabFragment1=new LoginTabFragment1();
                return loginTabFragment1;
            default:
                return new LoginTabFragment();
        }
    }

}
