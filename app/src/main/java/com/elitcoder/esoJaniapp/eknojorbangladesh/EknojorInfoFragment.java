package com.elitcoder.esoJaniapp.eknojorbangladesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elitcoder.esoJaniapp.R;


public class EknojorInfoFragment extends Fragment {


    public EknojorInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eknojor_info, container, false);
    }
}