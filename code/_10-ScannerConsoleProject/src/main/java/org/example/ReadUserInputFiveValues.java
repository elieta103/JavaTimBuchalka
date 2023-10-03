package org.example;

import java.util.Scanner;

public class ReadUserInputFiveValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countValidNumbers = 1;
        double sum = 0.0D;
        do{
            System.out.println("Enter number "+countValidNumbers+"x: ");
            try {
                double value = Double.parseDouble(scanner.nextLine());
                countValidNumbers++;
                sum += value;
            }catch (NumberFormatException ex){
                System.out.println("Invalid number");
            }
        }while(countValidNumbers<=5);
        System.out.println("Sum 5 numbers :"+sum);
    }
}
