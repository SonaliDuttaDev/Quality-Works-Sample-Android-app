package com.qualityworkscg.qualityworkssampleandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView sectionsRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] sections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sectionsRecyclerView = (RecyclerView) findViewById(R.id.sections_recyclerview);

        sectionsRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        sectionsRecyclerView.setLayoutManager(mLayoutManager);

        sections = new String[]{"Click Counter"};

        mAdapter = new SectionAdapter(sections);
        sectionsRecyclerView.setAdapter(mAdapter);

        sectionsRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Log.i("Row Clicked:"+position, sections[position]);
                Intent intent = new Intent(HomeActivity.this, ClickCounterActivity.class);
                startActivity(intent);
            }
        }));
    }
}
