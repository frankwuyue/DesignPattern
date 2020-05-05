package com.yue.design.principle.dependencyinversion;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Study java course");
    }
}
