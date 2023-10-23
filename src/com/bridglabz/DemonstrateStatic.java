package com.bridglabz;

public class DemonstrateStatic {
    static int staticVar = 0;

    static {
        System.out.println("Static block is executed.");
        staticVar = 10;
    }

    static void staticMethod() {
        System.out.println("Static method is called.");
        System.out.println("staticVar: " + staticVar);
    }

    public static void main() {
        System.out.println("staticVar in main: " + staticVar);
        staticMethod();
    }
}
