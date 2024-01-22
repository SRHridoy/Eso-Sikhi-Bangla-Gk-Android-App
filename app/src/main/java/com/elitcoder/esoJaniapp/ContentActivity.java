package com.elitcoder.esoJaniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.elitcoder.esoJaniapp.bangladeshAll.bivagBangladesh.BangladeshActivity;
import com.elitcoder.esoJaniapp.databinding.ActivityContentBinding;

public class ContentActivity extends AppCompatActivity {
    ActivityContentBinding contentBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contentBinding = ActivityContentBinding.inflate(getLayoutInflater());
        View view = contentBinding.getRoot();
        setContentView(view);

        bangladeshActivityStart();
        internationalActivityStart();
        scienceActivityStart();
        quranActivityStart();
    }

    private void quranActivityStart() {
        contentBinding.btnQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentActivity.this, QuranActivity.class);
                startActivity(intent);
            }
        });
    }

    private void scienceActivityStart() {
        contentBinding.btnScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentActivity.this, ScienceActivity.class);
                startActivity(intent);
            }
        });
    }

    private void internationalActivityStart() {
        contentBinding.btnInternational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentActivity.this, InternationalActivity.class);
                startActivity(intent);
            }
        });
    }

    private void bangladeshActivityStart() {
        contentBinding.btnBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentActivity.this, BangladeshActivity.class);
                startActivity(intent);
            }
        });
    }
}