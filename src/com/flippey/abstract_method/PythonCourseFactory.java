package com.flippey.abstract_method;

/**
 * @author flippey
 * @create 2019-03-19 14:48
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
