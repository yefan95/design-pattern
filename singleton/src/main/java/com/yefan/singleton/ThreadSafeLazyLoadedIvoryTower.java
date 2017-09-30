package com.yefan.singleton;

public class ThreadSafeLazyLoadedIvoryTower {

    private static ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }


}
