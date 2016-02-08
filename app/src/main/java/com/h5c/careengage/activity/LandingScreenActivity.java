package com.h5c.careengage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.h5c.careengage.R;
import com.h5c.careengage.adapters.CoverFlowAdapter;
import com.h5c.careengage.designing.coverflowlib.containers.FeatureCoverFlow;
import com.h5c.careengage.entitycoverflow.GameEntity;


import java.util.ArrayList;

public class LandingScreenActivity extends AppCompatActivity {

    private FeatureCoverFlow mCoverFlow;
    private CoverFlowAdapter mAdapter;
    private ArrayList<GameEntity> mData = new ArrayList<>(0);
    private TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_screen);

        mData.add(new GameEntity(R.drawable.image_one, R.string.dashboard));
        mData.add(new GameEntity(R.drawable.image_two, R.string.My_Activity_Plus));
        mData.add(new GameEntity(R.drawable.image_three, R.string.my_health_wallet));
        mData.add(new GameEntity(R.drawable.image_four, R.string.my_wellness));
        mData.add(new GameEntity(R.drawable.image_five, R.string.my_health_diary));
        mData.add(new GameEntity(R.drawable.image_six, R.string.my_health_history));
        mData.add(new GameEntity(R.drawable.image_seven, R.string.my_family_diary));
        mData.add(new GameEntity(R.drawable.image_eight, R.string.my_messages));
        mData.add(new GameEntity(R.drawable.image_nine, R.string.my_favourites));

        mTitle = (TextSwitcher) findViewById(R.id.title);

        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(LandingScreenActivity.this);
                TextView textView = (TextView) inflater.inflate(R.layout.item_title, null);
                return textView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this, R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
        mTitle.setInAnimation(in);
        mTitle.setOutAnimation(out);
//
        mAdapter = new CoverFlowAdapter(this);
        mAdapter.setData(mData);
        mCoverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);
        mCoverFlow.setAdapter(mAdapter);

        mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LandingScreenActivity.this,
                        getResources().getString(mData.get(position).titleResId),
                        Toast.LENGTH_SHORT).show();
            }
        });

        mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(getResources().getString(mData.get(position).titleResId));
            }

            @Override
            public void onScrolling() {
                mTitle.setText("");
            }
        });
    }

}