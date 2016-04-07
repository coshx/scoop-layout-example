package com.coshx.scooplayoutexample;

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
}
