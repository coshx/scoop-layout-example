package com.coshx.scooplayoutexample;

import android.view.View;

import com.lyft.scoop.ViewBinder;

import butterknife.ButterKnife;

/**
 * ButterKnifeViewBinder
 * <p/>
 */
public class ButterKnifeViewBinder implements ViewBinder {
    @Override
    public void bind(Object object, View view) {
        ButterKnife.bind(object, view);
    }

    @Override
    public void unbind(Object object) {
        ButterKnife.unbind(object);
    }
}
