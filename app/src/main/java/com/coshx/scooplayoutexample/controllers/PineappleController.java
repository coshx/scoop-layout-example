package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;
import com.coshx.scooplayoutexample.screens.IceCreamFullscreenScreen;

import butterknife.OnClick;

/**
 * PineappleController
 * <p/>
 */
public class PineappleController extends BaseController {
    @Override
    protected int layoutId() {
        return R.layout.pineapple;
    }

    @OnClick(R.id.pineapple_fullscreen_trigger)
    public void onFullscreenTrigger() {
        router.goTo(new IceCreamFullscreenScreen(R.color.pineapple));
    }
}
