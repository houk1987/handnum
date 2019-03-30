package com.nc.handnummatch;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Required> requiredList = new LinkedList<>();
        HandNumManager handNumManager = new HandNumManager();
        for (Required required : requiredList) {
            required.match(handNumManager.getTyHandNum());
            required.match(handNumManager.getZyHandNum());
        }
    }
}
