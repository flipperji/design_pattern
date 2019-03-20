package com.flippey.builder;

/**
 * @author flippey
 * @create 2019-03-20 11:05
 * 建造者模式
 * 常用写法 Builder静态内部类、最后build的时候创建Course对象
 */
public class Test {
    public static void main(String[] args) {
        // write your code here
        Course course = new Course.CourseBuilder()
                .setCourseName("Java课程")
                .setCourseArticle("Java课程手记")
                .setCourseVideo("Java视频")
                .setCourseQuestion("Java问答")
                .build();
        System.out.println(course);
    }
}
