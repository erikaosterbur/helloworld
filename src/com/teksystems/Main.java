package com.teksystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 10;
        double b = 10.5;
        String s = "hello world";

        double radius = 0;
        double area = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius: ");
        radius = input.nextDouble();

        area = radius * radius * 3.14159;

        System.out.println("the area for the circle of radius "
                + radius + " is " + area);

        System.out.println("the area for the circle of radius "
                + radius + " is " + area);

    }
}
