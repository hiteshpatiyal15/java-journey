package com.student.management.system.demo;

public class Person {

    String name;
    int age;

    public Person() {
        System.out.println("Default constructor called");
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("Another constructor called");
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
