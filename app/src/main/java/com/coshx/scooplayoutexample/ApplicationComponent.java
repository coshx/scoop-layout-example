package com.coshx.scooplayoutexample;

import com.coshx.scooplayoutexample.components.FullscreenBodyUIContainer;
import com.coshx.scooplayoutexample.components.FullscreenUIContainer;
import com.coshx.scooplayoutexample.components.MainUIContainer;
import com.coshx.scooplayoutexample.components.PageBodyUIContainer;
import com.coshx.scooplayoutexample.components.PageFooterUIContainer;
import com.coshx.scooplayoutexample.components.PageUIContainer;
import com.coshx.scooplayoutexample.controllers.BaseController;
import com.coshx.scooplayoutexample.routers.RouterModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ApplicationComponent
 * <p/>
 */
@Singleton
@Component(modules = {
    RouterModule.class
})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseController controller);

    // UiContainers
    void inject(MainUIContainer container);

    void inject(PageUIContainer container);

    void inject(FullscreenUIContainer container);

    void inject(PageBodyUIContainer container);

    void inject(PageFooterUIContainer container);

    void inject(FullscreenBodyUIContainer container);
}
