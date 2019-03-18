package com.flippey.FactoryMethod;

/**
 * @author flippey
 * @create 2019-03-18 17:16
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video creatVideo() {
        return new PythonVideo();
    }
}
