package com.h5c.careengage.model.JsonRequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Manoj on 2/17/2016.
 */
public class LoginHttpHeaders {
    @SerializedName("chngPswd")
    @Expose
    private String chngPswd;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("memberId")
    @Expose
    private String memberId;
    @SerializedName("profUpdate")
    @Expose
    private String profUpdate;
    @SerializedName("h5cAuthToken")
    @Expose
    private String h5cAuthToken;

    /**
     *
     * @return
     * The chngPswd
     */
    public String getChngPswd() {
        return chngPswd;
    }

    /**
     *
     * @param chngPswd
     * The chngPswd
     */
    public void setChngPswd(String chngPswd) {
        this.chngPswd = chngPswd;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     *
     * @param memberId
     * The memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     *
     * @return
     * The profUpdate
     */
    public String getProfUpdate() {
        return profUpdate;
    }

    /**
     *
     * @param profUpdate
     * The profUpdate
     */
    public void setProfUpdate(String profUpdate) {
        this.profUpdate = profUpdate;
    }

    /**
     *
     * @return
     * The h5cAuthToken
     */
    public String getH5cAuthToken() {
        return h5cAuthToken;
    }

    /**
     *
     * @param h5cAuthToken
     * The h5cAuthToken
     */
    public void setH5cAuthToken(String h5cAuthToken) {
        this.h5cAuthToken = h5cAuthToken;
    }
}