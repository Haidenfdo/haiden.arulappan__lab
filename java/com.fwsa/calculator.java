package com.fwsa;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = in.nextInt();
        System.out.println("Enter second number:");
        b = in.nextInt();
        System.out.println(a + "+" + b + "=" + Add(a, b));
        System.out.println(a + "-" + b + "=" + sub(a, b));
        System.out.println(a + "*" + b + "=" + multiply(a, b));
        System.out.println(a + "/" + b + "=" + divide(a, b));

    }

    public static int Add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

}
