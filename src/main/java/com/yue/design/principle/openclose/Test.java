package com.yue.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(96, "From beginning to Senior", 348d);
        JavaDiscountCourse course = (JavaDiscountCourse) javaCourse;
        System.out.println("Course id: " + course.getId() + ", " + "Course name: " + course.getName() +
                "Course origin price: " + course.getOriginPrice()
                + "Course price: " + course.getPrice());
    }
}
