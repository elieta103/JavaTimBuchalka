package org.example;
/*
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.

getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
getEvenDigitSum(-22);
 */
public class _03EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static  int getEvenDigitSum (int number){
        int sumEven = 0;
        int digit  = 0;
        if(number < 0){
            return -1;
        }
        while (number > 0){
            digit = number % 10;
            if(digit%2==0){
                sumEven = sumEven + digit;
            }
            number = number / 10;
        }

        return sumEven;
    }
}
