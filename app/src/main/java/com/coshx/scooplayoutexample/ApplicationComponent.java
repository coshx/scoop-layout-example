package com.coshx.scooplayoutexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ApplicationComponent
 * <p/>
 */
@Singleton
@Component(modules = {

})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
