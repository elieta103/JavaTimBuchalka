package com.elhg.pojos;
/*
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
otherwise, it should return false.

EXAMPLE INPUT/OUTPUT:
hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
 */
public class _05LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if(!isValid(n1) || !isValid(n2) || !isValid(n3)){
            return false;
        }
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        int lastDigit3 = n3 % 10;

        if(lastDigit1==lastDigit2 || lastDigit2==lastDigit3 || lastDigit3==lastDigit1){
            return true;
        }else{
            return false;
        }


    }
    public static boolean isValid(int number){
        return number>=10 && number<=1000;
    }
}
