package com.student.management.system.oop;

public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student("Hitesh", 20, "R555", 89.5, 90.5, 85, "A+", "8282828282", "123 Main St Mumbai");
        s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateGrade();
        s1.displayStudentInfo();

        Teacher t1 = new Teacher("John Doe", "35", "1234567890", "Mumbai", "Java", "T123",
                "Mathematics", 10);
        t1.displayTeacherInformation();
    }
}
