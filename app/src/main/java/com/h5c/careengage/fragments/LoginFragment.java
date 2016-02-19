package com.h5c.careengage.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.h5c.careengage.R;
import com.h5c.careengage.jsonServicesInterface.LoginService;

import com.h5c.careengage.activity.SupportActivity;
import com.h5c.careengage.api.RestClient;
import com.h5c.careengage.designing.Calibri;
import com.h5c.careengage.designing.ColoredSnackbar;
import com.h5c.careengage.model.jsonRequestModel.LoginRequestModel;
import com.h5c.careengage.model.jsonResponceModel.LoginOutPut;
import com.h5c.careengage.servicesAndGeneralInterface.IntentAndFragmentService;
import com.h5c.careengage.utils.PrefManager;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.Optional;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by sastry on 2/14/2016.
 */
public class LoginFragment extends Fragment {
    private View view=null;
    PrefManager pref = null;
    private Gson gson= null;
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
if(userId != null&&!userId.getText().toString().isEmpty()&&password != null&&!password.getText().toString().isEmpty()){
    //TODO: PLEASE DO LOGIN AND FORGET PASSWORD JSON AND SEND ME - Login Done
    LoginRequestModel loginRequestModel = new LoginRequestModel();
    loginRequestModel.setUserName(userId.getText().toString());
    loginRequestModel.setPassword(password.getText().toString());

    RestClient.get().LoginService(loginRequestModel, new Callback<LoginOutPut>() {
        @Override
        public void success(LoginOutPut loginOutPut, Response response) {
            if(loginOutPut.getHttpHeaders().getH5cAuthToken() != null){
                Toast.makeText(getActivity(),"login success \n"+loginOutPut.getHttpHeaders().getH5cAuthToken(),Toast.LENGTH_LONG).show();
                pref.createLoginSession();
                IntentAndFragmentService.intentDisplay(getActivity(), SupportActivity.class,null);


            }else{
                Snackbar snackbar = Snackbar.make(getView(), "Something Went Wrong, Please try later...", Snackbar.LENGTH_LONG);
                snackbar.setActionTextColor(getResources().getColor(R.color.white));
                ColoredSnackbar.warning(snackbar).show();
            }
        }

        @Override
        public void failure(RetrofitError error) {
            Snackbar snackbar = Snackbar.make(getView(), "Something Went Wrong, Please try later...", Snackbar.LENGTH_LONG);
            snackbar.setActionTextColor(getResources().getColor(R.color.white));
            ColoredSnackbar.warning(snackbar).show();
        }
    });

}else if(userId != null&&!userId.getText().toString().isEmpty()&&password == null&&password.getText().toString().isEmpty()){
    Snackbar snackbar = Snackbar.make(getView(), "Please Enter A Valid Password...", Snackbar.LENGTH_LONG);
    snackbar.setActionTextColor(getResources().getColor(R.color.white));
    ColoredSnackbar.alert(snackbar).show();
}else if(userId == null&&userId.getText().toString().isEmpty()&&password != null&&!password.getText().toString().isEmpty()){
    Snackbar snackbar = Snackbar.make(getView(), "Please Enter A Valid User Name...", Snackbar.LENGTH_LONG);
    snackbar.setActionTextColor(getResources().getColor(R.color.white));
    ColoredSnackbar.alert(snackbar).show();
}else{
    Snackbar snackbar = Snackbar.make(getView(), "Please Enter The Details Above...", Snackbar.LENGTH_LONG);
    snackbar.setActionTextColor(getResources().getColor(R.color.white));
    ColoredSnackbar.alert(snackbar).show();
}
}
@Optional
@InjectView(R.id.forgotPasswordLayout)
    LinearLayout forgotPasswordLayout;
    @Optional
    @InjectView(R.id.signidlayout)
    LinearLayout signidlayout;

    @Optional
    @OnClick(R.id.submit_butten)
    protected void forgotSubmit(){
    //please put it after sucessfully changed
    if(signidlayout.getVisibility() == View.GONE){
        signidlayout.setVisibility(View.VISIBLE);
        forgotPasswordLayout.setVisibility(View.GONE);
    }

    }
    @Optional
    @InjectView(R.id.forgot_password)
    Calibri forgotPasswordText = null;
    @OnClick(R.id.forgot_password)
    protected void forgotPasswordText(){
        forgotPasswordText.setBackgroundResource(R.drawable.green_curve_button);
        if(forgotPasswordLayout.getVisibility() == View.GONE){
            forgotPasswordLayout.setVisibility(View.VISIBLE);
            signidlayout.setVisibility(View.GONE);
        }
    }

    @Optional
    @OnClick(R.id.register)
    protected void registerText(){
IntentAndFragmentService.fragmentdisplay(getActivity(), R.id.support_fragments, new RegistrationFragment(), null, false, false);

    }
    public LoginFragment() {
        // Required empty public constructor
    }
private LoginService loginService = null;

    // TODO: Rename and change types and number of parameters
   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gson = new Gson();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonConstants.BASE_URL)
                .addConverterFactory(LoganSquareConverterFactory.create())
                .build();
        loginService = retrofit.create(LoginService.class);

    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.sign_in, container, false);
        ButterKnife.inject(this, view);
        pref = new PrefManager(getActivity());
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
