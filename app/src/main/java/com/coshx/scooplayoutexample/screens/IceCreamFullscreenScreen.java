package com.coshx.scooplayoutexample.screens;

import com.coshx.scooplayoutexample.controllers.IceCreamFullscreenController;
import com.lyft.scoop.Controller;
import com.lyft.scoop.Screen;

/**
 * IceCreamFullscreenScreen
 * <p/>
 */
@Controller(IceCreamFullscreenController.class)
public class IceCreamFullscreenScreen extends Screen {
    public int colorId;

    public IceCreamFullscreenScreen(int colorId) {
        this.colorId = colorId;
    }
}
