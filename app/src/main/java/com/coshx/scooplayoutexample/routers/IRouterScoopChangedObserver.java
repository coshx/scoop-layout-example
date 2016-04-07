package com.coshx.scooplayoutexample.routers;

import com.lyft.scoop.RouteChange;

/**
 * IRouterScoopChangedObserver
 * <p/>
 */
public interface IRouterScoopChangedObserver {
    void onScoopChanged(RouteChange routeChange);
}
