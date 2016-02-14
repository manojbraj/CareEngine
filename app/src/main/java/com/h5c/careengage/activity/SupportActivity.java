package com.h5c.careengage.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.h5c.careengage.R;
import com.h5c.careengage.constantValue.CommonConstants;
import com.h5c.careengage.fragments.WalkActivityFragment;
import com.h5c.careengage.servicesAndGeneralInterface.IntentAndFragmentService;

public class SupportActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        if (CommonConstants.CHECK_FOR_LOGIN) {

        } else {
            withOutLogin();
        }
    }

    private void withLogin() {
        switch (CommonConstants.LANDING_NAVAGATION_STRING) {
            case CommonConstants.WALK: {
            }
            break;
            case CommonConstants.RUN: {
            }
            break;
            case CommonConstants.CYCLING: {
            }
            break;
        }
    }

    private void withOutLogin() {
        switch (CommonConstants.LANDING_NAVAGATION_STRING) {
            case CommonConstants.WALK: {
                IntentAndFragmentService.fragmentdisplay(this,R.id.support_fragments,new WalkActivityFragment(),null,false,false);
            } break;
            case CommonConstants.RUN: {
                IntentAndFragmentService.fragmentdisplay(this,R.id.support_fragments,new WalkActivityFragment(),null,false,false);
            }
            break;
            case CommonConstants.CYCLING: {
                IntentAndFragmentService.fragmentdisplay(this,R.id.support_fragments,new WalkActivityFragment(),null,false,false);
            }
            break;
        }
    }
}
