package com.student.management.system.oop;

public class Student extends Person {
    // Properties of class (Instance variable)
    private String rollNumber;
    private double marksObtainedInEnglish;
    private double marksObtainedInMaths;
    private double marksObtainedInScience;
    private String grade;

    public Student(String name, int age, String rollNumber, double marksObtainedInEnglish, double marksObtainedInMaths,
            double marksObtainedInScience, String grade, String contactNumber, String address) {
        super(name, age, address, contactNumber);
        if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
                && validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)) {
            this.rollNumber = rollNumber;
            this.marksObtainedInEnglish = marksObtainedInEnglish;
            this.marksObtainedInMaths = marksObtainedInMaths;
            this.marksObtainedInScience = marksObtainedInScience;
            this.grade = grade;
        } else {
            System.out.println("Invalid input provided for student details.");
        }
    }

    private boolean validateMarks(double marksObtainedInEnglish2) {
        try {
            if (marksObtainedInEnglish2 >= 0 && marksObtainedInEnglish2 <= 100) {
                return true;
            } else {
                System.err.println("Invalid Marks: " + marksObtainedInEnglish2);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating marks.");
            return false;
        }
    }

    private boolean validateRollNumber(String rollNumber) {
        try {
            if (rollNumber != null && !rollNumber.trim().isEmpty() && rollNumber.matches("R\\d{3}")) {
                return true;
            } else {
                System.err.println("Invalid Roll Number: " + rollNumber);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating roll number.");
            return false;
        }
    }

    private boolean validateAge(int age2) {
        try {
            if (age2 >= 10 && age2 <= 21) {
                return true;
            } else {
                System.err.println("Invalid Age: " + age2);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating age.");
            return false;
        }
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
            System.err.println("Invalid Age");
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        if (validateRollNumber(rollNumber))
            this.rollNumber = rollNumber;
        else
            System.err.println("Invalid Roll Number");
    }

    public double getMarksObtainedInEnglish() {
        return marksObtainedInEnglish;
    }

    public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
        if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish < 100)
            this.marksObtainedInEnglish = marksObtainedInEnglish;
        else
            System.err.println("Invalid Marks For English");
    }

    public double getMarksObtainedInMaths() {
        return marksObtainedInMaths;
    }

    public void setMarksObtainedInMaths(double marksObtainedInMaths) {
        if (marksObtainedInMaths >= 0 && marksObtainedInMaths < 100)
            this.marksObtainedInMaths = marksObtainedInMaths;
        else
            System.err.println("Invalid Marks For Maths");
    }

    public double getMarksObtainedInScience() {
        return marksObtainedInScience;
    }

    public void setMarksObtainedInScience(double marksObtainedInScience) {
        if (marksObtainedInScience >= 0 && marksObtainedInScience < 100)
            this.marksObtainedInScience = marksObtainedInScience;
        else
            System.err.println("Invalid Marks For Science");
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void calculateTotalMarks() {
        double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
        System.err.println(totalMarks);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", contactNumber="
                + contactNumber + ", Address=" + address + ", marksObtainedInEnglish=" + marksObtainedInEnglish
                + ", marksObtainedInMaths=" + marksObtainedInMaths + ", marksObtainedInScience="
                + marksObtainedInScience + ", grade=" + grade + "]";
    }

    public void calculatePercentage() {
        try {
            double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
            double percentage = Math.round((totalMarks / 300) * 100);
            System.out.println("Percentage: " + percentage + "%");
        } catch (Exception e) {
            System.err.println("Error occurred while calculating percentage.");
        }
    }

    public void calculateGrade() {
        try {
            double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
            double percentage = Math.round((totalMarks / 300) * 100);

            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 70) {
                grade = "A";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
        } catch (Exception e) {
            System.err.println("Error occurred while calculating grade.");
        }
    }

    public void displayStudentInfo() {
        System.out.println("------------------Student Information------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
        System.out.println("Marks Obtained in English: " + marksObtainedInEnglish);
        System.out.println("Marks Obtained in Maths: " + marksObtainedInMaths);
        System.out.println("Marks Obtained in Science: " + marksObtainedInScience);
        System.out.println("Grade: " + grade);
        System.out.println("======================================================");
    }
}
