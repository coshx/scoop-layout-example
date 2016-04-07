package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;
import com.coshx.scooplayoutexample.screens.PineappleScreen;
import com.coshx.scooplayoutexample.screens.PistachioScreen;
import com.coshx.scooplayoutexample.screens.StrawberryScreen;

import butterknife.OnClick;

/**
 * FooterController
 * <p/>
 */
public class FooterController extends BaseController {

    @Override
    protected int layoutId() {
        return R.layout.footer;
    }

    @OnClick(R.id.footer_pistachio)
    public void onPistachio() {
        router.goTo(new PistachioScreen());
    }

    @OnClick(R.id.footer_strawberry)
    public void onStrawberry() {
        router.goTo(new StrawberryScreen());
    }

    @OnClick(R.id.footer_pineapple)
    public void onPineapple() {
        router.goTo(new PineappleScreen());
    }
}
