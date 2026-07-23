package com.student.management.system.oop;

public class Teacher extends Person {
    private String professionalDetails;
    private String employeeID;
    private String subject;
    private int yearsOfExperience;
    private static double salary;

    public Teacher(String name, int age, String contactNumber, String professionalDetails, String address,
            String employeeID, String subject,
            int yearsOfExperience) {
        super(name, age, address, contactNumber);
        if (validateEmployeeID(employeeID) && validateYearsOfExperience(yearsOfExperience)
                && validateSubject(subject)) {
            this.professionalDetails = professionalDetails;
            this.employeeID = employeeID;
            this.subject = subject;
            this.yearsOfExperience = yearsOfExperience;
            calculateSalary();
        } else {
            System.out.println("Invalid input provided for teacher details.");
        }
    }

    private static final double BASE_SALARY = 30000.0; // constant marks with final keyword
    private static final double EXPERIENCE_BONUS = 2000;

    public double getSalary() {
        return salary;
    }

    public String getProfessionalDetails() {
        return professionalDetails;
    }

    public void setProfessionalDetails(String professionalDetails) {
        this.professionalDetails = professionalDetails;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (validateEmployeeID(employeeID)) {
            this.employeeID = employeeID;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (validateSubject(subject)) {
            this.subject = subject;
        }
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (validateYearsOfExperience(yearsOfExperience)) {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    private void calculateSalary() {
        salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);
    }

    private boolean validateSubject(String subject) {
        try {
            if (subject != null && !subject.trim().isEmpty()) {
                return true;
            } else {
                System.err.println("Invalid Subject: " + subject);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating subject.");
            return false;
        }
    }

    private boolean validateYearsOfExperience(int yearsOfExperience) {
        try {
            if (yearsOfExperience >= 0 && yearsOfExperience <= 35) {
                return true;
            } else {
                System.err.println("Invalid Years of Experience: " + yearsOfExperience);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating years of experience.");
            return false;
        }
    }

    private boolean validateEmployeeID(String employeeID) {
        try {
            if (employeeID != null && !employeeID.trim().isEmpty() && employeeID.matches("T\\d{3}")) {
                return true;
            } else {
                System.err.println("Invalid Employee ID: " + employeeID);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating employee ID.");
            return false;
        }
    }

    public void displayTeacherInformation() {
        System.out.println("------------------Teacher Information------------------");
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
        System.out.println("Professional Details: " + professionalDetails);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Salary: $ " + salary);
        System.out.println("==========================================================");
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
                + ", professionalDetails=" + professionalDetails + ", employeeID=" + employeeID + ", subject=" + subject
                + ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary + "]";
    }

}
