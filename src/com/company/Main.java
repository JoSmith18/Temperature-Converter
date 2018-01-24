package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input ->");
        String input1 = (input.next());
        double temp = Double.valueOf(input1.substring(0, input1.length() - 1));
        String startingUnit = Character.toString(input1.charAt(input1.length() - 1)).toUpperCase();
        input.next();
        String newUnit = input.next().toUpperCase();
        TemperatureConverter converter = new TemperatureConverter(startingUnit, newUnit);
        if (newUnit.equals("F")) {
            System.out.println("Output -> " + converter.converter(temp) + "F");
        } else if (newUnit.equals("C")) {
            System.out.println("Output -> " + converter.converter(temp) + "C");
        } else if (newUnit.equals("K")) {
            System.out.println("Output -> " + converter.converter(temp) + "K");
        }


    }
}
