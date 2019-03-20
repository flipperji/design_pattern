package com.flippey.builder;

/**
 * @author flippey
 * @create 2019-03-20 10:57
 */
public class Course {
    private String mCourseName;
    private String mCourseVideo;
    private String mCourseArticle;
    private String mCourseQuestion;

    public Course(CourseBuilder courseBuilder) {
        this.mCourseName = courseBuilder.courseName;
        this.mCourseVideo = courseBuilder.courseVideo;
        this.mCourseArticle = courseBuilder.courseArticle;
        this.mCourseQuestion = courseBuilder.courseQuestion;
    }

    @Override
    public String toString() {
        return "Course{" +
                "mCourseName='" + mCourseName + '\'' +
                ", mCourseVideo='" + mCourseVideo + '\'' +
                ", mCourseArticle='" + mCourseArticle + '\'' +
                ", mCourseQuestion='" + mCourseQuestion + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String courseName;
        private String courseVideo;
        private String courseArticle;
        private String courseQuestion;


        public CourseBuilder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder setCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder setCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder setCourseQuestion(String courseQuestion) {
            this.courseQuestion = courseQuestion;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}

