package com.student.management.system.oop;

public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student("Hitesh", 29, 55, 89.5, 90.5, 85, "A+");
        s1.setAge(29);
        s1.setGrade("A+");
        s1.setName("Hitesh");
        s1.setMarksObtainedInEnglish(90);
        s1.setMarksObtainedInMaths(88);
        s1.setMarksObtainedInScience(95);
        s1.setRollNumber(-123);
        // System.out.println(s1.toString());

        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getMarksObtainedInEnglish());
        System.out.println(s1.getMarksObtainedInMaths());
        System.out.println(s1.getMarksObtainedInScience());
        System.out.println(s1.getGrade());
        s1.calculateTotalMarks();
    }
}
