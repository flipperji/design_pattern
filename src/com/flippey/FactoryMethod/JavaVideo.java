package com.flippey.FactoryMethod;

/**
 * @author flippey
 * @create 2019-03-18 17:05
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("JavaVideo视频录制");
    }
}
