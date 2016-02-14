package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.h5c.careengage.R;
import com.h5c.careengage.activity.SupportActivity;
import com.h5c.careengage.constantValue.CommonConstants;
import com.h5c.careengage.designing.Calibri;
import com.h5c.careengage.servicesAndGeneralInterface.IntentAndFragmentService;

import org.w3c.dom.Text;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by sastry on 2/14/2016.
 */
public class MyActivityPlusLandingScreen extends Fragment {
    private View view = null;
    @InjectView(R.id.image_one)
    ImageView image_one = null;
    @OnClick(R.id.image_one)
    protected void walk(){
        CommonConstants.LANDING_NAVAGATION_STRING = CommonConstants.WALK;
        IntentAndFragmentService.intentDisplay(getActivity(), SupportActivity.class,null);
    }
    @InjectView(R.id.image_two)
    ImageView image_two = null;
    @OnClick(R.id.image_two)
    protected void run(){
        CommonConstants.LANDING_NAVAGATION_STRING = CommonConstants.RUN;
        IntentAndFragmentService.intentDisplay(getActivity(), SupportActivity.class,null);
    }
    @InjectView(R.id.image_three)
    ImageView image_three = null;
    @OnClick(R.id.image_three)
    protected void cycle(){
        CommonConstants.LANDING_NAVAGATION_STRING = CommonConstants.CYCLING;
        IntentAndFragmentService.intentDisplay(getActivity(), SupportActivity.class,null);
    }
    @InjectView(R.id.text_one)
    Calibri text_one = null;
    @InjectView(R.id.text_two)
    Calibri text_two = null;
    @InjectView(R.id.text_three)
    Calibri text_three = null;
    @InjectView(R.id.description_text)
    Calibri text_title = null;
    public MyActivityPlusLandingScreen() {
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
        image_one.setImageResource(R.drawable.ico_walking);
        image_two.setImageResource(R.drawable.ico_runing);
        image_three.setImageResource(R.drawable.ico_cycling);
        text_one.setText("Walk");
        text_two.setText("Run");
        text_three.setText("Cycle");
        text_title.setText("Capture and Manage Running, Jogging and More...");
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
