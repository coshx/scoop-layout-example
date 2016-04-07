package com.coshx.scooplayoutexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.coshx.scooplayoutexample.routers.IRouter;
import com.coshx.scooplayoutexample.screens.LandingScreen;
import com.lyft.scoop.Scoop;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    private Scoop rootScoop;

    @Inject
    @Named("main")
    IRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoopLayoutExampleApplication.getApplicationComponent().inject(this);
        rootScoop = new Scoop.Builder("root").build();
        rootScoop.inflate(R.layout.root, (ViewGroup) findViewById(R.id.main), true);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (!router.hasActiveScreen()) {
            router.goTo(new LandingScreen());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        rootScoop.destroy();
    }

    @Override
    public void onBackPressed() {
        if (!router.goBack()) {
            super.onBackPressed();
        }
    }
}
