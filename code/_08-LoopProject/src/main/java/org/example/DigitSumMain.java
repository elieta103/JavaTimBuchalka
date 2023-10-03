package org.example;

public class DigitSumMain {
    public static void main(String[] args) {
        System.out.println(sumDigits(1241));
        System.out.println(sumDigits(10000));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(111));

    }

    public static final int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int remainder = 0;
        int division = 0;
        do {
            division = number / 10;
            remainder = number % 10;
            if (division == 0) {
                sum = sum + (division + remainder);
            } else {
                sum = sum + remainder;
            }
            number = division;
        } while (division > 0);
        return sum;
    }

}
