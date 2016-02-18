package com.h5c.careengage.adapters;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h5c.careengage.R;
import com.h5c.careengage.model.LandingScreenCoverFlowModel;
import com.h5c.careengage.viewHolders.MyActivityPlusAdapterViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sastry on 2/17/2016.
 */
public class MyActivityPlusAdapter extends RecyclerView.Adapter<MyActivityPlusAdapterViewHolder>  {
    private List<LandingScreenCoverFlowModel> listItems = null;
    public MyActivityPlusAdapter(Context context, List<LandingScreenCoverFlowModel> listItems) {
        if(this.listItems==null){
            this.listItems = new ArrayList<LandingScreenCoverFlowModel>();
        }
        this.listItems = listItems;
    }

    @Override
    public MyActivityPlusAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyActivityPlusAdapterViewHolder viewHolder = new MyActivityPlusAdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.select_activity_list_design, null));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyActivityPlusAdapterViewHolder holder, int position) {
        holder.mTitle.setText(listItems.get(position).titleResId);
        holder.mImage.setImageResource(listItems.get(position).imageResId);
    }

    @Override
    public int getItemCount() {
        return (null != listItems ? listItems.size() : 0);
    }


}
