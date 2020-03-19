package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<DemoApp> demoApps = new ArrayList<>();

    public void addDemoApp(DemoApp demoApp) {
        demoApps.add(demoApp);
    }

    public int countDemoApps() {
        return demoApps.size();
    }
}
