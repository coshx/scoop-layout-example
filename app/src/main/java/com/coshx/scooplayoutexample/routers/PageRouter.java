package com.coshx.scooplayoutexample.routers;

import com.coshx.scooplayoutexample.ScoopLayoutExampleApplication;
import com.coshx.scooplayoutexample.screens.footer.FooterScreen;
import com.coshx.scooplayoutexample.screens.page.InitPageScreen;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ScreenScooper;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * PageRouter
 * <p/>
 */
public class PageRouter extends BaseRouter {

    @Inject
    @Named("pageBody")
    IRouter bodyRouter;

    @Inject
    @Named("pageFooter")
    IRouter footerRouter;

    PageRouter(ScreenScooper screenScooper) {
        super(screenScooper);
        ScoopLayoutExampleApplication.getApplicationComponent().inject(this);
    }

    @Override
    public void goTo(Screen screen) {
        super.goTo(new InitPageScreen());

        // Intercept here body events and send custom ones to footer if needed
        bodyRouter.goTo(screen);
        footerRouter.goTo(new FooterScreen());
    }

    @Override
    public boolean goBack() {
        footerRouter.goBack();
        if (bodyRouter.goBack()) {
            return true;
        }

        return super.goBack();
    }
}
