package com.h5c.careengage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sastry on 01/06/15.
 */
public class PrefManager {
    // Shared Preferences
    SharedPreferences pref;
    SharedPreferences prefArray;

    // Editor for Shared preferences
    Editor editor;
    Editor editorArray;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Shared pref file name
    public static final String PREF_NAME = "Ketch";
    private static final String PREF_ARRAY_NAME = "ResentSearch";
    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // Constructor
    public PrefManager(Context context, Boolean resentSearch) {
        if (resentSearch) {
            this._context = context;
            prefArray = _context.getSharedPreferences(PREF_ARRAY_NAME, PRIVATE_MODE);
            editorArray = prefArray.edit();
        } else {
            this._context = context;
            pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
            editor = pref.edit();
        }
    }
    public void deletePrefArray() {
        editorArray.clear();
        editorArray.commit();
    }
    public void saveArray(List<String> array, String arrayName) {

        editorArray.putInt(arrayName + "_size", array.size());
        for(int i=0;i<array.size();i++)
            editorArray.putString(arrayName + "_" + i, array.get(i));
        editorArray.commit();
    }

    public List<String> loadArray(String arrayName) {
        int size = prefArray.getInt(arrayName + "_size", 0);
        List<String> array = new ArrayList<String>();
        for(int i=0;i<size;i++)
            array.add(prefArray.getString(arrayName + "_" + i, null));
        return array;
    }

    /**
     * Create login session
     */
    public void createLoginSession(String user_name,String email_id, String mobile, String user_id, String cart_id,String personPhotoUrl) {
        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);

        // Storing email in pref
        /*editor.putString(JsonConstants.USER_NAME, user_name);
        editor.putString(JsonConstants.EMAIL, email_id);
        editor.putString(JsonConstants.MOBILE, mobile);
        editor.putString(JsonConstants.USER_ID, user_id);
        editor.putString(JsonConstants.CART_ID, cart_id);
        editor.putString(JsonConstants.PHOTOURL,personPhotoUrl);
        // commit changes
        editor.commit();*/
    }
    public void setNameInSession(String name){
        /*editor.putString(JsonConstants.USER_NAME, name);
        editor.commit();*/
    }
    public void setMobileInSession(String mobile){
        /*editor.putString(JsonConstants.MOBILE, mobile);
        editor.commit();*/
    }
    public void setCartIdInSession(String cart_id) {
        /*editor.putString(JsonConstants.CART_ID, cart_id);
        // commit changes
        editor.commit();*/
    }
    public void setGCMRegId(String regId) {
        /*editor.putString(JsonConstants.GCM_REGID, regId);
        // commit changes
        editor.commit();*/
    }

    public void setAddressIdInSession(String selectedAddressId) {
        /*editor.putString(JsonConstants.SELECTED_ADDRESS_ID, selectedAddressId);
        // commit changes
        editor.commit();*/
    }

    public void changeUserId() {
        /*editor.putString(JsonConstants.USER_ID, AllConstants.EMPTY);
        editor.commit();*/

    }

    /*public String getEmail() {
        return *//*pref.getString(JsonConstants.EMAIL, null)*//*;
    }

    public String getName() {
        return pref.getString(JsonConstants.USER_NAME, null);
    }

    public String getMobile() {
        return pref.getString(JsonConstants.MOBILE, null);
    }

    public String getUserId() {
        return pref.getString(JsonConstants.USER_ID, AllConstants.EMPTY);
    }
    public String getGCMRegId() { return pref.getString(JsonConstants.GCM_REGID,null);}

    public String getCartId() {return pref.getString(JsonConstants.CART_ID, AllConstants.EMPTY);
    }


    public String getPhotoUrl() {
        return pref.getString(JsonConstants.PHOTOURL, AllConstants.EMPTY);
    }

    public String getSelectedAddressId() {
        return pref.getString(JsonConstants.SELECTED_ADDRESS_ID, AllConstants.EMPTY);
    }*/

    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGIN, false);
    }

    public void logout() {
        editor.clear();
        editor.commit();
    }


}