package com.hitachi_tstv.yodpanom.yaowaluk.hambergericon.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hitachi_tstv.yodpanom.yaowaluk.hambergericon.R;

/**
 * Created by Yaowaluk on 28/08/2560.
 */

public class MainFragment extends android.support.v4.app.Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return  view;
    }


}//main class
