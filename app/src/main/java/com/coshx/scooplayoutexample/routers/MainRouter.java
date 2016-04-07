package com.coshx.scooplayoutexample.routers;

import com.coshx.scooplayoutexample.ScoopLayoutExampleApplication;
import com.coshx.scooplayoutexample.screens.IceCreamFullscreenScreen;
import com.coshx.scooplayoutexample.screens.LandingScreen;
import com.coshx.scooplayoutexample.screens.PineappleScreen;
import com.coshx.scooplayoutexample.screens.PistachioScreen;
import com.coshx.scooplayoutexample.screens.StrawberryScreen;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ScreenScooper;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * MainRouter
 * <p/>
 */
public class MainRouter extends BaseRouter {

    private boolean isInFullscreen;

    @Inject
    @Named("page")
    IRouter pageRouter;

    @Inject
    @Named("fullscreen")
    IRouter fullscreenRouter;

    MainRouter(ScreenScooper screenScooper) {
        super(screenScooper);

        ScoopLayoutExampleApplication.getApplicationComponent().inject(this);

        isInFullscreen = false;
    }

    @Override
    public void goTo(Screen screen) {
        if (screen instanceof LandingScreen) {
            super.goTo(screen);
            pageRouter.goTo(new PistachioScreen());
        } else if (screen instanceof PistachioScreen
                   || screen instanceof StrawberryScreen
                   || screen instanceof PineappleScreen) {
            pageRouter.goTo(screen);
        } else if (screen instanceof IceCreamFullscreenScreen) {
            isInFullscreen = true;
            fullscreenRouter.goTo(screen);
        }
    }

    @Override
    public boolean goBack() {
        if (isInFullscreen) {
            if (fullscreenRouter.goBack()) {
                return true;
            }
            isInFullscreen = false;
            return pageRouter.hasActiveScreen();
        } else {
            if (pageRouter.goBack()) {
                return true;
            }

            return super.goBack();
        }
    }
}
