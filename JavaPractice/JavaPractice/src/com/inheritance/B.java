package com.inheritance;

public class B extends A {

    public B(int x, int y) {
        super(x, y);
    }

    public void add() {
        int x = 40 + super.x;
        System.out.println(x + super.y);
    }

}
