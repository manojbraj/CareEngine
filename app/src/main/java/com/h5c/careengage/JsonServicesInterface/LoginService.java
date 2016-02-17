package com.h5c.careengage.JsonServicesInterface;

import com.h5c.careengage.constantValue.JsonConstants;
import com.h5c.careengage.model.JsonRequestModel.LoginOutPut;
import com.h5c.careengage.model.JsonRequestModel.LoginRequestModel;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;

/**
 * Created by sastry on 2/16/2016.
 */

public interface LoginService {

    @POST(JsonConstants.LOGIN_URL)
    @Headers({"Content-Type: application/json"})
    void LoginService(@Body LoginRequestModel loginRequestModel, Callback<LoginOutPut> loginOutPutCallback);

}