package com.flippey.abstract_method;

/**
 * @author flippey
 * @create 2019-03-19 14:46
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
