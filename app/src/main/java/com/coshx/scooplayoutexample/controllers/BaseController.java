package com.coshx.scooplayoutexample.controllers;

import com.coshx.scooplayoutexample.ScoopLayoutExampleApplication;
import com.coshx.scooplayoutexample.routers.IRouter;
import com.lyft.scoop.ViewController;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * BaseController
 * <p/>
 */
public abstract class BaseController extends ViewController {

    @Inject
    @Named("main")
    IRouter router;

    @Override
    public void onAttach() {
        super.onAttach();

        ScoopLayoutExampleApplication.getApplicationComponent().inject(this);
    }
}
