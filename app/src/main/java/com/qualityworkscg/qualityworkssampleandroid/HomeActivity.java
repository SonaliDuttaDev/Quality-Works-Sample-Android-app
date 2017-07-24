package com.qualityworkscg.qualityworkssampleandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView sectionsRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sectionsRecyclerView = (RecyclerView) findViewById(R.id.sections_recyclerview);

        sectionsRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        sectionsRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new SectionAdapter(new String[]{});
        sectionsRecyclerView.setAdapter(mAdapter);
    }
}
