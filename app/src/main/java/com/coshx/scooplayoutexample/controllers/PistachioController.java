package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;

import butterknife.OnClick;

/**
 * PistachioController
 * <p/>
 */
public class PistachioController extends BaseController {
    @Override
    protected int layoutId() {
        return R.layout.pistachio;
    }

    @OnClick(R.id.pistachio_fullscreen_trigger)
    public void onFullscreenTrigger() {

    }
}
