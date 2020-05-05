package com.yue.design.principle.dependencyinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Study Front end course");
    }
}
