package com.examoscararbo.examenpmdm.ui.frmanager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.examoscararbo.examenpmdm.fr.fragments.Aficion_1;
import com.examoscararbo.examenpmdm.fr.fragments.Aficion_2;
import com.examoscararbo.examenpmdm.fr.fragments.Aficion_3;

public class Paginador extends FragmentPagerAdapter {

    private final Context mContext;

    public Paginador(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Aficion_1();
            case 1:
                return new Aficion_2();
            case 2:
                return new Aficion_3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}