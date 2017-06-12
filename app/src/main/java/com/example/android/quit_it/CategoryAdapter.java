package com.example.android.quit_it;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Pulkit on 06-06-2017.
 */


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new NewEntryFragment();
        }
        else  {
            return new AllEntryFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0) {
            return mContext.getString(R.string.category_new_entry);
        }

        else  {
            return mContext.getString(R.string.category_old_entry);
        }
    }
}
