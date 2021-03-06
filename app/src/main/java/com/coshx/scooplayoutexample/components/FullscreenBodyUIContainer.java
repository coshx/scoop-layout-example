package com.coshx.scooplayoutexample.components;

import android.content.Context;
import android.util.AttributeSet;

import com.coshx.scooplayoutexample.ScoopLayoutExampleApplication;
import com.coshx.scooplayoutexample.routers.IRouter;
import com.coshx.scooplayoutexample.routers.IRouterScoopChangedObserver;
import com.lyft.scoop.RouteChange;
import com.lyft.scoop.UiContainer;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * FullscreenBodyUIContainer
 * <p/>
 */
public class FullscreenBodyUIContainer extends UiContainer {
    private IRouterScoopChangedObserver observer;

    @Inject
    @Named("fullscreenBody")
    IRouter router;

    public FullscreenBodyUIContainer(Context context, AttributeSet attrs) {
        super(context, attrs);

        ScoopLayoutExampleApplication.getApplicationComponent().inject(this);
        this.observer = new IRouterScoopChangedObserver() {
            @Override
            public void onScoopChanged(RouteChange routeChange) {
                goTo(routeChange);
            }
        };
        router.observe(observer);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        router.stopObserving(observer);
    }
}

