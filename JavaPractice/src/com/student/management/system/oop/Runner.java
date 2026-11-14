package com.student.management.system.oop;

public class Runner {
        public static void main(String[] args) {
                Person s1 = new Student("Hitesh", 20, "8282828282", "123 Main St Mumbai", "R123", 89.5, 90.5, 85);
                ((Student) s1).calculateTotalMarks();
                ((Student) s1).calculatePercentage();
                ((Student) s1).calculateGrade();
                ((Student) s1).displayStudentInfo();
                ((Student) s1).updateInformation(true, "9999955555", "Karwalo Nagar");

                Person t1 = new Teacher("John Doe", 35, "9291929292", "Java", "Mumbai", "T123",
                                "Mathematics", 10);
                ((Teacher) t1).displayTeacherInformation();
                ((Teacher) t1).updateInformation(true, "6532891101", "Vasant Vihar, Thane");

        }
}
