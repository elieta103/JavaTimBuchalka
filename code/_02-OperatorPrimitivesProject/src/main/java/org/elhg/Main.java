package org.elhg;

public class Main {
    public static void main(String[] args) {
        double myFirstDouble = 20.00D;
        double mySecondDouble = 80.00D;
        double operation = (myFirstDouble + mySecondDouble) * 100.00D;
        System.out.println("Resultado operation : " + operation);
        double reminder = operation % 40.00D;
        System.out.println("Resultado reminder : " + reminder);
        boolean isZero = reminder == 0.00D;
        System.out.println("isZero : " + isZero);
        if (!isZero) {
            System.out.println("Got some reminder !");
        }
    }
}