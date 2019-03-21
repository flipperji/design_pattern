package com.flippey.singleton;

/**
 * @author flippey
 * @create 2019-03-21 11:42
 * 饿汉式 类加载时就初始化
 */
public class HungrySingleton {
    //final 可以不加
    private static final HungrySingleton mHungrySingleton;

    static {
        mHungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {

    }
    public static HungrySingleton getInstance() {
        return mHungrySingleton;
    }
}
