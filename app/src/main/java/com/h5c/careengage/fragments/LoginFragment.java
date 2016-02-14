package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.h5c.careengage.R;
import com.h5c.careengage.designing.Calibri;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.Optional;

/**
 * Created by sastry on 2/14/2016.
 */
public class LoginFragment extends Fragment {
    private View view=null;
    @Optional
    @InjectView(R.id.user_ID)
    EditText userId = null;
    @Optional
    @InjectView(R.id.password)
    EditText password = null;
    @Optional
    @InjectView(R.id.login_id)
    EditText loginId = null;
    @Optional
    @OnClick(R.id.submit_signin_butten)
    protected void loginSubmit(){

    }
    @Optional
    @OnClick(R.id.submit_butten)
    protected void forgotSubmit(){

    }
    @Optional
    @InjectView(R.id.forgot_password)
    Calibri forgotPasswordText = null;
    @OnClick(R.id.forgot_password)
    protected void forgotPasswordText(){
        forgotPasswordText.setBackgroundResource(R.drawable.green_curve_button);
    }

    @Optional
    @OnClick(R.id.register)
    protected void registerText(){

    }
    public LoginFragment() {
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
        view = inflater.inflate(R.layout.sign_in, container, false);
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
