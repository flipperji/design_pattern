package com.flippey.factory_method;

/**
 * @author flippey
 * @create 2019-03-18 17:17
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video creatVideo() {
        return new JavaVideo();
    }
}
