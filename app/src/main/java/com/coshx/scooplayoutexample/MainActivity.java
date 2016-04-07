package com.coshx.scooplayoutexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.lyft.scoop.Scoop;

public class MainActivity extends AppCompatActivity {

    private Scoop rootScoop;

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
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        rootScoop.destroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
