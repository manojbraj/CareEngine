package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.h5c.careengage.R;
import com.h5c.careengage.designing.Calibri;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by sastry on 2/14/2016.
 */
public class MyHealthDiaryLandingScreen extends Fragment {
    private View view = null;
    @InjectView(R.id.image_one)
    ImageView image_one = null;
    @InjectView(R.id.image_two)
    ImageView image_two = null;
    @InjectView(R.id.image_three)
    ImageView image_three = null;
    @InjectView(R.id.text_one)
    Calibri text_one = null;
    @InjectView(R.id.text_two)
    Calibri text_two = null;
    @InjectView(R.id.text_three)
    Calibri text_three = null;
    @InjectView(R.id.description_text)
    Calibri text_title = null;
    public MyHealthDiaryLandingScreen() {
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
        view = inflater.inflate(R.layout.landin_screen_commonview, container, false);
        ButterKnife.inject(this, view);
        image_one.setImageResource(R.drawable.ico_glucose_new);
        image_two.setImageResource(R.drawable.ico_bloodpressure);
        image_three.setImageResource(R.drawable.ico_cholesterol);
        text_one.setText("Glucose");
        text_two.setText("Blood Pressure");
        text_three.setText("Cholestrol");
        text_title.setText("Manage your glucose, blood pressure, cholesterol and more...");
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
