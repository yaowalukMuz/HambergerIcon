package com.hitachi_tstv.yodpanom.yaowaluk.hambergericon.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hitachi_tstv.yodpanom.yaowaluk.hambergericon.R;

/**
 * Created by Yaowaluk on 29/08/2560.
 */

public class secondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        return view;
    }
}
