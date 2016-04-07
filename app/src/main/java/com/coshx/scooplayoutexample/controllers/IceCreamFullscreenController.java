package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;
import com.coshx.scooplayoutexample.screens.IceCreamFullscreenScreen;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ViewController;

/**
 * IceCreamFullscreenController
 * <p/>
 */
public class IceCreamFullscreenController extends ViewController {
    @Override
    protected int layoutId() {
        return R.layout.ice_cream_fullscreen;
    }

    @Override
    public void onAttach() {
        super.onAttach();

        Screen screen = Screen.fromController(this);

        if (screen instanceof IceCreamFullscreenScreen) {
            getView().setBackgroundResource(((IceCreamFullscreenScreen) screen).colorId);
        }
    }
}
