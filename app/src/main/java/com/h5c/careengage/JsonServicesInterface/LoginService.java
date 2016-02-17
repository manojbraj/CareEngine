package com.h5c.careengage.JsonServicesInterface;

import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.h5c.careengage.constantValue.JsonConstants;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;

/**
 * Created by sastry on 2/16/2016.
 */

public interface LoginService {
    @POST(JsonConstants.LOGIN_URL)
    Call<String> LoginService(@Header("Content-Type: application/json")
    @Body String param2);
}
