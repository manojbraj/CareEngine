package com.h5c.careengage.api;

import com.h5c.careengage.constantValue.JsonConstants;
import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by user on 2/17/2016.
 */
public class RestClient {
    //private static LoginService REST_CLIENT;
    private static String ROOT = JsonConstants.BASE_URL;

    /*static {
        setupRestClient();
    }*/

    public RestClient() {

    }

   /* public static LoginService get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {

        RestAdapter.Builder builder = new RestAdapter.Builder().setEndpoint(ROOT)
                .setClient(new OkClient(new OkHttpClient()))
                .setLogLevel(RestAdapter.LogLevel.FULL);
        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(LoginService.class);
    }*/
}
