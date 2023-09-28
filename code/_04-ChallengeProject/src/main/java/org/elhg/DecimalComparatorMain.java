package org.elhg;

public class DecimalComparatorMain {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        boolean response = false;
        int n1 = new Double(number1*1000).intValue();
        int n2 = new Double(number2*1000).intValue();
        if (n1 == n2){
            response = true;
        }
        return response;
    }
}