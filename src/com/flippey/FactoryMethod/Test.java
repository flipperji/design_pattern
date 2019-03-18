package com.flippey.FactoryMethod;

/**
 * @author flippey
 * @create 2019-03-18 17:06
 * 工厂方法模式
 * 抽象工厂、具体工厂、抽象产品、具体产品
 */
public class Test {

    public static void main(String[] args) {
        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.creatVideo();
        video.produce();
    }
}
