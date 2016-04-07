package com.coshx.scooplayoutexample;

import android.app.Application;

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

        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return instance.applicationComponent;
    }
}
