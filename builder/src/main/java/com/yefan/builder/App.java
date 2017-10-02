package com.yefan.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Hero hero = new Hero.Builder("Jack", "Riobard").withHairColor("Black").build();
        logger.info(hero.toString());
    }
}
