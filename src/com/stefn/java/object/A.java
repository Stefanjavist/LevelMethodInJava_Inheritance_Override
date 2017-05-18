package com.stefn.java.object;

public class A {

    public static int a =12;
    public int b =12;

    public static void main(String... args) {
        final A a1 = new A();
        final A a2 = new A();
        A.a=-12;
        a2.b=-12;
        System.out.println(a1.b);
        System.out.println(A.a);
    }
}
