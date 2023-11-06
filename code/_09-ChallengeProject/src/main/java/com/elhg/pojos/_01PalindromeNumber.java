package com.elhg.pojos;
/*
 To validate is a number is palindrome, calcule the reverse.
 If reversea and number are equals, the number is palindromer.
isPalindrome(-1221); should return true
isPalindrome(707);   should return true
isPalindrome(11212); should return false

 Example : 1221
lastDigit                               reverse = (reverse*10) + (number%10)
1221 % 10 = 1   1221 / 10 = 122         10*0   + 1 = 1
122 % 10 = 2    122 / 10 = 12           10*1   + 2 = 12
12 % 10 = 2     12 / 10 = 1             10*12  + 2 = 122
1 % 10 = 1      1 / 10 = 0              10*122 + 1 = 1221


 */

public class _01PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }


    public static boolean isPalindrome(int number){
        boolean response = false;
        int numberOriginal = 0;
        int reverse = 0;
        if(number < 0){
            number = number * -1;
            numberOriginal = number;
        }
        numberOriginal = number;
        while (number > 0){
            reverse = (reverse*10) + (number%10);
            number = number / 10;
        }
        if(numberOriginal==reverse){
            response = true;
        }
        return response;
    }

}