package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;
import com.coshx.scooplayoutexample.screens.IceCreamFullscreenScreen;

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
        router.goTo(new IceCreamFullscreenScreen(R.color.strawberry));
    }
}
