package com.flippey.abstract_method;

/**
 * @author flippey
 * @create 2019-03-19 14:46
 * 抽象工厂模式
 * 产品族、产品等级概念
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();


        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        Video video1 = pythonCourseFactory.getVideo();
        Article article1 = pythonCourseFactory.getArticle();
        video1.produce();
        article1.produce();
    }
}
