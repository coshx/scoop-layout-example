package com.coshx.scooplayoutexample;

import android.app.Application;

import com.lyft.scoop.Scoop;

/**
 * ScoopLayoutExampleApplication
 * <p/>
 */
public class ScoopLayoutExampleApplication extends Application {
    private static ScoopLayoutExampleApplication instance;
    private        ApplicationComponent          applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        Scoop.setViewBinder(new ButterKnifeViewBinder());
        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return instance.applicationComponent;
    }
}
