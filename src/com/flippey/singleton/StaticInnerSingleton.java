package com.flippey.singleton;

/**
 * @author flippey
 * @create 2019-03-21 11:17
 * 基于静态内部类的单例模式
 * 不会出现重排序问题 Class对象的初始化锁
 */
public class StaticInnerSingleton {

    private static class Inner {
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }

    private StaticInnerSingleton() {

    }

    public static StaticInnerSingleton getInstance() {
        return Inner.staticInnerSingleton;
    }
}
