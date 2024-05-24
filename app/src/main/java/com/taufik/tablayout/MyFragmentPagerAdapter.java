package com.taufik.tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private FinanceFragment _financeFragment = new FinanceFragment();
    private Context _context;
    private KampusFragment _kampusFragment = new KampusFragment();
    private int _tabcount;
    private EcommerceFragment _ecommerceFragment =new EcommerceFragment();

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager,int tabcount)
    {
        super(fragmentManager);

        _context = context;
        _tabcount = tabcount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return _ecommerceFragment;
            case 1 :
                return _financeFragment;
            default:
                return _kampusFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabcount;
    }
}
