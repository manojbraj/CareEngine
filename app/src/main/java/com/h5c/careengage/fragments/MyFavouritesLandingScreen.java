package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h5c.careengage.R;
import com.h5c.careengage.activity.SupportActivity;
import com.h5c.careengage.constantValue.CommonConstants;
import com.h5c.careengage.servicesAndGeneralInterface.IntentAndFragmentService;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by sastry on 2/14/2016.
 */
public class MyFavouritesLandingScreen extends Fragment {
    private View view = null;
    @OnClick(R.id.click_fravout)
    protected void clickFravout(){
        CommonConstants.CHECK_FOR_LOGIN = true;
        IntentAndFragmentService.intentDisplay(getActivity(), SupportActivity.class, null);
    }
    public MyFavouritesLandingScreen() {
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
        view = inflater.inflate(R.layout.landing_screen_my_favourites, container, false);
        ButterKnife.inject(this, view);
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
