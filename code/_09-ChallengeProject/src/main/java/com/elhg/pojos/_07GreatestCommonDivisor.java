package com.elhg.pojos;

/*
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully
divide each of the integers (i.e. without leaving a remainder).


For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

EXAMPLE INPUT/OUTPUT:
getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
 */


public class _07GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int n1, int n2){
        if(n1 < 10 || n2 <10){
            return -1;
        }
        int factor =0;
        for(int i=1; i<=n1; i++){
            if(n1 % i == 0) {
                for (int j=1; j<=n2; j++){
                    if((n2 % j == 0) && (i==j)) {
                        factor = j;
                        continue;
                    }
                }
            }
        }
        return  factor;
    }


}
