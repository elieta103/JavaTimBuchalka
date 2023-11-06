package com.elhg.pojos;

public class PrimeNumberMain {
    public static void main(String[] args) {
        for (int i =0; i<=20; i++){
            System.out.println(i+" "+(isPrime(i) ? " is ":" NOT is")+ " prime number");
        }
    }

    public static  boolean isPrime (int wholeNumber){
        if(wholeNumber <=2){
            return wholeNumber==2; // Only 2 is prime
        }
        for(int divisor = 2 ; divisor<=(wholeNumber/2); divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }
}
