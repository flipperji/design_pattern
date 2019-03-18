package com.flippey.FactoryMethod;

/**
 * @author flippey
 * @create 2019-03-18 17:06
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("Python视频录制");
    }
}
