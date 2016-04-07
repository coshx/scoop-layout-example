package com.coshx.scooplayoutexample.routers;

import com.coshx.scooplayoutexample.ScoopLayoutExampleApplication;
import com.coshx.scooplayoutexample.screens.fullscreen.HideFullscreenScreen;
import com.coshx.scooplayoutexample.screens.fullscreen.InitFullscreenScreen;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ScreenScooper;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * FullscreenRouter
 * <p/>
 */
public class FullscreenRouter extends BaseRouter {

    @Inject
    @Named("fullscreenBody")
    IRouter bodyRouter;

    FullscreenRouter(ScreenScooper screenScooper) {
        super(screenScooper);
        ScoopLayoutExampleApplication.getApplicationComponent().inject(this);
    }

    @Override
    public void goTo(Screen screen) {
        super.goTo(new InitFullscreenScreen());
        bodyRouter.goTo(screen);
    }

    @Override
    public boolean goBack() {
        if (bodyRouter.goBack()) {
            return true;
        }

        super.goBack();
        replaceWith(new HideFullscreenScreen());
        return false;
    }
}
