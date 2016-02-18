package com.h5c.careengage.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.h5c.careengage.R;
import com.h5c.careengage.designing.Calibri;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by sastry on 2/17/2016.
 */
public class MyActivityPlusAdapterViewHolder extends RecyclerView.ViewHolder {
    @InjectView(R.id.itemName)
   public Calibri mTitle;
    @InjectView(R.id.itemImage)
    public ImageView mImage;


    public MyActivityPlusAdapterViewHolder(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
    }
}
