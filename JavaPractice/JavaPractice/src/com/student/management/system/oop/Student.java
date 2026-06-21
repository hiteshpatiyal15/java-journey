package com.student.management.system.oop;

public class Student {
    // Properties of class (Instance variable)
    private String name;
    private int age;
    private int rollNumber;
    private double marksObtainedInEnglish;
    private double marksObtainedInMaths;
    private double marksObtainedInScience;
    private String grade;

    public Student(String name, int age, int rollNumber, double marksObtainedInEnglish, double marksObtainedInMaths,
            double marksObtainedInScience, String grade) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.marksObtainedInEnglish = marksObtainedInEnglish;
        this.marksObtainedInMaths = marksObtainedInMaths;
        this.marksObtainedInScience = marksObtainedInScience;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 21 && age >= 10)
            this.age = age;
        else
            System.out.println("Invalid Age");
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber >= 1)
            this.rollNumber = rollNumber;
        else
            System.out.println("Invalid Roll Number");
    }

    public double getMarksObtainedInEnglish() {
        return marksObtainedInEnglish;
    }

    public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
        if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish < 100)
            this.marksObtainedInEnglish = marksObtainedInEnglish;
        else
            System.out.println("Invalid Marks For English");
    }

    public double getMarksObtainedInMaths() {
        return marksObtainedInMaths;
    }

    public void setMarksObtainedInMaths(double marksObtainedInMaths) {
        if (marksObtainedInMaths >= 0 && marksObtainedInMaths < 100)
            this.marksObtainedInMaths = marksObtainedInMaths;
        else
            System.out.println("Invalid Marks For Maths");
    }

    public double getMarksObtainedInScience() {
        return marksObtainedInScience;
    }

    public void setMarksObtainedInScience(double marksObtainedInScience) {
        if (marksObtainedInScience >= 0 && marksObtainedInScience < 100)
            this.marksObtainedInScience = marksObtainedInScience;
        else
            System.out.println("Invalid Marks For Science");
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void calculateTotalMarks() {
        double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
        System.out.println(totalMarks);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
                + marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
                + ", marksObtainedInScience=" + marksObtainedInScience + ", grade=" + grade + "]";
    }

}