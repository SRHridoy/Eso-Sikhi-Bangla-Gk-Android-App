package com.elitcoder.esoJaniapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.eknojorbangladesh.EknojorExamFragment;
import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.eknojorbangladesh.EknojorInfoFragment;

public class ViewPagerEknojorBdAdapter extends FragmentStateAdapter {

    public ViewPagerEknojorBdAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerEknojorBdAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerEknojorBdAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return new EknojorInfoFragment();
        }else{
            return new EknojorExamFragment();
        }
    }

    @Override
    public int getItemCount() {
        //no of tabs:
        return 2;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "পড়ে নিই";
        } else {
            return "এক্সাম দেই";
        }
    }
}
