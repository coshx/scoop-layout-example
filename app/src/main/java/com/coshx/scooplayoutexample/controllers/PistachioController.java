package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;
import com.coshx.scooplayoutexample.screens.IceCreamFullscreenScreen;

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
        router.goTo(new IceCreamFullscreenScreen(R.color.pistachio));
    }
}
