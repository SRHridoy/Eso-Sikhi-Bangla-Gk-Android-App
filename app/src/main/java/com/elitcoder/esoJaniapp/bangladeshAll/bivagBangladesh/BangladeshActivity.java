package com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.elitcoder.esoJaniapp.R;
import com.elitcoder.esoJaniapp.databinding.ActivityBangladeshBinding;
import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.eknojorbangladesh.EknojorBdActivity;
import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.jatioBangladesh.JatioBdActivity;
import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.otitBangladesh.OtitBdActivity;

import java.util.ArrayList;

public class BangladeshActivity extends AppCompatActivity {
    ActivityBangladeshBinding bangladeshBinding;
    ArrayList<String> bdTopicList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bangladeshBinding = ActivityBangladeshBinding.inflate(getLayoutInflater());
        View view = bangladeshBinding.getRoot();
        setContentView(view);

        //adding topics :
        addBdTopicList();

        //listview set :
        adapterSet();

        //On itemClickHandle :
        bangladeshTopicsClicked();

    }

    private void bangladeshTopicsClicked() {
        bangladeshBinding.bdListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent  intent = new Intent(BangladeshActivity.this, EknojorBdActivity.class);
                    startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(BangladeshActivity.this, JatioBdActivity.class);
                    startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(BangladeshActivity.this, OtitBdActivity.class);
                    startActivity(intent);
                }else if(position == 3){
                    Intent intent = new Intent(BangladeshActivity.this, BivagBdActivity.class);
                }
            }
        });
    }

    private void adapterSet() {
        ArrayAdapter<String> bdTopicAdapter = new ArrayAdapter<String>(
                BangladeshActivity.this,
                R.layout.bangladesh_list_view,
                R.id.bdTopicText,
                bdTopicList
        );
        bangladeshBinding.bdListView.setAdapter(bdTopicAdapter);
    }

    private void addBdTopicList() {
        bdTopicList.add("\nএক নজরে বাংলাদেশ\n");
        bdTopicList.add("\nবাংলাদেশের জাতীয় বিষয়াবলী\n");
        bdTopicList.add("\nঅতীত ইতিহাস\n");
        bdTopicList.add("\nবিভাগ ও জেলা\n");
    }
}