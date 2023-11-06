package com.elhg.pojos;

import java.util.Scanner;

public class MaxMinUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0.0D;
        double min = 0.0D;
        boolean valid = true;
        do{
            System.out.println("Enter a number : ");
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if(value > max){
                    max = value;
                } else {
                    min = value;
                }
                System.out.println("Max : "+max+" Min : "+min);
            }catch (NumberFormatException ex){
                System.out.println("Invalid number");
                valid = false;
            }
        }while(valid);

    }
}
