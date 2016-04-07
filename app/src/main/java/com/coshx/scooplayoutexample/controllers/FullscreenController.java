package com.coshx.scooplayoutexample.controllers;

import android.view.View;

import com.coshx.scooplayoutexample.R;
import com.coshx.scooplayoutexample.screens.fullscreen.HideFullscreenScreen;
import com.coshx.scooplayoutexample.screens.fullscreen.InitFullscreenScreen;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ViewController;

/**
 * FullscreenController
 * <p/>
 */
public class FullscreenController extends ViewController {
    @Override
    protected int layoutId() {
        return R.layout.fullscreen;
    }

    @Override
    public void onAttach() {
        super.onAttach();

        Screen screen = Screen.fromController(this);

        if (screen instanceof HideFullscreenScreen) {
            getView().setVisibility(View.GONE);
        } else if (screen instanceof InitFullscreenScreen) {
            getView().setVisibility(View.VISIBLE);
        }
    }
}
