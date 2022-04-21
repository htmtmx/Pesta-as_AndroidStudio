package com.example.pestanias;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        BlueFragment blueFragment = new BlueFragment();
        position = position+1;
        Bundle bundle = new Bundle();
        bundle.putString("message", "Fragment : "+position);
        blueFragment.setArguments(bundle);
        return blueFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Chat";
            case 1:
                return "Maps";
            case 2:
                return "Settings";
            default:
                return null;
        }
    }
}
