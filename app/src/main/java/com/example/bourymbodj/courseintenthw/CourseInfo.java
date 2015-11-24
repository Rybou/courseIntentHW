package com.example.bourymbodj.courseintenthw;

/**
 * Created by bourymbodj on 15-11-24.
 */
public class CourseInfo {
    private String courseName;
    private String mentor;

    public CourseInfo() {
        courseName= "Name";
        mentor= "Mentor";

    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setMentor (String mentor) {
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }
}



