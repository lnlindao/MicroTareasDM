package com.example.dptoredes.tallerfragmento;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dptoredes on 22/06/17.
 */

public class fragmento2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment2, container);
        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
