package com.yefan.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        EnumIvoryTower enumIvoryTower = EnumIvoryTower.INSTANCE;
        logger.info("enumIvoryTower1={}", enumIvoryTower);
    }

}
