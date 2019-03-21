package com.flippey.singleton;

/**
 * @author flippey
 * @create 2019-03-21 10:31
 * 懒汉式单例
 * 隐患：多线程情况下，会出现多次创建对象的情况
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private volatile static LazySingleton doubleCheckLazySingleton = null;

    private LazySingleton() {

    }

    /**
     * 初始版
     * @return
     */
    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 改进版
     * doublecheck双重检查 + volatile关键字
     * synchronized关键字是防止多个线程同时执行一段代码，容易影响程序执行效率
     * volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这个新值对其他线程来说是立即可见的
     * @return
     */
    public static LazySingleton getDoubleCheckLazySingletonInstance() {
        if (doubleCheckLazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (doubleCheckLazySingleton == null) {
                    doubleCheckLazySingleton = new LazySingleton();
                    // 多线程情况下 不加volatile关键字 会出现重排序问题 2、3顺序可能会倒置
                    //1、分配堆存给这个对象
                    //2、初始化对象
                    //3、设置doubleCheckLazySingleton 指向刚分配的内存地址
                    //4、初次访问对象
                }
            }
        }
        return doubleCheckLazySingleton;
    }
}
