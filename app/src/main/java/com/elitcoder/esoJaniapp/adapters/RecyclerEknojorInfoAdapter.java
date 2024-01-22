package com.elitcoder.esoJaniapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elitcoder.esoJaniapp.R;
import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.eknojorbangladesh.EknojorQuesAnsModel;

import java.util.ArrayList;

public class RecyclerEknojorInfoAdapter extends RecyclerView.Adapter<RecyclerEknojorInfoAdapter.ViewHolder> {
    Context context;

    public RecyclerEknojorInfoAdapter() {
    }

    public RecyclerEknojorInfoAdapter(Context context, ArrayList<EknojorQuesAnsModel> eknojorQuesAnsLists) {
        this.context = context;
        this.eknojorQuesAnsLists = eknojorQuesAnsLists;
    }

    ArrayList<EknojorQuesAnsModel>eknojorQuesAnsLists;
    @NonNull
    @Override
    public RecyclerEknojorInfoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.eknojor_info_recycler_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerEknojorInfoAdapter.ViewHolder holder, int position) {
        holder.quesTxt.setText(eknojorQuesAnsLists.get(position).getQues());
        holder.ansTxt.setText(eknojorQuesAnsLists.get(position).getAns());
    }

    @Override
    public int getItemCount() {
        return eknojorQuesAnsLists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView quesTxt,ansTxt;
        public ViewHolder(View view) {
            super(view);

            quesTxt = view.findViewById(R.id.quesText);
            ansTxt = view.findViewById(R.id.ansText);
        }
    }
}
