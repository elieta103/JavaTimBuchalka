package com.elhg.pojos;

public class FeetInchesToCentimetersMain {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(6,0));
    }

    public static double convertToCentimeters(int inches){
        return 2.54 * inches;
    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet*12) + inches);
    }
}