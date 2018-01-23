package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What Is Your Starting Unit:");
        System.out.println("[F]ahrenheit");
        System.out.println("[C]elsius");
        System.out.println("[K]elvin");

        String startingUnit = input.nextLine().toUpperCase();

        System.out.println("What Is Your New Unit:");
        System.out.println("[F]ahrenheit");
        System.out.println("[C]elsius");
        System.out.println("[K]elvin");

        String newUnit = input.nextLine().toUpperCase();

        System.out.println("What is the temp?");

        double temp = input.nextDouble();

        TemperatureConverter converter = new TemperatureConverter(startingUnit, newUnit);

        if (newUnit.equals("F")) {
            System.out.println(converter.converter(temp) + " degrees Fahrenheit");
        } else if (newUnit.equals("C")) {
            System.out.println(converter.converter(temp) + " degrees Celsius");
        } else if (newUnit.equals("K")) {
            System.out.println(converter.converter(temp) + " degrees Kelvin");
        }


    }
}
