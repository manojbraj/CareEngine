package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h5c.careengage.R;
import com.h5c.careengage.adapters.MyActivityPlusAdapter;
import com.h5c.careengage.model.LandingScreenCoverFlowModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;

/**
 * Created by sastry on 2/18/2016.
 */
public class CyclingActivityFragment extends Fragment{
    private View view = null;
    @InjectView(R.id.select_activity_list)
    RecyclerView mRecyclerView = null;

    private List<LandingScreenCoverFlowModel> listItems = new ArrayList<>();
    private MyActivityPlusAdapter myActivityPlusAdapter = null;
    public CyclingActivityFragment() {
        // Required empty public constructor
        listItems.add(new LandingScreenCoverFlowModel(R.drawable.ic_ico_distancerun, R.string.distance));
        listItems.add(new LandingScreenCoverFlowModel(R.drawable.ic_run_icon_timerun, R.string.time));
        listItems.add(new LandingScreenCoverFlowModel(R.drawable.ic_ico_speedrun, R.string.speed));
    }


    // TODO: Rename and change types and number of parameters
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.select_activity_main, container, false);
        ButterKnife.inject(this, view);
        // Initialize recycler view
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myActivityPlusAdapter = new MyActivityPlusAdapter(getActivity(),listItems);
        mRecyclerView.setAdapter(myActivityPlusAdapter);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        /*if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // mListener = null;
    }
}
