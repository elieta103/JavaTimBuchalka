package com.elhg.pojos;

public class Sum3And5Main {
    public static void main(String[] args) {
        int sum=0;
        int value =0;
        int count = 0;
        for(int i=1; i<=1000 && count <=5; i++){
            value = sum3And5(i);
            if(value != 0){
                sum = sum + value;
                System.out.print(value+" ");
                count ++;
            }
        }
        System.out.println("");
        System.out.println("The sum is : "+sum);
    }

    private static int sum3And5 (int number){
        if(number%3==0 && number%5==0){
            return number;
        }
        return  0;
    }
}
