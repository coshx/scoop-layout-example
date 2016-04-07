package com.coshx.scooplayoutexample.routers;

import com.lyft.scoop.Screen;

import java.util.List;

/**
 * IRouter
 * <p/>
 */
public interface IRouter extends IObservableRouter {
    boolean hasActiveScreen();

    void goTo(Screen screen);

    void replaceWith(Screen nextScreen);

    void replaceAllWith(List<Screen> screens);

    void resetTo(Screen screen);

    boolean goBack();
}
