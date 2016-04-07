package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;

import butterknife.OnClick;

/**
 * StrawberryController
 * <p/>
 */
public class StrawberryController extends BaseController {
    @Override
    protected int layoutId() {
        return R.layout.strawberry;
    }

    @OnClick(R.id.strawberry_fullscreen_trigger)
    public void onFullscreenTrigger() {

    }
}
