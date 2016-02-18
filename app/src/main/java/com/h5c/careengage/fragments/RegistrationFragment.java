package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import com.h5c.careengage.R;
import com.h5c.careengage.designing.Calibri;
import com.h5c.careengage.servicesAndGeneralInterface.IntentAndFragmentService;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by sastry on 2/15/2016.
 */
public class RegistrationFragment extends Fragment {
    private View view = null;
    @InjectView(R.id.login_id)
    EditText loginId = null;
    @InjectView(R.id.password)
    EditText password = null;
    @InjectView(R.id.confirm_password)
    EditText confirmPassword = null;
    @InjectView(R.id.email_id)
    EditText emailId = null;
    @InjectView(R.id.date_of_birth)
    Calibri dateOfBirth = null;
    @InjectView(R.id.first_name)
    EditText firstName = null;
    @InjectView(R.id.last_name)
    EditText lastName = null;
    @InjectView(R.id.mobile_number)
    EditText mobileNumber = null;
    @InjectView(R.id.sex_type)
    Spinner sexType = null;

    @OnClick(R.id.submit)
    protected void submit() {

    }

    @OnClick(R.id.login)
    protected void login() {
        IntentAndFragmentService.fragmentdisplay(getActivity(), R.id.support_fragments, new LoginFragment(), null, false, false);
    }

    public RegistrationFragment() {
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
        view = inflater.inflate(R.layout.quick_sign_up, container, false);
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
