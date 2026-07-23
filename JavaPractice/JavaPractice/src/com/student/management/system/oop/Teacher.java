package com.student.management.system.oop;

public class Teacher extends Person {
    private String professionalDetails;
    private String employeeID;
    private String subject;
    private int yearsOfExperience;
    private static double salary;
    private static final double BASE_SALARY = 30000.0; // constant marks with final keyword
    private static final double EXPERIENCE_BONUS = 2000;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;
        }
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if (validateContactNumber(contactNumber)) {
            this.contactNumber = contactNumber;
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (validateAddress(address)) {
            this.address = address;
        }
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

    public Teacher(String name, int age, String contactNumber, String address, String professionalDetails,
            String employeeID, String subject, int yearsOfExperience) {
        super(name, age, address, contactNumber);
        if (validateAge(age) && validateEmployeeID(employeeID) && validateYearsOfExperience(yearsOfExperience)
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

    private boolean validateName(String name) {
        try {
            if (name != null && !name.trim().isEmpty()) {
                return true;
            } else {
                System.err.println("Invalid Name: " + name);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating name.");
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

    private boolean validateAddress(String address) {
        try {
            if (address != null && !address.trim().isEmpty()) {
                return true;
            } else {
                System.err.println("Invalid Address: " + address);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating address.");
            return false;
        }
    }

    private boolean validateContactNumber(String contactNumber) {
        try {
            if (contactNumber != null && !contactNumber.trim().isEmpty() && contactNumber.matches("\\d{10}")) {
                return true;
            } else {
                System.err.println("Invalid Contact Number: " + contactNumber);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error occurred while validating contact number.");
            return false;
        }
    }

    private boolean validateAge(int age) {
        try {
            if (age != 0 && age > 0) {
                return true;
            } else {
                System.err.println("Invalid Age: " + age);
                return false;
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid Age: " + age);
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
