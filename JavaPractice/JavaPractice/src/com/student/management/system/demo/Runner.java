package com.student.management.system.demo;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person("Hitesh", 29);
        Person p2 = new Person(p1);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
