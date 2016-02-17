package com.h5c.careengage.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.h5c.careengage.R;

import butterknife.ButterKnife;


public class DashBordLandingScreenFragment extends Fragment {
  private View view = null;
    private Fragment page = null;
    public DashBordLandingScreenFragment() {
        // Required empty public constructor
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
        view = inflater.inflate(R.layout.landing_screen_dashboard_vf, container, false);
        ButterKnife.inject(this, view);
        /*for now i am using direct reference change it to butter knife later*/
        LinearLayout DashBourd = (LinearLayout) view.findViewById(R.id.my_dashboard);
        DashBourd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page = new LoginFragment();
            }
        });
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
