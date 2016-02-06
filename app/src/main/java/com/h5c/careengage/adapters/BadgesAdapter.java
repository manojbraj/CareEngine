package com.h5c.careengage.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 2/4/2016.
 */
public class BadgesAdapter extends RecyclerView.Adapter<BadgesAdapter.FineTuneSearchAdapter>{
    public BadgesAdapter(Context context) {

    }

    @Override
    public FineTuneSearchAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FineTuneSearchAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FineTuneSearchAdapter extends RecyclerView.ViewHolder implements View.OnClickListener{

        public FineTuneSearchAdapter(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
