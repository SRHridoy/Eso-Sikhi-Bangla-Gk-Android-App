package com.elitcoder.esoJaniapp.eknojorbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.elitcoder.esoJaniapp.adapters.ViewPagerEknojorBdAdapter;
import com.elitcoder.esoJaniapp.databinding.ActivityEknojorBdBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class EknojorBdActivity extends AppCompatActivity {
    ActivityEknojorBdBinding eknojorBdBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eknojorBdBinding = ActivityEknojorBdBinding.inflate(getLayoutInflater());
        View view = eknojorBdBinding.getRoot();
        setContentView(view);

        ViewPagerEknojorBdAdapter adapter = new ViewPagerEknojorBdAdapter(this);
        eknojorBdBinding.viewPagerEknojorBd.setAdapter(adapter);

        new TabLayoutMediator(eknojorBdBinding.tabEknojorBd, eknojorBdBinding.viewPagerEknojorBd,
                (tab, position) -> tab.setText(adapter.getPageTitle(position))).attach();

    }
}