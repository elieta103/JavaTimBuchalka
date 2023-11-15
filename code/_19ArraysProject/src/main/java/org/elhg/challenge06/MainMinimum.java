package org.elhg.challenge06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainMinimum {
    public static void main(String[] args) {
        Integer[] arrayNumbers = readIntegers();
        System.out.println("Min Value : " + findMin(arrayNumbers));
    }

    private static Integer[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas : ");
        String numbers = scanner.nextLine();
        Integer[] arrayNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toList()).toArray(Integer[]::new);

        return arrayNumbers;
    }

    private static int findMin(Integer[] arrayNumbers) {
        int aux = Integer.MAX_VALUE;
        for (Integer i : arrayNumbers) {
            aux = (i < aux) ? i : aux;
        }
        return aux;
    }
}
