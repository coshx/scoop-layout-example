package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.R;
import com.lyft.scoop.ViewController;

import butterknife.OnClick;

/**
 * FooterController
 * <p/>
 */
public class FooterController extends ViewController {

    @Override
    protected int layoutId() {
        return R.layout.footer;
    }

    @OnClick(R.id.footer_pistachio)
    public void onPistachio() {

    }

    @OnClick(R.id.footer_strawberry)
    public void onStrawberry() {

    }

    @OnClick(R.id.footer_pineapple)
    public void onPineapple() {

    }
}
