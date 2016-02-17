package com.h5c.careengage.model.JsonRequestModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Manoj on 2/17/2016.
 */
public class LoginOutPut {
    @SerializedName("httpHeaders")
    @Expose
    private LoginHttpHeaders httpHeaders;
    @SerializedName("metadata")
    @Expose
    private Object metadata;
    @SerializedName("results")
    @Expose
    private Object results;
    @SerializedName("singleResult")
    @Expose
    private Boolean singleResult;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("count")
    @Expose
    private Object count;

    /**
     *
     * @return
     * The httpHeaders
     */
    public LoginHttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    /**
     *
     * @param httpHeaders
     * The httpHeaders
     */
    public void setHttpHeaders(LoginHttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    /**
     *
     * @return
     * The metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    /**
     *
     * @param metadata
     * The metadata
     */
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     *
     * @return
     * The results
     */
    public Object getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(Object results) {
        this.results = results;
    }

    /**
     *
     * @return
     * The singleResult
     */
    public Boolean getSingleResult() {
        return singleResult;
    }

    /**
     *
     * @param singleResult
     * The singleResult
     */
    public void setSingleResult(Boolean singleResult) {
        this.singleResult = singleResult;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The count
     */
    public Object getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Object count) {
        this.count = count;
    }
}