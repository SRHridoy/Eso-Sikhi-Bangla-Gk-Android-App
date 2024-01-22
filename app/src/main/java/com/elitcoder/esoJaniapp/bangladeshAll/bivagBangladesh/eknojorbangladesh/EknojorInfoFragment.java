package com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.eknojorbangladesh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elitcoder.esoJaniapp.adapters.RecyclerEknojorInfoAdapter;
import com.elitcoder.esoJaniapp.databinding.FragmentEknojorInfoBinding;


public class EknojorInfoFragment extends Fragment {
    FragmentEknojorInfoBinding eknojorInfoBindings;
    public EknojorInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        eknojorInfoBindings = FragmentEknojorInfoBinding.inflate(inflater, container, false);
        View view = eknojorInfoBindings.getRoot();

        //Recycler Setup:
        eknojorInfoBindings.recyclerEknojorBd.setLayoutManager(new LinearLayoutManager(getActivity()));
        EknojorQuesAnsLists.quesAnsLists();
        RecyclerEknojorInfoAdapter recyclerEknojorInfoAdapter = new RecyclerEknojorInfoAdapter(getActivity(),EknojorQuesAnsLists.eknojorInfoLists);
        eknojorInfoBindings.recyclerEknojorBd.setAdapter(recyclerEknojorInfoAdapter);
        return view;
    }
}