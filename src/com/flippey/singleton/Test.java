package com.flippey.singleton;

/**
 * @author flippey
 * @create 2019-03-21 10:32
 * 单例模式
 */
public class Test {

    public static void main(String[] args) {
        test_lazy_singleton();
    }

    private static void test_lazy_singleton() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
