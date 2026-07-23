package com.student.management.system.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    protected String name;
    protected int age;
    protected String address;
    protected String contactNumber;

    public Person() {
        System.out.println("Default constructor called");
    }

    public Person(String name, int age, String address, String contactNumber) {
        if (validateContactNumber(contactNumber) && validateAddress(address) && validateName(name)) {
            this.name = name;
            this.age = age;
            this.contactNumber = contactNumber;
            this.address = address;
        }

    }

    private boolean validateName(String name) {
        if (!name.equals("") && !name.isEmpty() && name != null) {
            return true;
        } else {
            System.err.println("Invalid name provided!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
                + "]";
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
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private boolean validateContactNumber(String contactNumber) {
        try {
            Pattern pattern = Pattern.compile("\\d{10}"); // Regular expression to match 10 digits
            Matcher matcher = pattern.matcher(contactNumber);
            if (matcher.matches()) {
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

}
