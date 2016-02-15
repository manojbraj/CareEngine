package com.h5c.careengage.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.h5c.careengage.R;
import com.h5c.careengage.adapters.CoverFlowAdapter;
import com.h5c.careengage.adapters.SlidingPagesAdapter;
import com.h5c.careengage.designing.coverflowlib.containers.FeatureCoverFlow;
import com.h5c.careengage.model.LandingScreenCoverFlowModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class LandingScreenActivity extends FragmentActivity implements FeatureCoverFlow.OnScrollPositionListener, ViewPager.OnPageChangeListener {
    @InjectView(R.id.coverflow)
    FeatureCoverFlow mCoverFlow;
    @InjectView(R.id.title)
    TextSwitcher mTitle;
    @InjectView(R.id.mviewpager)
    ViewPager mPager;
    private CoverFlowAdapter mAdapter;
    private FragmentStatePagerAdapter mPagerAdapter;
    private List<LandingScreenCoverFlowModel> mData = new ArrayList<>(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_screen);
        ButterKnife.inject(this);
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_one, R.string.dashboard));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_two, R.string.My_Activity_Plus));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_three, R.string.my_health_wallet));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_four, R.string.my_wellness));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_five, R.string.my_health_diary));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_six, R.string.my_health_history));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_seven, R.string.my_family_diary));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_eight, R.string.my_messages));
        mData.add(new LandingScreenCoverFlowModel(R.drawable.image_nine, R.string.my_favourites));

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
        mAdapter = new CoverFlowAdapter(this);
        mAdapter.setData(mData);
        mCoverFlow.setAdapter(mAdapter);
       mCoverFlow.setSelection(0);
        mCoverFlow.setSelected(true);


        mCoverFlow.setOnScrollPositionListener(this);

        mPagerAdapter = new SlidingPagesAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setCurrentItem(0);
        mPager.setOnPageChangeListener(this);
    }


    @Override
    public void onScrolledToPosition(int position) {
        mTitle.setText(getResources().getString(mData.get(position).titleResId));
        mPager.setCurrentItem(position);
    }

    @Override
    public void onScrolling() {
        mTitle.setText("");
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        /*mCoverFlow.setSelected(true);
       // mCoverFlow.setSelection(0);
        mCoverFlow.setSeletedItemPosition(position);*//*
        mCoverFlow.getItemAtPosition(position);*/
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}