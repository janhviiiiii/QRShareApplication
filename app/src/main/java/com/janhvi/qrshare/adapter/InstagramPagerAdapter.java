package com.janhvi.qrshare.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.janhvi.qrshare.fragment.SecondSocialFragment;
import com.janhvi.qrshare.fragment.FirstSocialFragment;
import com.janhvi.qrshare.utility.Constants;

public class InstagramPagerAdapter extends FragmentStateAdapter {

    public InstagramPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0)
            return new FirstSocialFragment(Constants.INSTAGRAM);
        else
            return new SecondSocialFragment(Constants.INSTAGRAM);
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

