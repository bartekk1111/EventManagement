package com.codecool.events;

import java.util.Random;

public enum RequestTypes {
    COCKTAIL,
    WEDDING_CAKE,
    GOODIE_BAG;

    public static RequestTypes randomRequestType() {
        RequestTypes[] requests = RequestTypes.values();
        return requests[new Random().nextInt(0, requests.length)];
    }
}
