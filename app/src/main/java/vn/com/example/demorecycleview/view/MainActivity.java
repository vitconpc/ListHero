package vn.com.example.demorecycleview.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import vn.com.example.demorecycleview.R;
import vn.com.example.demorecycleview.adapter.HerosAdapter;
import vn.com.example.demorecycleview.model.Hero;

public class MainActivity extends AppCompatActivity {

    private List<Hero> mHeros;
    private RecyclerView mRecyclerViewHero;
    private HerosAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        mHeros.add(new Hero(getString(R.string.iron), R.drawable.iron_main));
        mHeros.add(new Hero(getString(R.string.spider), R.drawable.spider_man));
        mHeros.add(new Hero(getString(R.string.thor), R.drawable.thor));
        mHeros.add(new Hero(getString(R.string.tphong), R.drawable.tieu_phong));
    }

    private void initView() {
        mHeros = new ArrayList<>();
        mAdapter = new HerosAdapter(MainActivity.this, mHeros);

        mRecyclerViewHero = findViewById(R.id.list_hero);
        mRecyclerViewHero.setHasFixedSize(true);
        mRecyclerViewHero.setAdapter(mAdapter);
    }
}
