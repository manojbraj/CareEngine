package com.h5c.careengage.model.JsonRequestModel;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by sastry on 2/16/2016.
 */
public class LoginRequestModel implements Serializable {

    /** The serialVersionUID of type long. */
    private static final long serialVersionUID = 2167197224675309885L;

    @Expose
    private String userName;

    @Expose
    private String password;

    /**
     * @return the userName
     */
    public String getUserName() {
        return null!=userName?userName.toLowerCase():userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
