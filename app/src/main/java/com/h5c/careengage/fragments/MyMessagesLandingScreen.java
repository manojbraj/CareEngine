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
public class MyMessagesLandingScreen extends Fragment{
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
    public MyMessagesLandingScreen() {
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
        image_one.setImageResource(R.drawable.ico_inbox);
        image_two.setImageResource(R.drawable.ico_invitefriend);
        image_three.setImageResource(R.drawable.ico_invitedoc);
        text_one.setText("Inbox");
        text_two.setText("Invite Friend");
        text_three.setText("Invite Doctor");
        text_title.setText("Manage health history like allergies, hospitalization, lab reports and More...");
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
